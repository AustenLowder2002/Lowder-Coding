/* Program name: OfficeWork
*  Author: Austen Lowder
*  Date last updated: 3/7/2021
* Purpose: To calculate the cost of products, and add up their totals.
*/

#include <iostream>
#include <fstream>
#include <string>
#include <iomanip>

using namespace std;


int text = 0;

const double tax = .17;
const double ship = 14.95;
float E = 74.56;
float H = 3.45;
float D = 23.13;
float G = 9.34;
int x = 0;
int main()
{
    cout << setprecision(2) << fixed << showpoint;



    ifstream file;
    file.open("order.txt");
    string line;
    int quant;
    int id;
    int i = 1;
    int n = 0;
    float subtotal = (E * 46) + (H * 76) + (D * 2) + (G * 7);
    float subtax = (subtotal * tax);
    float grandtotal = (subtax + subtotal + ship);

    float mynum[4] = { 74.56, 3.45, 23.13, 9.34 };

    if (file.is_open())
    {

        cout << "Thank You! Your order is summarized below:" << endl;
        cout << setw(52) << setfill('-') << "-" << endl;
        cout << setfill(' ');
        cout << "| " << setw(15) << left << "Product" << "| " << setw(15) << "Quantity" << "| " << setw(15) << "Line Total" << "|" << endl;
        cout << setw(52) << setfill('-') << "-" << endl;
        cout << setfill(' ');

        while (i < 5)
        {


            file >> line >> quant;


            cout << setfill(' ');
            cout << "| " << setw(15) << left << line << "| " << setw(15) << quant << "| " << setw(15) << (quant * mynum[n]) << "|" << endl;
            cout << setw(52) << setfill('-') << "-" << endl;
            id << '\n';
            quant << '\n';

            n++;
            i++;



        }

        cout << setfill(' ');
        cout << "| " << setw(15) << left << "Subtotal" << "| " << setw(15) << " " << "| " << setw(15) << subtotal << "|" << endl;
        cout << setw(52) << setfill('-') << "-" << endl;


        cout << setfill(' ');
        cout << "| " << setw(15) << left << "Tax" << "| " << setw(15) << " " << "| " << setw(15) << (subtotal * tax) << "|" << endl;
        cout << setw(52) << setfill('-') << "-" << endl;


        cout << setfill(' ');
        cout << "| " << setw(15) << left << "Shipping" << "| " << setw(15) << " " << "| " << setw(15) << ship << "|" << endl;
        cout << setw(52) << setfill('-') << "-" << endl;


        cout << setfill(' ');
        cout << "| " << setw(15) << left << "Grand Total" << "| " << setw(15) << " " << "| " << setw(15) << grandtotal << "|" << endl;
        cout << setw(52) << setfill('-') << "-" << endl;
    }



    return 0;
}
