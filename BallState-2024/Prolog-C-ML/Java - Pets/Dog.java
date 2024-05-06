import java.util.Random;

public class Dog implements Pet {
    private String name;
    private String petType = "Dog";
    private String[] sounds = {"bark", "woof", "growl"};
    private Random randomGenerator;

    public Dog(String name) {
        this.name = name;
        this.randomGenerator = new Random();
    }

    public String getName() {
        return this.name;
    }

    public String getType() {
        return this.petType;
    }

    public String getSound() {
        int index = this.randomGenerator.nextInt(sounds.length);
        return this.sounds[index];
    }
}
