import java.util.ArrayList;

public class forLoopArray3 {
    //Use 1 loop and if-else to find the sum of even & odd number(This assingment has issues)
    public static void main(String[] args) {
        int even_Sum=0, odd_Sum=0,count,i=0;
        int[] numbers={2,4,6,9,12,15,18,21,24,27};
        count=numbers.length;
        ArrayList<Integer> evenNumber=new ArrayList<>();
        ArrayList<Integer> oddNumber=new ArrayList<>();
        while (i<=count)
        {
            if(numbers[i] % 2 == 0)
            {
                even_Sum+=numbers[i];
                evenNumber.add(numbers[i]);
                System.out.println("Even number is: "+numbers[i]);
            }
            else {
                odd_Sum+=numbers[i];
                oddNumber.add(numbers[i]);
                System.out.println("Odd number is: "+numbers[i]);
            }
            i++;
        }
        System.out.println("The Sum of Even Numbers: " + even_Sum);
        System.out.println("The Sum of Odd Numbers: " + odd_Sum);
    }
}
