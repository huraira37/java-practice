import java.util.ArrayList;
//problem
public class arrayWhileLoop {
    public static void main(String[] args) {
        int even_Sum = 0, odd_Sum = 0;
        int[] shirts = {23, 12, 90, 34, 87, 45, 60};
        int i = 0, j = 0, count = shirts.length;
        ArrayList<Integer> evenNumber = new ArrayList<>();
        ArrayList<Integer> oddNumber = new ArrayList<>();

        while (i<count){

            if (shirts[i] % 2 == 0) {
                even_Sum += shirts[i];
                System.out.println(shirts[i]);
                evenNumber.add(shirts[i]);
                System.out.println(i);
            }else
                oddNumber.add(shirts[i]);
        } i++;

        //System.out.println("Please see the above list for even numbers");
        //System.out.println("The sum of even numbers are " + even_Sum);

        while (j<count){
            if (shirts[j] % 2 != 0) {
                odd_Sum += shirts[j];
                oddNumber.add(shirts[j]);
                System.out.println(shirts[j]);
            } else
                evenNumber.add(shirts[j]);
        }j++;

        //System.out.println("Please see the above list for odd numbers");
        //System.out.println("The sum of odd numbers are " + odd_Sum);


    }
}