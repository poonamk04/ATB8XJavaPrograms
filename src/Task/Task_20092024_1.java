package Task;

public class Task_20092024_1 {
    //triangle classifier
    public static void main(String[] args) {
        int side1 = 10;
        int side2 = 15;
        int side3 = 20;
        if (side1 == side2 && side2 == side3 && side3==side1)
        {
            System.out.println("Triangle is equilateral");
        } else if (side1 == side2 || side2 == side3 || side3==side1)
        {
            System.out.println("Triangle is isosceles");
        }
        else
        {
            System.out.println("Triangle is scalene");
        }
    }
}
