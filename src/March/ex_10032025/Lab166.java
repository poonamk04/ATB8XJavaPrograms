package March.ex_10032025;

public class Lab166 {
    public static void main(String[] args)
    {
        //try and catch block
        int c = 0;
        try
        {
            int c1= 10/c;
            System.out.println(c1);
        } catch (ArithmeticException e)
        {
            System.out.println(e);
        }
        System.out.println("end......");
    }
}
