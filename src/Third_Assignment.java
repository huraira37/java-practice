import java.util.Scanner;
public class Third_Assignment {
    //Take two string tell which one in long
    public static void main(String[] args) {
        Scanner getInput = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String FName = getInput.next();
        System.out.println(FName.length());
        System.out.print("Enter your last name: ");
        String LName = getInput.next();
        System.out.println(LName.length());
        String longString;
        longString = (FName.length() > LName.length()) ? FName : LName;
        System.out.printf("The largest number is "+longString);

    }
}