package pets;

import java.util.Random;

public class Alien implements Pet{
    Random random = new Random();

    @Override
    public String getName() {
        String name = "";
        char[] chars = "eiautakemiluyszxeiuwaze".toCharArray();
        for (int i = 0; i < 5; i++) {
            name += chars[random.nextInt(chars.length)];
        }
        return name;
    }

    @Override
    public String getColor() {
        String[] colors = {"Blue", "Purple", "Yellow", "Green", "Red"};
        return colors[random.nextInt(colors.length)];
    }

    @Override
    public int getAge() {
        return random.nextInt(2600);
    }

    @Override
    public int getNumberOfLegs() {
        return random.nextInt(20);
    }

    @Override
    public void hasTail() {
        System.out.println(getName() + " has no tail.");
    }

    @Override
    public void makeSound() {
        String sound = "";
        char[] chars = "anclimveyxwzbhtpqogu".toCharArray();
        for (int i = 0; i < 15; i++) {
            sound += chars[random.nextInt(chars.length)];
        }
        System.out.println(getName() + " says " + sound);
    }
}
