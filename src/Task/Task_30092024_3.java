package Task;

import java.util.Scanner;

public class Task_30092024_3 {
    public static void main(String[] args) {
        //count vowels and const in the string
        int vCount=0;
        int cCount=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Name :");
        String name = sc.nextLine();
        for(int i=0;i<name.length();i++)
        {
            if (name.charAt(i)== 'a' || name.charAt(i) =='i' || name.charAt(i)=='o'||name.charAt(i)=='e'||name.charAt(i)=='u')
            {
                vCount++;
            } else if (name.charAt(i)>'a' && name.charAt(i)<='z')
            {
                cCount++;
            }
        }
        System.out.println(vCount);
        System.out.println(cCount);
    }
}
