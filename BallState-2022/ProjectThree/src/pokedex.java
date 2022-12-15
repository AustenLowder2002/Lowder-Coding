import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;

public class pokedex {
    private ArrayList<ArrayList<ArrayList<String>>> poke_list = new ArrayList<>();
    private int x;
    private Scanner console = new Scanner(System.in);
    private Random random = new Random();


    public void add_pokemon(){

        try {
            System.out.println("How many Pokemon do you want or q to quit?");
            int n = console.nextInt();
            for(int i = 0; n > i; i++){
                poke_list.add(pokemon.pokemon_creator());
            }

            } catch (InputMismatchException e) {
                System.out.println("Program exited: ");
                System.exit(0);

            }

    }

    public ArrayList<ArrayList<String>> select_pokemon(int x){
        ArrayList<ArrayList<String>> selected_pokemon = new ArrayList<ArrayList<String>>();
        selected_pokemon = poke_list.get(x - 1);
        return selected_pokemon;
    }

    public ArrayList<ArrayList<String>> random_pokemon(int x){
        ArrayList<ArrayList<String>> selected_pokemon = new ArrayList<ArrayList<String>>();
        int y = random.nextInt(1, poke_list.size());
        System.out.println(y);
        if(y == x){
            if(y >= poke_list.size()){
                y = 1;
            }else{
                y = y + 1;
            }
        }
        selected_pokemon = poke_list.get(y - 1);
        return selected_pokemon;
    }

    public ArrayList<ArrayList<ArrayList<String>>> get_poke_list(){
        ArrayList<ArrayList<ArrayList<String>>> returned_list = new ArrayList<ArrayList<ArrayList<String>>>();
        returned_list = poke_list;
        return returned_list;
    }
}
