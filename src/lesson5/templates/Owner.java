package lesson5.templates;

public class Owner {
    private String fullName;
    private int age;

    public Owner(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
        this.wasBorn();
    }

    private void wasBorn(){
        System.out.println("Person " + this.fullName + " was born!");
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setAge(int newAge) {
        if (newAge < 0) {
            System.out.println("Wrong value for age attribute. It must be positive number");
        } else {
            this.age = newAge;
        }
    }

    public int getAge() {
        return this.age;
    }

    public int calculateBirthYear() {
        return 2023 - this.age;
    }
}
