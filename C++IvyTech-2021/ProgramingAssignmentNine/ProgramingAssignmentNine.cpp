/* Program name: main.cpp
*  Author: Austen Lowder
*  Date last updated: 4/24/2021
* Purpose: to gather information of two movies
*/


#include <iostream>
#include <sstream>
using namespace std;

// structure for all the movie data
struct movieData {
    string title, genre, director, yearReleased, runningTime;
}movie1, movie2;



// validation helper for the year and running time
bool isnumber(string str)
{
    for (int j = 0; j < str.length(); j++)
        if (isdigit(str[j]) == false)
            return true;
    return false;
}





//Function to display the data of the moives
void displayData1(movieData movie1)
{
    cout << "Here is the information for movie #1" << endl;
    cout << "Title:" << movie1.title << endl;
    cout << "Genre:" << movie1.genre << endl;
    cout << "Director:" << movie1.director << endl;
    cout << "Year realeased:" << movie1.yearReleased << endl;
    cout << "Running time (in minutes):" << movie1.runningTime << endl;
}


void displayData2(movieData movie2)
{
    cout << "Here is the information for movie #2" << endl;
    cout << "Title:" << movie2.title << endl;
    cout << "Genre:" << movie2.genre << endl;
    cout << "Director:" << movie2.director << endl;
    cout << "Year realeased:" << movie2.yearReleased << endl;
    cout << "Running time (in minutes):" << movie2.runningTime << endl;
}


int main()
{
    // variables
    int year, minutes;
    // information gathered from the user
    cout << "Entering data for movie #1" << endl;
    cout << "Enter the title of the moive:" << endl;
    cin >> movie1.title;
    cout << "Enter the genre of the moive:" << endl;
    cin >> movie1.genre;
    cout << "Enter the director's name:" << endl;
    cin >> movie1.director;
    cout << "Enter the year the movie was released:" << endl;
    cin >> movie1.yearReleased;

    //makes the data comparable to a number
    if (isnumber(movie1.yearReleased))
    {
        stringstream check1(movie1.yearReleased);
        check1 >> year;

    }
    if (year >= 1887)
    {
        cout << "Enter the runtime in minutes:" << endl;
        cin >> movie1.runningTime;
    }
    // clears the wrong information and gives you another chance to enter your data
    else if (year < 1887)
    {
        cout << "Enter the year greater than 1887." << endl;
        cin.clear();
        cin >> movie1.yearReleased;
    }
    if (isnumber(movie1.runningTime))
    {
        stringstream check2(movie1.runningTime);
        check2 >> minutes;
    }
    if (minutes < 0)
    {
        cout << "The runtime should be a number greater than 0." << endl;
        cin.clear();
        cin >> movie1.runningTime;
    }


    int year2, minutes2;
    cout << "Entering data for movie #2" << endl;
    cout << "Enter the title of the moive:" << endl;
    cin >> movie2.title;
    cout << "Enter the genre of the moive:" << endl;
    cin >> movie2.genre;
    cout << "Enter the director's name:" << endl;
    cin >> movie2.director;
    cout << "Enter the year the movie was released:" << endl;
    cin >> movie2.yearReleased;


    if (isnumber(movie1.yearReleased))
    {
        stringstream check2(movie1.yearReleased);
        check2 >> year2;

    }
    if (year2 >= 1887)
    {
        cout << "Enter the runtime in minutes:" << endl;
        cin >> movie2.runningTime;
    }
    else if (year2 > 1887)
    {
        cout << "Enter the year greater than 1887." << endl;
        cin.clear();
        cin >> movie2.yearReleased;
    }
    if (isnumber(movie2.runningTime))
    {
        stringstream check2(movie2.runningTime);
        check2 >> minutes2;
    }
    if (minutes2 < 0)
    {
        cout << "The runtime should be a number greater than 0." << endl;
        cin.clear();
        cin >> movie2.runningTime;
    }
    // states what movie1 and moive 2 is then calls the function and displays the data
    movie1 = { movie1.title,movie1.genre,movie1.director,movie1.yearReleased,movie1.runningTime };
    displayData1(movie1);
    cout << endl;
    movie2 = { movie2.title,movie2.genre,movie2.director,movie2.yearReleased,movie2.runningTime };
    displayData2(movie2);

    return 0;
}
