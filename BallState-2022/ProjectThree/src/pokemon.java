import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;

public class pokemon extends ArrayList<String> {

    private static Scanner console = new Scanner(System.in);
    private static Scanner input = new Scanner(System.in);
    private static ArrayList<ArrayList<String>> total_pokemon = new ArrayList<ArrayList<String>>();

    private static ArrayList<String> move_list = new ArrayList<String>();
    private static ArrayList<String> move_power = new ArrayList<String>();
    private static ArrayList<String> pokemon_info = new ArrayList<String>();

    public static ArrayList<ArrayList<String>> pokemon_creator(){
        String name = get_name();
        String HP = get_HP();
        String speed = get_speed();

                    try {
                        System.out.println("How many moves do you want on " + name + " or q to quit?");
                        int n = input.nextInt();
                        for(int i = 1; n >= i; i++){
                            System.out.println("Enter Pokemon move " + (i) + " or q to quit:");
                            String temp = console.nextLine();
                            if(temp == String.valueOf('q')){
                                System.out.println("Program exited: ");
                                System.exit(0);
                            }else{
                                move_list.add(console.nextLine());
                            }
                        }
                        for(int i = 1; n >= i; i++){
                            System.out.println("Enter move " + (i) + " power or q to quit:");
                            String temp = input.nextLine();
                            if(temp.equals('q')){
                                System.out.println("Program exited: ");
                                System.exit(0);
                            }else{
                                move_power.add(input.nextLine());
                            }
                        }
                        pokemon_info.add(name);
                        pokemon_info.add(HP);
                        pokemon_info.add(speed);
                        total_pokemon.add(pokemon_info);
                        total_pokemon.add(move_list);
                        total_pokemon.add(move_power);

            } catch (InputMismatchException e) {
                System.out.println("Program exited: ");
                System.exit(0);

            }

        return total_pokemon;
    }

    //obtains name from pokemon
    public static String get_name(){
        System.out.println("Enter Pokemon name or q to quit:");
        String return_name = console.nextLine();
        if(return_name == String.valueOf('q')){
            System.out.println("Program exited: ");
            System.exit(0);
        }
        return return_name;
    }

    public static String get_HP(){
        System.out.println("Enter Pokemon HP or q to quit:");
        String return_HP = input.nextLine();
        if(return_HP.equals('q')){
            System.out.println("Program exited: ");
            System.exit(0);
        }

        return return_HP;
    }

    public static String get_speed(){
        System.out.println("Enter Pokemon speed or q to quit:");
        String return_speed = input.nextLine();
        if(return_speed.equals('q')){
            System.out.println("Program exited: ");
            System.exit(0);
        }
        return return_speed;
    }
}
