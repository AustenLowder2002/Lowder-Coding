package geometric;

import geometric.GeometricObject;

//extends geometric
public class Triangle extends GeometricObject {
private double side1;
private double side2;
private double side3;

// default
Triangle() {
side1 = side2 = side3 = 0.0;
}

// makes a triangle with three sides
public Triangle(double side1, double side2, double side3) { 
this.side1 = side1;
this.side2 = side2;
this.side3 = side3;
}

//returns side one
public double getSide1() {
return side1;
}

// returns side 2
public double getSide2() {
return side2;
}

//returns side 3
public double getSide3() {
return side3;
}

//returns the area of triangle
public double getArea() {
double a = (side1 + side2 + side3) / 2;
return a;
}

// returns the perimeter
public double getPerimeter() {
return side1 + side2 + side3;
}

//returns a description of the triangle
public String toString() {
return "Triangle: side1 = " + side1 +","+ " side2 = " + side2 +","+
	" side3 = " + side3;
}
}