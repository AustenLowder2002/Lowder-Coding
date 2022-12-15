#include <iostream>

using namespace std;

int main()
{
	float width;
	float height;

	cout << "Enter the width of your triangle";
	cin >> width;
	cout << "Enter the height of your triangle";
	cin >> height;

	float area = 0.5 * width * height;

	cout << "The area of this triangle with the width of " << width << " and height of " << height << " is " << area << endl;

	return 0;
}