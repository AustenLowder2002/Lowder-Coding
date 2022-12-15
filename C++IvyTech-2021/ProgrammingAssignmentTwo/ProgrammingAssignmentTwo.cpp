/* Program name: EmployeeDiscount.cpp
*  Author: Austen Lowder
*  Date last updated: 2/21/2021
* Purpose: Employee Discount
*/

#include <iostream>
#include<fstream>
#include <iomanip>
#include <string>
using namespace std;

float discount1 = .25;
float discount2 = .50;
float discount3 = .75;
float bill = 0;
int notnum = 0;
int num;

int main()
{
    ifstream in;
    in.open("Number.txt");
    double employeeNum;
    in >> employeeNum;

    cout << "Enter your employee number to see if you get a discount: " << endl;
    cin >> num;
    notnum = num;

    if (notnum <= 0)
    {
        cout << "You did not enter a number! The program will now exit." << endl;
        exit(0);
    }
    else if (num > 99999)
    {
        cout << "You entered a number that is out of range! Employee numbers are 5 digits (between 10000 and 99999). Program will now exit." << endl;
        exit(0);
    }
    else if (num < 10000)
    {
        cout << "You entered a number that is out of range! Employee numbers are 5 digits (between 10000 and 99999). Program will now exit." << endl;
        exit(0);
    }

    if (num == 71180)
    {
        cout << "You have won a discount of " << 75 << "%." << endl;
    }
    else if (num == 14315)
    {
        in >> employeeNum;
        cout << "You have won a discount of " << 50 << "%." << endl;
    }
    else if (num == 70251)
    {
        in >> employeeNum;
        cout << "You have won a discount of " << 25 << "%." << endl;
        cout << endl;
    }
    else
    {
        cout << "Sorry you did not win a discount this month. Try again next month." << endl;
        exit(0);
    }



    if (num == 71180, 14315, 70251)
    {
        cout << "Enter the total bill: " << endl;
        cin >> bill;
        cin >> notnum;
    }
    else if (bill <= 0)
    {
        cout << "The total should be greater than 0. The program will now exit." << endl;
        exit(0);

    }
    else if (notnum <= 0)
    {
        cout << "You entered something that is not a number! The program will now exit." << endl;
        exit(0);

    }
    else if (employeeNum == 71180)
    {
        cout << "Your discount will take $" << (bill * discount3) << " off your bill." << endl;
        cout << "Your new total is $" << (bill - discount3) << "." << endl;
    }
    else if (employeeNum == 14315)
    {
        cout << "Your discount will take $" << (bill * discount2) << " off your bill." << endl;
        cout << "Your new total is $" << (bill - discount2) << "." << endl;
    }
    else if (employeeNum == 70251);
    {
        cout << "Your discount will take $" << (bill * discount1) << " off your bill." << endl;
        cout << "Your new total is $" << (bill - discount1) << "." << endl;
    }

    return 0;
}