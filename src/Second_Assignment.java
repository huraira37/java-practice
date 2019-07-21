import java.util.Scanner;
public class Second_Assignment {
    //Take a input string and tell us how many characters are in that string
    public static void main(String args[])
    {
        Scanner getInput = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = getInput.next();
        System.out.println("My name is " +name);
        System.out.println("My name has "+name.length()+" characters");
    }
}
