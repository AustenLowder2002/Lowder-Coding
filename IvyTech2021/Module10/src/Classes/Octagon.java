package Classes;

public class Octagon extends GeometricObject implements Cloneable, Comparable<Octagon> {

	//variable for side
private double side;



// gets the side of the octagon
public Octagon(double side) {
this.side = side;
}

// sets it
public void setSide(double side) {
this.side = side;
}

//
public double getSide() {
return side;
}

//gets the area of the octagon
public double getArea() {
return (2 + 4 / Math.sqrt(2)) * side * side;
}

// gets the perimeter
public double getPerimeter() {
return 8 * side;
}

@Override // compares the original to the clone to see if they match
public int compareTo(Octagon o) {
if (getArea() > o.getArea())
	return 1;
else if (getArea() < o.getArea())
	return -1;
else
	return 0;
}

@Override 
public Object clone() throws CloneNotSupportedException {
return super.clone();
}

@Override //outputs the string
public String toString() {
return super.toString() + "\nArea: " + getArea() + 
	"\nPerimeter: " + getPerimeter();
}
}
