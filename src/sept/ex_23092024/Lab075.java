package sept.ex_23092024;

public class Lab075 {
    public static void main(String[] args) {
        //switch condition
        //days 1 to 7
        int day = 8;
        switch (day)
        {
            case 1:
                System.out.println("mon");
                break;
            case 2:
                System.out.println("tue");
                break;
            case 3:
                System.out.println("wed");
                break;
            case 4:
                System.out.println("thur");
                break;
            case 5:
                System.out.println("fri");
                break;
            case 6:
                System.out.println("sat");
                break;
            case 7:
                System.out.println("sun");
                break;

            default:
                System.out.println("Entered wrong day");
                break;

        }
        System.out.println("oopsssss exited from loop");
    }
}
