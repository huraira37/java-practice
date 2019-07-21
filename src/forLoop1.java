public class forLoop1 {

    //Use 2 loop to find the sum of even & odd number

    public static void main(String[] args) {
        int even_Sum=0;
        int odd_Sum=0;
        //int limit=100;
        for(int i=2; i<=100;i=i+2)
        {
            even_Sum+=i;
            System.out.println("Even number "+i);
        }
        for(int j=1;j<=100;j=j+2)
        {
            odd_Sum+=j;
            System.out.println("Odd number "+j);
        }
        System.out.println("Even sums are "+even_Sum);
        System.out.println("Odd sums are "+odd_Sum);
    }
}
