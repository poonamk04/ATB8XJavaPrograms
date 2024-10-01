package sept.ex_25092024;

public class Lab097 {
    public static void main(String[] args) {
        final boolean b1=true;
        for (int i = 0;b1;i++) //valid syntax will go to infinite loop
        {
            System.out.println("hello");
        }
    }
}
