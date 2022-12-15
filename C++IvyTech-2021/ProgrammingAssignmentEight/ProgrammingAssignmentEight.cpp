/* Program name: main.cpp
*  Author: Austen Lowder
*  Date last updated: 4/18/2021
* Purpose: To use fucntions and get the high and lows of each month, then calculate their average.
*/




#include <iostream>
#include <string> 
#include <climits>

using namespace std;

const int NUM_MONTHS = 12;
const string months[NUM_MONTHS] = { "January","February","March","April","May","June","July","August","September","October","November","December" };

// Function to get the high and lows for the arrays
void getData(float temp[2][NUM_MONTHS])
{
    int k = 0;
    for (int i = 0; i < NUM_MONTHS; i++)
    {


        for (int j = 0; j < 1; j++)
        {

            cout << "Enter the highest temperature for the month of " << months[k] << ":" << endl;
            cin >> temp[i][j];



            cout << "Enter the lowest temperature for the month of " << months[k] << ":" << endl;
            cin >> temp[j][i];
            k++;

            // should exit if anything but a number is typed
            if (!cin)
            {
                cout << "That was not a number, try again from the beginning." << endl;
                exit(0);
            }
            // should exit if the highest temp is lower than the lowest temp
            else if (temp[i][j] < temp[j][i])
            {
                cout << "The high number for a month should be higher than the low number for a month." << endl;
                exit(0);
            }



        }



    }
}

// function to get the average high temperature
double averageHigh(float temp[2][NUM_MONTHS])
{
    double sum = 0;
    for (int i = 0; i < NUM_MONTHS; i++)
    {
        sum += temp[i][0];
    }
    double avghigh = sum / NUM_MONTHS;

    return avghigh;
}


// function to get the average low temperature
double averageLow(float temp[2][NUM_MONTHS])
{
    int sum = 0;

    for (int i = 0; i < NUM_MONTHS; i++)
    {
        sum += temp[i][1];
    }
    double avglow = sum / NUM_MONTHS;

    return avglow;
}

// function to get the highest temperature of all the months
int indexHighTemp(float temp[2][NUM_MONTHS])
{
    int indexHigh = INT_MIN;

    for (int i = 0; i < NUM_MONTHS; i++)
    {
        if (indexHigh < temp[i][0])
            indexHigh = temp[i][0];
    }

    return indexHigh;
}

// function to get the lowest temperature of all the months
int indexLowTemp(float temp[2][NUM_MONTHS])
{
    int low = INT_MAX;

    for (int i = 0; i < NUM_MONTHS; i++)
    {
        if (low > temp[i][1])
        {
            low = temp[i][1];
        }
    }
    return low;
}





int main()
{
    // declares temp[2][12] as a like varible or something to be used
    float temp[2][NUM_MONTHS];
    // calls the function getData
    getData(temp);

    //calls the other functions and displays the information, I did not get everything to work.
    cout << "The average high is:" << averageHigh(temp) << endl;
    cout << "The average low is:" << averageLow(temp) << endl;
    cout << "The highest temperature was " << indexHighTemp(temp) << "in the month of " << endl;
    cout << "The lowest temperature was " << indexLowTemp(temp) << "in the month of " << endl;


    return 0;
}
