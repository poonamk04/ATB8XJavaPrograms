package Task;

import java.util.Scanner;

public class Task_02032025 {
    public static void main(String[] args) {
        //count length of string without using string length function

        String Name;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name : ");
        Name = sc.nextLine();
        System.out.println(Name.lastIndexOf(""));

        System.out.println(Name.toCharArray().length);

    }


}
