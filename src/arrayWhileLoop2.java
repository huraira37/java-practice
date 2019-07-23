import java.util.Arrays;
import java.util.Scanner;
public class arrayWhileLoop2 {
    //take user input to set the range of loop
    public static void main(String[] args) {
        int length,i=0;
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter the length ");
        length=userInput.nextInt();
        int[] number=new int[length];
        while(i<length){
            System.out.println("element at index: " + i);
            number[i]=userInput.nextInt();
            i++;
        }
        System.out.println("Input numbers are: ");
        while(i<length){
            System.out.println(number[i]);
            i++;
        }
        for (int num:number){
            System.out.println(num);
        }
    }
}