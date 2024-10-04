package Task;

import java.util.Scanner;

public class Task_30092024_1 {
    public static void main(String[] args) {
        //factorial no
        int i=1;
        int fact=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int no = sc.nextInt();
        for(i=1;i<=no;i++)
        {
            fact=fact*i;
        }
        System.out.println(fact);
    }
}
