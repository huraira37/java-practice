import java.util.ArrayList;
import java.util.Scanner;

public class forLoopArray2 {
    //take user input to set the range of loop
    public static void main(String[] args) {

        int even_Sum=0,odd_Sum=0,count;
        double avg;
        String anyWord;
        Scanner getInput = new Scanner(System.in);
        System.out.print("Enter any word for even and odd numbers: ");
        anyWord=getInput.next();
        int[] userInput={23,12,90,34,87,45,60,2,6,3,2,56,90,54,87};
        count=userInput.length;
        ArrayList<Integer> evenNumber=new ArrayList<>();
        ArrayList<Integer> oddNumber=new ArrayList<>();
        for(int i=0; i<count;++i)
        {
            if(userInput[i]%2==0)
            {   even_Sum+=userInput[i];
                evenNumber.add(userInput[i]);
                System.out.println(userInput[i]);
            }else
            {
                oddNumber.add(userInput[i]);
            }
        }
        System.out.println("Please see the above list for even numbers");
        System.out.println("The sum of even numbers are "+even_Sum);
        for(int j=0;j<count;++j)
        {
            if(userInput[j]%2!=0)
            {   odd_Sum+=userInput[j];
                oddNumber.add(userInput[j]);
                System.out.println(userInput[j]);
            }else
            {
                evenNumber.add(userInput[j]);
            }
        }
        System.out.println("Please see the above list for odd numbers");
        System.out.println("The sum of odd numbers are "+odd_Sum);
        avg=((double)even_Sum/(double)count);
        System.out.println("Average even number is "+avg);
        avg=((double)odd_Sum/(double)count);
        System.out.println("Average odd number is "+avg);
    }
}

