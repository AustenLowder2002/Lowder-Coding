import java.util.Random;

import java.util.Random;

public class Cat implements Pet {
    private String name;
    private String petType = "Cat";
    private String[] sounds = {"hisssss", "meow", "purr"};
    private Random randomGenerator;

    public Cat(String name) {
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
