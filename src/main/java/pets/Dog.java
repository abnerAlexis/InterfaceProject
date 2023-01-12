package pets;

public class Dog implements Pet {
    String name;
    String color;
    int age;
    int numberOfLegs;

    public Dog(String name, String color, int age, int numberOfLegs) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.numberOfLegs = numberOfLegs;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public int getAge() {
        return this.age;
    }

    @Override
    public int getNumberOfLegs() {
        return this.numberOfLegs;
    }

    @Override
    public void hasTail() {
        System.out.println(this.name + " has a tail.");
    }

    @Override
    public void makeSound() {
        System.out.println(this.name + " says Woof!");
    }
}
