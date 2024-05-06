import java.util.Random;

class Main {
   public static void main (String[] args) {

      Cat pet1 = new Cat("Draco");
      Cat pet2 = new Cat("Bootes");
 
      // output
      System.out.println("This is a " + pet1.getType() + ".");
      System.out.println("It is named " + pet1.getName() + ".");
      System.out.println("It says " + pet1.getSound() + "!");

      System.out.println("This is a " + pet2.getType() + ".");
      System.out.println("It is named " + pet2.getName() + ".");
      System.out.println("It says " + pet2.getSound() + "!");

      return;
   }
}

class Cat {
   // Instance variables
   private String name;
   private String petType = "Cat";
   private String sound1 = "hissss";
   private String sound2 = "purrrr";
   private Random randomGenerator;

   // Constructor
   public Cat(String name) {
      this.name = name;
      this.randomGenerator = new Random();
   }

   // Getter method for name
   public String getName() {
      return name;
   }
   public String getType(){
      return petType;
   }

   public void setPetType(){
      this.petType = petType;
   }

   public String getSound1() {
      return sound1;
   }

   public void setSound1(String sound1) {
      this.sound1 = sound1;
   }

   public String getSound2() {
      return sound2;
   }

   public void setSound2(String sound2) {
      this.sound2 = sound2;
   }

   public String getSound() {
      int randNum = randomGenerator.nextInt(10);
      if (randNum < 5) {
         return sound1;
      } else {
         return sound2;
      }
   }
}