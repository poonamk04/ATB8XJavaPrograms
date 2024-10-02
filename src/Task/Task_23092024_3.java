package Task;

public class Task_23092024_3 {
    public static void main(String[] args) {
        //km->m and c->f conversion using switch
        int input = 5;
        int choice = 1;
        switch (choice)
        {
            case 1:
                double meter = input/1.609;
                System.out.println(meter);
                break;
            case 2:
                double Fahrenheit = input*9/5+32;
                System.out.println(Fahrenheit);
                break;
            default:
                System.out.println("enter valid choice");
                break;
        }
    }
}
