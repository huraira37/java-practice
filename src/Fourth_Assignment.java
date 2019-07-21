import java.util.Scanner;
// Update the current exercise with user input.
public class Fourth_Assignment {
        public static void main(String[] args) {
            Scanner userInput = new Scanner(System.in);
            System.out.print("Enter a number: ");
            double n1 = userInput.nextDouble();
            System.out.print("Enter a number for n2 ");
            double n2 = userInput.nextDouble();
            System.out.print("Enter a number for n3 ");
            double n3 = userInput.nextDouble();
            double largestNumber;
            if (n1 >= n2) {
                if (n1 >= n3) {
                    largestNumber = n1;
                } else {
                    largestNumber = n3;
                }
            } else {
                if (n2 >= n3) {
                    largestNumber = n2;
                }else {
                    largestNumber=n3;
                }
            }
            System.out.println("Largest number is " + largestNumber);
        }
    }


