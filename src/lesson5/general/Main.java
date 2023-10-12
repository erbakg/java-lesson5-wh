package lesson5.general;


import lesson5.templates.Car;
import lesson5.templates.Owner;

public class Main {
    public static void main(String[] args) {

        int number = 9;
        Car myCar = new Car(2020, "BMW X7", 3.5);
        System.out.println(number);
        System.out.println(myCar);
        System.out.println("Info about my car:\n" +
                "YEAR: " + myCar.year + " MODEL: " + myCar.model + " ENGINE: " + myCar.engine);
        myCar.engine = 4.2;
        System.out.println("New info about my car:\n" +
                "YEAR: " + myCar.year + " MODEL: " + myCar.model + " ENGINE: " + myCar.engine);

        Car bestCar = new Car(2019, "Toyota Camry", 2.5);
        System.out.println("Info about best car:\n" +
                "YEAR: " + bestCar.year + " MODEL: " + bestCar.model + " ENGINE: " + bestCar.engine);

        Car friendsCar = new Car(2000, "Nissan X-Trail");
        System.out.println("Info about friend's car:\n" +
                "YEAR: " + friendsCar.year + " MODEL: " + friendsCar.model + " ENGINE: " + friendsCar.engine);
        // friendsCar.engine = 2.0;

        Car someCar = new Car(2008, "Honda Civic", 2);
        System.out.println("Info about some car:\n" +
                "YEAR: " + someCar.year + " MODEL: " + someCar.model + " ENGINE: " + someCar.engine);

        Car emptyCar = new Car();

        myCar.drive();
        myCar.drive("Osh");
        friendsCar.drive("Kant");
        friendsCar.makeSignal(4);

        Owner me = new Owner("John Brown", 25);
        //    a  = b
        System.out.println("FULL NAME: " + me.getFullName() + " AGE: " + me.getAge()
                + " BIRTH YEAR: " + me.calculateBirthYear());
        me.setAge(-35);
        System.out.println("FULL NAME: " + me.getFullName() + " AGE: " + me.getAge()
                + " BIRTH YEAR: " + me.calculateBirthYear());

        myCar.setCarsOwner(me);
        bestCar.setCarsOwner(me);
        friendsCar.setCarsOwner(new Owner("Jim Wilson", 40));

        System.out.println("Info about friend's car:\n" +
                "YEAR: " + friendsCar.year + " MODEL: " + friendsCar.model + " ENGINE: " + friendsCar.engine +
                " OWNER: " + friendsCar.getCarsOwner().getFullName() + " " + friendsCar.getCarsOwner().getAge() + " years old.");
    }
}
