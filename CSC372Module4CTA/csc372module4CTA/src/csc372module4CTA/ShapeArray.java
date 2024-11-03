package csc372module4CTA;

public class ShapeArray { //this class represents a shape array that contains different shapes
	
	private double radius = 20.0;   //universal radius attribute across all shapes
	private double height = 40.0;   // universal height attribute across all shapes
	
	public double getRadius() {  //getter method to return the radius attribute
		return this.radius;
	}
	
	public double getHeight() {  //getter method that retruns the height attribute
		return this.height;
	}
	
	public ShapeArray() {  //default constructor that initializes a ShapArray object
		
	Sphere newSphere = new Sphere(getRadius());  //creates a sphere object named newSphere
	
	Cylinder newCylinder = new Cylinder(getRadius(), getHeight());  //creates a cylinder object named newCylinder
	
	Cone newCone = new Cone(getRadius(), getHeight());  //creates a new cone object named newCone
	
	Shape[] shapeArray = new Shape[3];  //creates an array that holds the different shapes
	
	shapeArray[0] = newSphere; //adds the sphere object to the first index of 0
	shapeArray[1] = newCylinder; //adds the cylinder object to the 2nd index of 1
	shapeArray[2] = newCone;  //adds the cone object to the 3rd index of 2
	
	int i; //declares a counter variable for the for loop
	
	for(i = 0; i <= 2; i++) {  /*this is a for loop which has a counter variable of i that increases by one and is executed when 
	i is less than or equal to 2*/
		System.out.println(shapeArray[i].toString()); // in each iteration it prints each objects attributes
	}
	
	}
}


