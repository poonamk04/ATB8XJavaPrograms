package sept.ex_18092024;

public class Lab050 {
    public static void main(String[] args) {
        //type casting
        //widening
        //narrowing

        //widening
        byte b = 10;
        int a = b; // valid - implicit casting - JVM
        int a1 = (int)b ; // valid - explicit casting - JVM

        //Narrowing
        int val = 300;
       // byte b1 = val; // Invalid - implicit casting - JVM
        byte b2 = (byte)val; //invalid Explicit casting - loss of data
    }
}
