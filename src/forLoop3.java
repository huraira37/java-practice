import java.util.Scanner;
public class forLoop3 {
//Use 1 loop and if-else to find the sum of even & odd number
    public static void main(String[] args) {
        int number=30, even_Sum=0, odd_Sum=0;
        for(int i=1; i<=number;i++)
        {
            if(i % 2 == 0)
            {
                even_Sum+=i;
                System.out.println("Even number "+i);
            }
            else {
                odd_Sum+=i;
                System.out.println("Odd number "+i);
            }

        }
        System.out.println("The Sum of Even Numbers upto "+number+" = " + even_Sum);
        System.out.println("The Sum of Odd Numbers upto "+number+" = " + odd_Sum);
    }
}
