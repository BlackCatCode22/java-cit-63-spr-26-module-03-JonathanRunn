package mystuff;

public class MyStuff {
    String model;
    int fuelLevel;

    public MyStuff(String model) {
        this.model = model;
        this.fuelLevel = 100;
    }

    public void drive() {
        fuelLevel -= 10;
        System.out.println("Driving the " + model + ". Fuel is now " + fuelLevel + "%");
    }
}