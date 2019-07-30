import javax.security.auth.Subject;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
//Create a two dimensional array to hold 10 students 5 class test number.
//(use random number generator to generate class test numbers 0-25)
//Find out the class test avg mark for each student.
public class twoDiArray2 {
    public static void main(String[] args){
        int student=10,test=5;
        double rowCounter;
        Random numbers = new Random();
        int[][] studentMarks = new int[student][test];
        rowCounter=studentMarks.length;
        double[] avgMarks=new double[student];
        double[] maxMarks=new double[student];
        //start of student mark initialization:
        for (int row = 0; row <rowCounter; row++){ //iterates through student elements
            System.out.println("Student "+row+":");
            double[] tempMarksArray=new double[student];//reinitialize tempDouble array
            double maxScore = 0;
            for (int column = 0; column<studentMarks[row].length; column++) {//iterates through test value elements
                studentMarks[row][column] = numbers.nextInt(100);
                tempMarksArray[column] = studentMarks[row][column];
                System.out.println("Class Test Number: " + row + " = " + studentMarks[row][column]);
                for (double score : tempMarksArray) {
                    if (score > maxScore)
                        maxScore = score;
                }
                maxMarks[row] = maxScore;
            }
        }
        //End of initialization.
        //Start of averege calculation.
        for (int row = 0; row <rowCounter; row++){
            double totalMark=0;
            for (int column = 0; column <studentMarks[row].length; column++){
                totalMark+= studentMarks[row][column];
            }
            avgMarks[row]=totalMark/test;
        }
        //End of averege calculation.
        //TODO Display students averege number with subject name using for each and switch case.
        int i=0;
        for (double avgNumber: avgMarks) {
            //System.out.println(avgNumber);
            switch (i) {
                case 0:
                    System.out.println("Averege number for Mike is = "+avgNumber);
                    break;
                case 1:
                    System.out.println("Averege number for Huraira is = "+avgNumber);
                    break;
                case 2:
                    System.out.println("Averege number for Andrew is = "+avgNumber);
                    break;
                case 3:
                    System.out.println("Averege number for Don is = "+avgNumber);
                    break;
                case 4:
                    System.out.println("Averege number for Matheuw is = "+avgNumber);
                    break;
                case 5:
                    System.out.println("Averege number for Brandi is = "+avgNumber);
                    break;
                case 6:
                    System.out.println("Averege number for Tajiri is = "+avgNumber);
                    break;
                case 7:
                    System.out.println("Averege number for Bhargov is = "+avgNumber);
                    break;
                case 8:
                    System.out.println("Averege number for Nidhi is = "+avgNumber);
                    break;
                case 9:
                    System.out.println("Averege number for Akangsha is = "+avgNumber);
                    break;
            }
            i++;
        }
        for (int x = 0; x<rowCounter; x++){
            System.out.println(String.format("Max Score for Student "+x+" = "+maxMarks[x]));
        }
    }
}


