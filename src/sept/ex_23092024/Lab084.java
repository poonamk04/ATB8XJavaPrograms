package sept.ex_23092024;

public class Lab084 {
    public static void main(String[] args) {
        //-> used to replace break keyword
        int itemcode = 001;
        switch (itemcode)
        {
            case 001 -> System.out.println("it is laptop");
            case 002 -> System.out.println("it is mobile");
            case 003 -> System.out.println("it is desktop");
            default -> System.out.println("none");
        }
    }
}
