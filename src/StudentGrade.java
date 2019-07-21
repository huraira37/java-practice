import java.util.Scanner;
public class StudentGrade
{
    public static void main(String[] args)
    {
        showGrade();
    }

     static void showGrade(){

        float quiz_scores, mid_term_scores, final_scores,Average;
        Scanner getInput=new Scanner(System.in);
        System.out.print("Quiz scores: ");
        quiz_scores=getInput.nextFloat();
        System.out.print("Mid term scores: ");
        mid_term_scores=getInput.nextFloat();
        System.out.print("Final scores: ");
        final_scores=getInput.nextFloat();
        Average=(quiz_scores+mid_term_scores+final_scores)/3;
        System.out.println("Average score: "+Average);

        if(Average>=90)
            System.out.println("Grade = A");
        else if((Average>=70) & (Average<90))
            System.out.println("Grade = B");
        else if((Average>=50) & (Average<70))
            System.out.println("Grade = C");
        else if(Average<50)
            System.out.println("Grade = F");
        else
            System.out.println("Grade score is invalid");
    }
}

//The program will read three types of scores(quiz, mid-term, and final scores)
// and determine the grade based on the following rules:
// -if the average score >=90% =>grade=A -if the average score >= 70% and <90% => grade=B
// -if the average score>=50% and <70% =>grade=C -if the average score<50% =>grade=F
// See the example output below:  Quiz score: 80  Mid-term score: 68  Final score: 90
// Your grade is B.