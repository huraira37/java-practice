import java.util.ArrayList;

public class forLoopArray3 {
    //Use 1 loop and if-else to find the sum of even & odd number
    public static void main(String[] args) {
        int even_Sum=0, odd_Sum=0,count;
        int[] numbers={2,5,6,9,12,15,18,21,24,27};
        count=numbers.length;
        ArrayList<Integer> evenNumber=new ArrayList<>();
        ArrayList<Integer> oddNumber=new ArrayList<>();
        for(int i=0; i<=count;i++)
        {
            if(numbers[i] % 2 == 0)
            {
                even_Sum+=numbers[i];
                evenNumber.add(numbers[i]);
                System.out.println("Even number "+numbers[i]);
            }
            else {
                odd_Sum+=i;
                oddNumber.add(numbers[i]);
                System.out.println("Odd number "+i);
            }

        }
        System.out.println("The Sum of Even Numbers upto "+count+" = " + even_Sum);
        System.out.println("The Sum of Odd Numbers upto "+count+" = " + odd_Sum);
    }
}
