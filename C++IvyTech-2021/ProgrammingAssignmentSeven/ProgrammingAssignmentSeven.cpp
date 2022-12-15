/*Program name: main.cpp
*Author: Austen Lowder
*Date last updated: 4/11/2021
*Purpose: to make an enumeration
*/


#include <iostream>
#include <string>
#include <cctype>
#include <map>

using namespace std;

int j = 0;

int seasonsoutput()
{

    if (j = 0)
    {
        cout << "The season is spring!";
    }
    else if (j = 1)
    {
        cout << "The season is summer!";
    }
    else if (j = 3)
    {
        cout << "The season is fall!";
    }
    else if (j = 5)
    {
        cout << "The season is winter!";
    }
    return j;

}








enum seasons { spring, summer, fall, winter };

int main()
{
    int seasonslist[4];
    
    const int spring = 0;
    const int summer = 1;
    const int fall = 2;
    const int winter = 3;



    for (int i = 0; i < 4; i++)
    {
        cout << "Enter a number:";
        cin >> seasonslist[i];
        cout << endl;
        while (!cin)
        {
            cin.clear();
            cin.ignore(1000, '\n');
            cout << "That was not a number. Please enter a number: ";
            cin >> seasonslist[i];
            cout << endl;

        }
    }
    for (int i = 0; i < 4; i++)
    {
        cout << seasonslist[i] << endl;
        seasonsoutput();
    }


    return 0;
}
