/* Program name: main.cpp
*  Author: Austen Lowder
*  Date last updated: 4/25/2021
* Purpose: to gather information from a text document and tthen display the information
*/
#include <iostream>
#include <fstream>
#include <string>

using namespace std;

// structure for the first name, middle intinal and last name
struct nameType {
    char first;
    char last;
    char middleInital;
};
const int STUDENTS = 20;
// student stucture for gmail and id
struct studentType {
    char name;
    int id;
    char email;
    int GPA;
    programs program;
};
// enum for programs
enum programs { CSCI, DBMS, INFM, SDEV };
// function that reads the data from the classroster file
void readClassRoster(ifstream& inFile, studentType[], int studentlist) {
    for (int j = 0; j < studentlist; j++)
    {
        inFile >> studentType[j].first >> studentType[j].last >> studentType[j].middleInital >> studentType[j].id >> studentType[j].email;
    }
}
void readProgramGPA(ifstream&, studentType[], int);
int findStudentByID(int, const studentType[], int);
double findHighestGPA(const studentType[], int);
void printHighestGPA(double, const studentType[], int);


int main()
{
    //opens the file classroster
    ifstream in;
    in.open("classroster.txt");
    studentType studentlist[20];
        readClassRoster(in, studentlist[20])
        //open the file studentlist
        ifstream on;
    on.open("studentlist.txt");
        return 0;
}
