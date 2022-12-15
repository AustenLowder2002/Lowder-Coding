/*
Program name: main.cpp
* Author: Austen Lowder
* Date last updated : 3 / 28 / 2021
* Purpose : To calculate the area, radius, and perimeter of two given points, stated by the user.
*/



#include <iostream>
#include <string>
#include <iomanip>
#include <cmath>
#include <functional>
using namespace std;



const float pi = 3.1415;
float area;
float perim;
float r;
float a;
float p;


float calculateRadius(int x1, int y1, int x2, int y2)
{
    float r = sqrt((x1 - x2) ^ 2 + (y1 - y2) ^ 2);
    return r;
}





float calculateArea(float pi, float r)
{
    float a = (pi * r * r);
    return a;
}




float calculatePerimeter(float pi, float r)
{
    float p = (2 * pi * r);
    return p;
}


int main()
{





    int x1;
    int y1;
    int x2;
    int y2;
    float b;
    float c;
    float d;


    cout << fixed << showpoint << setprecision(7);


    // Gets the information of the cricle
    cout << "Please enter the center point in the form x y:" << endl;
    cin >> x1 >> y1;
    if (!cin)
    {
        cout << "You did not enter a number please try again, the program will now exit." << endl;
        exit(1);
    }
    else
    {
        cout << "Please enter the point on the circle in the form x y:" << endl;
        cin >> x2 >> y2;
    }




    b = calculateRadius(x1, y1, x2, y2);

    c = calculateArea(pi, r);

    d = calculatePerimeter(pi, r);



    // displays the information



    cout << "Here is the information for the circle formed from (" << x1 << "," << y1 << ") and (" << x2 << "," << y2 << ")" << endl;
    cout << "Radius: " << b << endl;
    cout << "Area: " << c << endl;
    cout << "Perimeter: " << d << endl;
    return 0;
}