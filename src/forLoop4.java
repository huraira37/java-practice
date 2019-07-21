public class forLoop4 {
    //- Use 1 loop and switch case to find the sum of even & odd number
    public static void main(String[] args) {
        int evenSum = 0, oddSum = 0;
        for (int i = 1; i <= 20; i++) { //Start of the loop
            int evenCheck = i%2;
            switch (evenCheck) {
                case 0: //In case of even number
                    evenSum+=i;
                    break;
                case 1: //In case of odd number
                    oddSum+=i;
                    break;
            }
        } // end of loop
        System.out.println(evenSum + " is odd number ");
        System.out.println(oddSum + " is the even number ");
    }
}
