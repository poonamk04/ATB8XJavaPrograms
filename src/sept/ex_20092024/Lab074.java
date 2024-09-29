package sept.ex_20092024;

public class Lab074 {
    public static void main(String[] args) {
        //grade calculator
        int score = 89;
        char grade ='F';
        if (score >= 90 && score <=100)
        {
            grade = 'A';
           // System.out.println('A');
        }
        else if (score >= 80 && score <=89)
        {
            grade ='B';
           // System.out.println('B');
        }
        else if (score>=70 && score <=79)
        {
           grade='C';
            //System.out.println('C');
        }
        else if (score>=60 && score <=69)
        {
            grade ='D';
            //System.out.println('D');
        }
        else
        {
            grade ='F';
        }
        System.out.println("Your grade is ->" + grade);

    }
}
