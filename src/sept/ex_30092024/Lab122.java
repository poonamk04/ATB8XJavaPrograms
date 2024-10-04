package sept.ex_30092024;

public class Lab122 {
    public static void main(String[] args) {
        //2. without parameter but with return type
        Namef();
        String name = Namef();
        System.out.println(name);
        //3.with parameter but without return type
        f3("Poonam");
        //4. with parameter and with return type
       int result= f4(3,8);
        System.out.println(result);


    }

    //2. without parameter but with return type
    public static String Namef()
    {
        System.out.println("Without parameter but with return type");
        return "Poonam";
    }
    //3. with parameter but without return type
    public static void f3(String Name)
    {
        System.out.println("with parameter but without return type");
        System.out.println("Poonam Here");
    }
    //4. with parameter and with return type
    public static int f4(int a,int b)
    {
        System.out.println("with parameter and with return type");
        return a+b;
    }
}
