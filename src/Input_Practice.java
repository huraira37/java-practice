import javax.imageio.IIOException;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.DataInputStream;
public class Input_Practice{
    public static void main(String args[]) {

        Scanner getInput = new Scanner(System.in);
        System.out.print("Enter the Zip Code: ");
        int Zip_Code = getInput.nextInt();
        System.out.println("Zip_Code is " + Zip_Code);
        //getInput.close();

        System.out.print("Please enter your name : ");
        String s = getInput.next(); // getting a String value
        System.out.println("My name is "+s);

        System.out.print("Please enter your age : ");
        int i = getInput.nextInt(); // getting an integer
        System.out.println("Age is " +i);

        System.out.print("Please enter your salary : ");
        double d = getInput.nextDouble(); // getting a double
        System.out.println("salary is " +d);

        
    }

}
