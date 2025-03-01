package Oct.ex_11102024.superkeyword;

public class Lab139 {
    //super keyword in java is a reference varibale that allows
    // a sub class (child class to reference the parent class)
    public static void main(String[] args) {
        Car c = new Car();
        
    }
}
class Car extends Vehicle
{
    private int maxSpeed = 281;
    Car()
    {
        super();
        System.out.println("DC Car");

    }

}

class Vehicle
{
    public int maxSpeed = 180;
    Vehicle()
    {
        System.out.println("DC vehicle");
    }
    Vehicle(int a)
    {
        System.out.println("PC vehicle");
    }
    void message()
    {
        System.out.println("Hello Vehicle");
    }
}