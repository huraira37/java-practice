
import java.util.Scanner;
public class First_Assignment {
//Take two input and compare then tell which one is greater number
    public static void main(String args[])
    {
        Scanner getInput = new Scanner(System.in);
        System.out.print("Please enter first number: ");
        int number1 = getInput.nextInt();
        //System.out.println("First number is "+number1);
        System.out.print("Please enter second number: ");
        int number2 = getInput.nextInt();
        //System.out.println("Second number is "+number2);
        int largestNumber=(number1>number2)?number1:number2;
        //System.out.println(largestNumber);
        System.out.printf("The largest number is "+largestNumber );
    }
}
