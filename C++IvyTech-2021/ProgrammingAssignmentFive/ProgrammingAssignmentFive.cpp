/* Program name: main.cpp
*  Author: Austen Lowder
*  Date last updated: 4/1/2021
* Purpose: to calculate the falling time of an object.
*/


#include <iostream>
#include <iomanip>
#include <cmath>

using namespace std;




double fallingDistance(int t)
{
    return 0.5 * 9.8 * t * t;
}


int main()
{
    cout << setprecision(2) << fixed << showpoint << endl;
    int t = 0;

    // takes the total falling time from the user.

    cout << "Please enter the total falling time:" << endl;
    cin >> t;

    if (t <= 0)
    {
        cout << "Your time should be greater than 0" << endl;
    }
    if (!cin)
    {
        cout << "That is not a number! Please Try again.";
    }


    if (t > 0)
    {

        cout << setprecision(2) << showpoint << fixed << left;
        cout << setw(15) << "Time" << setw(15) << "Distance" << endl;
        cout << setw(30) << setfill('*') << "*" << endl;

    }

    // loop that incriments
    // as well as checks for the user time inputed and calculates that.
    if (t > 0)
    {
        for (int i = 0; i <= t; i += 5)
        {

            cout << i << "\t\t" << fallingDistance(i) << endl;
        }
        if (int i = t)
        {
            cout << i << "\t\t" << fallingDistance(i) << endl;
        }
    }



    return 0;
}

