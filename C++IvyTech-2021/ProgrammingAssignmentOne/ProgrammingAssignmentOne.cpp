/* Program name: main.cpp
*  Author: Austen Lowder
*  Date last updated: 2/4/2021
* Purpose: to share pizza between all my friends(that I dont have)
*/

#include <iostream>
#include <iomanip>

using namespace std;

const float large = 15;
const float medium = 12;
const float small = 9;
const float tax = 0.08;
const float tip = 0.2;
const float deliveryFee = 3.50;
const int largeSlices = 8;
const int mediumSlices = 6;
const int smallSlices = 4;

int main()
{
	int numberOfPeople;
	int numberOfLarge;
	int numberOfMedium;
	int numberOfSmall;
	float calTax;
	float total;
	float calTip;
	float slicesPerPerson;
	int totalSlices;
	float totalPizzaCost;
	float perPersonTotal;


	cout << "How many people are getting pizza? " << endl;
	cin >> numberOfPeople;
	cout << "A large pizza ($15) has 8 slices, how many large pizzas do you want? " << endl;
	cin >> numberOfLarge;
	cout << "A medium pizza ($12) has 6 slices, how many medium pizzas do you want? " << endl;
	cin >> numberOfMedium;
	cout << "A small pizza ($9) has 4 slices, how many small pizzas do you want?" << endl;
	cin >> numberOfSmall;

	totalPizzaCost = (numberOfLarge * large + numberOfMedium * medium + numberOfSmall * small);
	calTax = (totalPizzaCost * tax);
	total = (totalPizzaCost + deliveryFee + calTax + calTip);
	calTip = (totalPizzaCost + deliveryFee + calTax) * tip;
	totalSlices = (numberOfLarge * largeSlices) + (numberOfMedium * mediumSlices) + (numberOfSmall * smallSlices);
	slicesPerPerson = (totalSlices / numberOfPeople);
	perPersonTotal = (total / numberOfPeople);


	cout << "You ordered " << numberOfLarge << " large, " << numberOfMedium << " medium, and " << numberOfSmall << " small pizzas." << endl;

	cout << "That is " << totalSlices << " total slices, and " << slicesPerPerson << " per person." << endl;

	cout << "The total for the pizzas is $" << setprecision(2) << totalPizzaCost << "." << endl;

	cout << "The delivery fee is $ " << setprecision(3) << deliveryFee << "." << endl;

	cout << "The tax amount is $" << calTax << "." << endl;

	cout << "The 20% tip (after adding the tax and delivery fee to the pizza cost) is $" << calTip << "." << endl;

	cout << "The total cost is $" << total << " which is $" << setprecision(3) << perPersonTotal << " per person." << endl;

	return 0;
}