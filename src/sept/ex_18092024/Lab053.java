package sept.ex_18092024;

public class Lab053 {
    public static void main(String[] args) {
        //increment ++ and decrement --
        //pre
        //post
        //++pre - value is incremented first and then stored
        int a = 10;
        int b = ++a;
        System.out.println(b);
        System.out.println(a);

        //post ++ - value is stored first then increment
        int c = 10;
        System.out.println(c++);
        System.out.println(c);


    }
}
