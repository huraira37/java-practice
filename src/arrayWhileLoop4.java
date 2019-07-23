public class arrayWhileLoop4 {
    //- Use 1 loop and switch case to find the sum of even & odd number
    public static void main(String[] args) {
        int evenSum = 0, oddSum = 0,count,i=0;
        int[] numbers={5,8,9,34,21,22,87};
        count=numbers.length;
        while (i <count) { //Start of the loop
           int evenCheck = numbers[i]%2;
           switch (evenCheck) {
               case 0: //In case of even number
                   evenSum+=numbers[i];
                   System.out.println("Even number is: "+numbers[i]);
                   break;
               case 1: //In case of odd number
                   oddSum+=numbers[i];
                    System.out.println("Odd number is: "+numbers[i]);
                   break;
           }
           i++;
        } // end of loop
        System.out.println("The sum of even numbers are: "+evenSum);
        System.out.println("The sum of odd numbers are: "+oddSum);
    }
}
