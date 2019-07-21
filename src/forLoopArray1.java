import java.lang.reflect.Array;
import java.util.ArrayList;

public class forLoopArray1 {
    //Use 2 loop to find the sum of even & odd number

    public static void main(String[] args) {
        int even_Sum=0,odd_Sum=0,count;
        double avg;
        int[] shirts={23,12,90,34,87,45,60,2,6,3,2,56,90,54,87};
        count=shirts.length;
        ArrayList<Integer> evenNumber=new ArrayList<>();
        ArrayList<Integer> oddNumber=new ArrayList<>();
        for(int i=0; i<count;++i)
        {
            if(shirts[i]%2==0)
            {   even_Sum+=shirts[i];
                evenNumber.add(shirts[i]);
                System.out.println(shirts[i]);
            }else
                {
                    oddNumber.add(shirts[i]);
                }
        }
        System.out.println("Please see the above list for even numbers");
        System.out.println("The sum of even numbers are "+even_Sum);
        for(int j=0;j<count;++j)
        {
            if(shirts[j]%2!=0)
            {   odd_Sum+=shirts[j];
                oddNumber.add(shirts[j]);
                System.out.println(shirts[j]);
            }else
                {
                    evenNumber.add(shirts[j]);
                }
        }
        System.out.println("Please see the above list for odd numbers");
        System.out.println("The sum of odd numbers are "+odd_Sum);
        avg=((double)even_Sum/(double)count);
        System.out.println("Average number is "+avg);
    }
}
