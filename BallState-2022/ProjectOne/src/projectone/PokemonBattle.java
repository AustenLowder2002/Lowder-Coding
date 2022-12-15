package projectone;
/* Author: Austen Lowder
   Date: 09/19/2022
   Last updated: 09/25/2022
   Submission date: 09/25/2022
   Summary: Takes input from two players and makes their pokemons fight eachother.
 */

// imported classes
import java.util.Random;
import java.util.Scanner;

public class PokemonBattle {
    public static void main(String[] args) {
        //intilazied variables
        boolean rounds = true;
        int oddNum = 0;
        int roundsP1 = 0;
        int roundsP2 = 0;
        String name1, name2, move1, move2;
        int hitP1 = 0, hitP2 = 0, moveP1 = 0, moveP2 = 0, attackS1 = 0, attackS2 = 0;
        Random ran = new Random(10);
        Random ran2 = new Random(10);
        // scanner for number input and string input
        Scanner input = new Scanner(System.in);
        Scanner sInput = new Scanner(System.in);
        // do while loop to make sure they pick an odd number of rounds.
        do {
            System.out.println("Please enter an odd number of rounds");
            oddNum = input.nextInt();
            if (oddNum % 2 == 0) {
                System.out.println("That was not an odd number");

            } else
                rounds = false;
        } while (rounds);

        // double for loop that loops until the odd number has been achieved
        for (int i = 0; i <= oddNum; i++) {
            for (int j = 1; j <= 2; j++) {
                System.out.println("Player " + j + " please enter your pokemon's stats");
                System.out.println("Pokemon " + j + " stats:");
                // if its player one will use this
                if (i == 1) {
                    System.out.println("Name:");
                    name1 = sInput.nextLine();
                    System.out.println("hit points:");
                    hitP1 = input.nextInt();
                    System.out.println("move:");
                    move1 = sInput.nextLine();
                    System.out.println("move's power:");
                    moveP1 = input.nextInt();
                    System.out.println("attack speed:");
                    attackS1 = input.nextInt();
                    // for player 2
                } else {
                    System.out.println("Name:");
                    name2 = sInput.nextLine();
                    System.out.println("hit points:");
                    hitP2 = input.nextInt();
                    System.out.println("move:");
                    move2 = sInput.nextLine();
                    System.out.println("move's power:");
                    moveP2 = input.nextInt();
                    System.out.println("attack speed:");
                    attackS2 = input.nextInt();

                }

            }

            //if player one's attack speed is faster they go first
            if (attackS1 > attackS2) {
                System.out.println("Player one goes first!");
                int health1 = hitP2 - attackS1;
                int temp1 = health1;

                if (temp1 <= 0) {
                    System.out.println("Player one wins this round!");
                    roundsP1 += 1;

                }
                // this is if player two's speed is faster
                }else if (attackS1 < attackS2) {
                    System.out.println("Player two goes first!");
                    int health2 = hitP1 - attackS2;
                    int temp = health2;
                    if (temp <= 0) {
                        System.out.println("Player two wins this round!");
                        roundsP2 += 1;

                    }
                    else {
                        //random number if attack speeds are equal
                        if (attackS1 == attackS2) {
                            int j = ran.nextInt();
                            int k = ran2.nextInt();
                            if (j > k) {
                                System.out.println("Player one goes first!");
                                int health1 = hitP2 - attackS1;
                                int temp1 = health1;
                                if (temp1 <= 0) {
                                    System.out.println("Player one wins this round!");
                                    roundsP1 += 1;


                                } else {
                                    System.out.println("Player two goes first!");
                                    health2 = hitP1 - attackS2;
                                    temp = health2;
                                    if (temp <= 0) {
                                        System.out.println("Player two wins this round!");
                                        roundsP2 += 1;

                                    }
                                }
                            }
                        }
                    }
                    //outputs who has won what rounds
                    if (roundsP1 > roundsP2) {
                        System.out.println("Player one won, they won " + roundsP1 + " rounds");
                    } else {
                        System.out.println("Player two won, they won " + roundsP2 + " rounds");

                    }
                }
            }
            //outputs the final score and the rounds won by each player.
            System.out.println("Final score:");
            System.out.println("Final score for player one " + roundsP1);
            System.out.println("Final score for player two " + roundsP2);
        }
    }


