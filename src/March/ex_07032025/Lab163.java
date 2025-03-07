package March.ex_07032025;

public class Lab163 {
    public static void main(String[] args) {
//primitive to wrapper class --boxing
        int a=10;
        Integer b = a;
        System.out.println(b);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        //unboxing wrapper to primitive
        Integer a2= 20;
        int a3= a2;
        System.out.println(a3);
    }
}