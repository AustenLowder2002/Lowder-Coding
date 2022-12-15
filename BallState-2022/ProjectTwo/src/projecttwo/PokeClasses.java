package projecttwo;

import java.util.Scanner;

public class PokeClasses {
    private Scanner input = new Scanner(System.in);
    private Scanner newInput = new Scanner(System.in);
    int x = 0;
    private String name = "base";
    private int hitPoints = 0;
    private String move = "base";
    private int movePower = 0;
    private int attackSpeed = 0;

    public PokeClasses(int x, String name, String move, int hitPoints, int movePower, int attackSpeed) {
        new PokemonSelection(x);
    }


    public void displayPokeStats() {
        System.out.println("----------------");
        System.out.println("Name: " + name);
        System.out.println("Hit Points: " + hitPoints);
        System.out.println("Move: " + move);
        System.out.println("Move Power: " + movePower);
        System.out.println("Attack Speed: " + attackSpeed);

    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public String getMove() {
        return move;
    }

    public void setMove(String newMove) {
        this.move = newMove;
    }

    public int getmovePower() {
        return movePower;
    }

    public void setmovePower(int newMovePower) {
        this.movePower = newMovePower;
    }

    public int getAttackSpeed() {
        return attackSpeed;
    }

    public void setAttackSpeed(int newAttackSpeed) {
        this.attackSpeed = newAttackSpeed;
    }

    public class PokemonSelection {
        public PokemonSelection(int x) {
          PokeClasses Pokemon1 = assignPokemon(1);
          PokeClasses Pokemon2 = assignPokemon(2);
        }

        public void createPokemon() {
                System.out.println("Please enter Pokemon's name: ");
                name = newInput.nextLine();
                System.out.println("Please enter Pokemon's move: ");
                move = newInput.nextLine();
                System.out.println("Please enter Pokemon's hit points: ");
                hitPoints = Integer.parseInt(String.valueOf(input.nextInt()));
                System.out.println("Please enter Pokemon's move power: ");
                movePower = Integer.parseInt(String.valueOf(input.nextInt()));
                System.out.println("Please enter Pokemon's attack speed: ");
                attackSpeed = Integer.parseInt(String.valueOf(input.nextInt()));
        }

        public PokeClasses assignPokemon(int x) {
                System.out.println("Player" + " " + x + " " + "Select a pokemon and enter its stats");
                createPokemon();
                System.out.println("Player" + " " + x + " " + "Pokemon");
                displayPokeStats();
            return null;
        }
    }
}

