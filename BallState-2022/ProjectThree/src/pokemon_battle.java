import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class pokemon_battle {
    Scanner console = new Scanner(System.in);
    Scanner input = new Scanner(System.in);
    Random random = new Random();
    pokedex Pokedex = new pokedex();
    int x;
    ArrayList<ArrayList<String>> player_pokemon = new ArrayList<ArrayList<String>>();
    ArrayList<ArrayList<String>> computer_pokemon = new ArrayList<ArrayList<String>>();
    ArrayList<String> com_move_list = new ArrayList<String>();
    ArrayList<String> player_move_list = new ArrayList<String>();
    ArrayList<String> com_power_list = new ArrayList<String>();
    ArrayList<String> player_power_list = new ArrayList<String>();
    ArrayList<String> com_info = new ArrayList<String>();
    ArrayList<String> player_info = new ArrayList<String>();
    String com_name;
    String player_name;
    int com_HP;
    int player_HP;
    int com_speed;
    int player_speed;
    String com_move;
    String player_move;
    int com_power;
    int player_power;

    //does everything
    public pokemon_battle(){
        Pokedex.add_pokemon();
        display_poke_list();
        System.out.println("Select your pokemon. Enter the number:");
        x = console.nextInt();
        player_pokemon = Pokedex.select_pokemon(x);
        computer_pokemon = Pokedex.random_pokemon(x);
        set_values(player_pokemon, computer_pokemon);
        System.out.println(show_stats(player_HP, com_HP, player_power_list, com_power_list, player_speed, com_speed, player_name, com_name, player_move_list, com_move_list));
        power_move_association();
        determine_winner(battle_pokemon());
    }


    public void set_values(ArrayList<ArrayList<String>> pokemon1, ArrayList<ArrayList<String>> pokemon2){
        com_move_list = pokemon2.get(1);
        player_move_list = pokemon1.get(1);
        com_power_list = pokemon2.get(2);
        player_power_list = pokemon1.get(2);
        com_info = pokemon2.get(0);
        player_info = pokemon1.get(0);
        player_HP = Integer.parseInt(player_info.get(1));
        player_speed = Integer.parseInt(player_info.get(2));
        player_name = player_info.get(0);
        com_HP = Integer.parseInt(com_info.get(1));
        com_speed = Integer.parseInt(com_info.get(2));
        com_name = com_info.get(0);
    }
    //displays the stats of each pokemon
    public String show_stats(int H1, int H2, ArrayList<String> P1, ArrayList<String> P2, int S1, int S2, String N1, String N2, ArrayList<String> M1, ArrayList<String> M2){
        String returned_string =
                "\n" + "Player Pokemon: " + N1 +
                        "\n" + "Moves: " + M1 +
                        "\n" + "Power to each Move: " + P1 +
                        "\n" + "HP: " + H1 +
                        "\n" + "Speed: " + S1 +
                        "\n" + "_______________________" +
                        "\n" + "Computer Pokemon: " + N2 +
                        "\n" + "Moves: " + M2 +
                        "\n" + "Power to each Move: " + P2 +
                        "\n" + "HP: " + H2 +
                        "\n" + "Speed: " + S2;
        return returned_string;
    }

    public void display_poke_list(){
        ArrayList<ArrayList<ArrayList<String>>> displayed_list = new ArrayList<ArrayList<ArrayList<String>>>();
        displayed_list = Pokedex.get_poke_list();
        for(int i = 0; i < displayed_list.size(); i++){
            System.out.println((i+1) + ": " + displayed_list.get(i));
        }
    }

    public int player_move_select(){
        boolean loop = true;
        int n = 0;
        System.out.println("Which move would you like to use or q to quit?");
        String move_name = input.nextLine();
        if(move_name.equals('q')){
            System.out.println("Program exited: ");
            System.exit(0);
        }
        while(loop == true){
            if(move_name.equals(player_move_list.get(n))){
                loop = false;
            }else{
                n++;
            }
        }
        return n;
    }
    //randomizer for cpu to choose move
    public int com_move_select(){
        int n = random.nextInt(1, com_move_list.size());
        return n - 1;
    }
    //puts the power and moves into individual values
    public void power_move_association(){
        int a = player_move_select();
        int b = com_move_select();
        player_move = player_move_list.get(a);
        player_power = Integer.parseInt(player_power_list.get(a));
        com_move = com_move_list.get(b);
        com_power = Integer.parseInt(com_power_list.get(b));
    }

    public boolean battle_pokemon(){
        boolean victory = false;
        boolean HP0 = true;
        while(HP0 == true){
            if (com_speed > player_speed){
                player_HP = player_HP - com_power;
            }else if (player_speed > com_speed){
                com_HP = com_HP - player_power;
            }else{
                boolean random_num = random.nextBoolean();
                if(random_num == true){
                    player_HP = player_HP - com_power;
                }else{
                    com_HP = com_HP - player_power;
                }
            }
            if(player_HP < 1) {
                HP0 = false;
                victory = false;
            }
            if(com_HP < 1){
                HP0 = false;
                victory = true;
            }
        }
        return victory;
    }
    //displays victor based on what was returned from previous method
    public void determine_winner(boolean win){
        if(win == true){
            System.out.println("Congratulations you win!");
        }else{
            System.out.println("Such a shame, you lost...");
        }
    }
}
