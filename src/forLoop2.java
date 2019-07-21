import java.util.Scanner;

public class forLoop2 {
    //take user input to set the range of loop
    public static void main(String[] args) {

        int even_Sum=0;
        int odd_Sum=0;
        int even_number;
        int odd_number;
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter the even number ");
        even_number=userInput.nextInt();
        for(int i=2; i<=even_number;i=i+2)
        {
            even_Sum+=i;
            System.out.println("Even number "+i);
        }
        System.out.print("Enter the odd number ");
        odd_number=userInput.nextInt();
        for(int j=1;j<=odd_number;j=j+2)
        {
           odd_Sum+=j;
           System.out.println("Odd number "+j);
        }
        System.out.println("The Sum of Even Numbers upto "+even_number+" = "+ even_Sum);
        System.out.println("The Sum of Odd Numbers upto "+odd_number+" = "+ odd_Sum);
    }
}
