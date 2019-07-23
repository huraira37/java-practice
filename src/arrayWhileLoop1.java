import java.util.ArrayList;
public class arrayWhileLoop1 {
    //Use 2 loop to find the sum of even & odd number
    public static void main(String[] args) {
        int even_Sum = 0, odd_Sum = 0;
        int[] shirts = {3, 12, 90, 34, 87, 5, 60};
        int i = 0, j = 0, count = shirts.length;
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        ArrayList<Integer> oddNumbers = new ArrayList<>();
        while (i < count) {
            if (shirts[i] % 2 == 0) {
                even_Sum += shirts[i];
                evenNumbers.add(shirts[i]);
            }
            i++;
        }
        for (int evenNumber: evenNumbers) {
            System.out.println(evenNumber);
        }
        System.out.println("The sum of even numbers are " + even_Sum);
        while (j < count) {
            if (shirts[j] % 2 != 0) {
                odd_Sum += shirts[j];
                oddNumbers.add(shirts[j]);
            }
            j++;
        }
        for (int oddNumber: oddNumbers) {
            System.out.println(oddNumber);
        }
        System.out.println("The sum of odd numbers are " + odd_Sum);
    }
}