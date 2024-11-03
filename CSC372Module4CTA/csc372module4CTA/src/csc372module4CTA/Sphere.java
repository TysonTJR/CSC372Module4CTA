package csc372module4CTA;

public class Sphere extends Shape { // class that represents a sphere object that extends from the shape class
	
	private double radius;     //This is a sphere object's attribute
	
	
	public double getRadius() {   //this getter method returns the radius of the sphere object
		return this.radius;
	}
	
	
	public Sphere(double radius) {  //parameterized constructor that passes a radius parameter
		this.radius = radius;
	}
	
	

	@Override
	public double surface_area() {   //overriding this method from the super class shape that calculates a surface area
		// the formula for the surface area of a sphere is 4 * pie * r squared
		
		double surfaceArea = 4 * Math.PI * Math.pow(getRadius(), 2); /* this calculates the
		surface area*/
		
		return surfaceArea;  //returns the surface area as a double
	}

	@Override
	public double volume() {  //this method is overridden from the super class shape
	// the formula for volume of a sphere is 4/3 * pie * r cubed
		
		double volume = (4.0/3.0) * Math.PI * Math.pow(getRadius(), 3);   //Calculates the volume of a sphere
		
		return volume;  //returns the volume as a double
	}
	
	public String toString() {  //method that prints the surface area and volume to the console
		
	double surfaceArea = surface_area(); //assigns variables to the different objects attributes
	double volume = volume();
	
	String surfaceAreaToStr = Double.toString(surfaceArea);  //converts the surface area to a string
	String volumeToStr = Double.toString(volume); //converts the volume to a string
	
	
	String surfaceAreaPlusVolume = "The surface area of the sphere is " +  surfaceAreaToStr + "\n" + 
	"The volume of the sphere is" + " " + volumeToStr;  //creates string variable that holds the statement
	
		
		return surfaceAreaPlusVolume;		//returns the string variable 
		
	}

}
