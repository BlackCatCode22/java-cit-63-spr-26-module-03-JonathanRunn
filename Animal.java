package myanimals;

public class Animal {
    // Static variable: shared by all dogs and cats
    public static int numOfAnimals = 0;

    public Animal() {
        numOfAnimals++;
        // Requirement: Print the count every time an animal is created
        System.out.println("New animal created! Total count is now: " + numOfAnimals);
    }
}