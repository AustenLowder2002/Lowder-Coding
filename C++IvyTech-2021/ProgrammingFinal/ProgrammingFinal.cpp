/* Program name: main.cpp
*  Author: Austen Lowder
*  Date last updated: 5/14/2021
* Purpose: To play a Codewords game, that makes you guess the letters of the word
*/



#include <iostream>
#include <string>
#include <cstdlib>
#include <fstream>
#include <stdlib.h>
#include <time.h>
#include <vector>
using namespace std;


// these are defintions, declrations, and prototypes for the fucntions
#define total_guesses 10
enum finished { Continue, Winner, Loser };
finished getGuess(string);
int right_guess(string, char);
void printword(string);
char getCharacter();
void scramblemyWord(string& word);
bool liketoPlay();
bool playAgain();

bool playAgain()
{
    bool flag = false;
    cout << "Would you kike to play codewords again? Y/N or y/n ";
    char x = 0;
    cin >> x;
    if (x == 'Y' || x == 'y')
        flag = true;
    return flag;
}






// This bool function asks whether you would like to play the game or not.
bool liketoPlay()
{
    bool flag = false;
    cout << "Would you kike to play codewords? Y/N or y/n ";
    char x = 0;
    cin >> x;
    if (x == 'Y' || x == 'y')
        flag = true;
    return flag;
}

// This function will scramble the word and make the letters all jumbled
void scramblemyWord(string& word)
{

    int n = word.length();
    for (int i = 0; i < n; i++)
    {
        int id = rand() % n;
        // This scrambles the letters 
        char temp = word[i];
        word[i] = word[id];
        word[id] = temp;
    }
}




// This is the main module
int main()
{
    string line;
    vector<string> lines;

    srand(time(0));

    // This opens the file
    ifstream file("wordlist.txt");

    // this counts all the lines
    int total_lines = 0;
    while (getline(file, line))
    {
        total_lines++;
        lines.push_back(line);
    }

    //this is what helps pick a random line in the text file
    int random_number = rand() % total_lines;

    cout << lines[random_number];



    // these are my variables
    int i, count, used = 0, guesses = 0, good;
    string word;
    string word_atm;
    char guess;
    bool guessed = false;
    finished won;
    ifstream in;
    // this opens the file
    in.open("wordlist.txt");

    // this checks to make sure you typed the right file in if you wish to change it.
    if (in.fail())
    {
        cout << "The file you tried to open does not exist";
        system("pause");
        return 1;
    }
    // This is the first message you see when starting the game in a terminal
    cout << "This is a codewords game!" << endl;
    in >> word;
    word = line;
    // this is calling to the function to scramble the word
    scramblemyWord(word);


    // this is the bool function to ask whether youd like to play or not
    while (liketoPlay())
    {

        cout << "Starting a new codewords game!" << endl;
        cout << "Your word has " << word.length() << " characters." << endl;
        used = 0;
        guess = 0;
        won = Continue;
        guesses = 0;
        guessed = false;
        word_atm = "";
        cout << "Your word is ";
        word_atm.insert(0, word.length(), '_');
        printword(word_atm);
        cout << endl;
        while (won == Continue)
        {
            cout << "Number of guesses! " << guesses << endl;
            guesses++;
            guess = getCharacter();
            if (right_guess(word, guess) == 1)
            {
                i = 0;
                i = word.find(guess, i);
                while (i < string::npos)
                {
                    word_atm[i] = guess;
                    i = word.find(guess, i + 1);
                }
                cout << "The word is now ";
                printword(word_atm);
                cout << endl;
            }
            won = getGuess(word);
            if (guesses == total_guesses)
                won = Loser;
        }
        // if you win it will display a winners message
        if (won == Winner)
            cout << "Congraulations you guessed the correct codeword!" << endl;
        // if you did not win well it will display the losers message
        else
            cout << "I am sorry, the codeword was " << word << endl;
        cout << "You guessed " << guesses << " times" << endl;
        playAgain();

        in >> word;
    }

}
finished getGuess(string h)
{
    cout << "Would you like to guess the word? 'Y/N'or 'y/n' " << endl;
    char doom;
    string guess;
    cin >> doom;
    if (doom != 'Y')
        return Continue;
    cout << "Please Enter your word now: ";

    cin >> guess;
    if (h.compare(guess) == 0)
        return Winner;
    cout << "Sorry, that was not the codeword!" << endl;
    return Continue;
}
// this gets the letter that you entered, it would do a whole word but I have not a clue how to compare things like that.
char getCharacter()
{
    char letter;
    cout << "Enter a character: ";
    cin >> letter;
    return letter;
}
// this function prints out the word
void printword(string h)
{
    int i;
    cout << h;
}
int right_guess(string h, char let)
{
    if (h.find(let, 0) < string::npos)
        return 1;
    cout << "Sorry, the codeword does not have any of these characters. " << endl;



    return 0;
}
