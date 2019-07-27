import java.util.Random;
//Create a two dimensional array to hold 10 students 5 class test number.
//(use random number generator to generate class test numbers 0-25)
//Find out the class test avg mark for each student.
public class towDimentionalArray {
    public static void main(String[] args){
        int row=10,column=5;
        double avg, sum=0,counter;
        Random numbers = new Random();
        int[][] studentMarks = new int[row][column];
        counter=studentMarks.length;
        for (row = 0; row <studentMarks.length; row++)//iterates through student elements
        {
            for (column = 0; column<studentMarks[row].length; column++) //iterates through test value elements
            {
                studentMarks[row][column] = numbers.nextInt(25);
                //System.out.println("Students & their test Value: "+row+" = "+column);
            }
        }
        for (row = 0; row <studentMarks.length; row++){
                System.out.println("Student "+row+":");
            for (column = 0; column <studentMarks[row].length; column++){
                System.out.println("Class test number: "+column+"="+studentMarks[row][column]);
                sum+= studentMarks[row][column];
                avg=sum/counter;
                System.out.println("Test averege = "+avg);
            }
            System.out.println("\n");
        }
    }
}

