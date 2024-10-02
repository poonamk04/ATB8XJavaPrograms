package Task;

import java.util.Scanner;

public class Task_20092024_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:"); //100
        int number = sc.nextInt();
        for (int i = 1; i<=100;i++)
        {
            if (i%3==0 && i%5==0)
            {
                System.out.println("FizzBuzz");
            } else if (i%5==0)
            {
                System.out.println("Buzz");
            }
            else if (i%3==0)
            {
                System.out.println("Fizz");
            }
            else
            {
                System.out.println(i);
            }
        }
    }
}
