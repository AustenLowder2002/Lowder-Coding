/* Program name: main.cpp
*  Author: Austen Lowder
*  Date last updated: 3/7/2021
* Purpose: The goal is to convert C to F and F to N, then put that all into a text document to have a custom conversion table.
*/






#include <iostream>
#include <fstream>
#include <iomanip>

using namespace std;

float lCon = 0;
float uCon = 0;
float inc = 0;
float temp = 0;
float temp2 = temp;

int main()
{



    ofstream file;

    file.open("conversion.txt");

    if (file.is_open())
    {
        cout << "Enter the lower value for the conversion table:" << endl;
        cin >> lCon;

        cout << "Enter the upper value for the conversion table:" << endl;
        cin >> uCon;
    }

    if (lCon < 0)
    {

        cout << "You have not entered a number. Try again." << endl;
        exit(1);
    }
    else
    {
        cout << "Enter the upper value for the conversion table:" << endl;
        cin >> uCon;
    }
    if (uCon < lCon)
    {
        cout << "Your upper value is less than your lower value. Try again." << endl;
        exit(1);
    }
    else
    {
        cout << "What do you want to use for your increment:" << endl;
        cin >> inc;
    }
    if (inc <= 0)
    {
        cout << "The increment must be greater than 0." << endl;
        exit(1);
    }
    while (temp < uCon)
        temp = (lCon + inc);
    temp2 = 9 / 5 * lCon + 32;

    {
        cout << setprecision(2) << showpoint << fixed << left;
        cout << setw(10) << "C" << setw(10) << "F" << setw(10) << "N" << endl;
        cout << setw(20) << setfill('_') << "_" << endl;
        cout << setfill(' ');

    }


    return 0;
}
