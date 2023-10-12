package lesson5.templates;

public class Car {
    // fields/attributes
    public int year;
    public String model;
    public double engine;
    private Owner carsOwner;

    // constructor overloading - перегрузка конструкторов

    // constructor 1
    public Car(int theYear, String theModel, double theEngine) {
        this.year = theYear;
        this.model = theModel;
        this.engine = theEngine;
    }

    // constructor 2
    public Car(int theYear, String theModel, int theEngine) {
        this.year = theYear;
        this.model = theModel;
        this.engine = theEngine;
    }


    // constructor 3
    public Car(String theModel, int theYear, double theEngine) {
        this.year = theYear;
        this.model = theModel;
        this.engine = theEngine;
    }

    // constructor 4
    public Car(int year, String model) {
        this.year = year;
        this.model = model;
    }

    // default constructor 5
    public Car() {
    }

    public Owner getCarsOwner() {
        return carsOwner;
    }

    public void setCarsOwner(Owner carsOwner) {
        this.carsOwner = carsOwner;
    }

    public void drive() {
        System.out.println("Car " + this.model + " is driving");
    }

    public void drive(String city) {
        System.out.println("Car " + this.model + " is driving to " + city);
    }

    public void makeSignal(int numberOfTimes) {
        System.out.println("Car " + this.model);
        for (int i = 1; i <= numberOfTimes; i++) {
            System.out.println("BEEEEP");
        }
    }
}
