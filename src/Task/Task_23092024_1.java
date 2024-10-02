package Task;

public class Task_23092024_1 {
    public static void main(String[] args) {
        //calculator using switch
        int num1= 20;
        int num2=10;
        int operation = 6;
        switch (operation)
        {
            case 1:
            {
                int Add = num1+num2;
                System.out.println(Add);
                break;
            }
            case 2:
            {
               int Sub = num1-num2;
                System.out.println(Sub);
                break;
            }
            case 3:
            {
                int Div = num1/num2;
                System.out.println(Div);
                break;
            }
            case 4:
            {
               int  Mul = num1*num2;
                System.out.println(Mul);
                break;
            }
            case 5:
            {
                int Mod = num1%num2;
                System.out.println(Mod);
                break;
            }
            default:
                System.out.println("Enter valid opeartion:");
                break;

        }
    }
}
