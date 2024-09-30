package sept.ex_23092024;

public class Lab079 {
    public static void main(String[] args) {
        //web automation
        //ask user which browser you want to run the code
        String browser = "Safari";
        switch (browser)
        {
            case "Chrome":
                System.out.println("Starting the Chrome browser");
                break;
            case "Firefox":
                System.out.println("Starting the firefox browser");
                break;
            case "Edge":
                System.out.println("Starting the edge browser");
                break;
            default:
                System.out.println("I have no idea which browser is this???");
                break;
        }

    }
}
