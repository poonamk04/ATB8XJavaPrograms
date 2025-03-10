package March.ex_10032025;

public class Lab167 {
    public static void main(String[] args)
    {
        //multiple exception handling
        int c = 0;
        try
        {
            int c1= 10/c;
            String num = null;

            num.trim();
            System.out.println(c1);
            //System.out.println(t1);
        } catch (ArithmeticException e )
        {
            System.out.println(e);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        System.out.println("end......");
    }

}
