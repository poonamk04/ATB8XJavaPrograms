package March.ex_01032025;

import java.sql.SQLOutput;

public class Lab160 {
    public static void main(String[] args) {
        String s1 = "Poonam";
        String s2 = new String("Poonam");
        String s3 = new String("Poonam");
        String s4 = "poonam";

        System.out.println(s1==s2);//== ----checks string reference location
        System.out.println(s2==s3);
        System.out.println(s1==s4);

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));
        System.out.println(s1.equalsIgnoreCase(s4));


    }
}
