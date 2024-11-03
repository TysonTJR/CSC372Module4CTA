package csc372module4CTA;

public class Cone extends Shape{ //class represents a cone object that extends from the shape class
	
	private double radius;   // these are attributes of a cone object
	private double height;   
	
	public double getRadius() {  //getter method that returns the radius attribute
		return this.radius;
	}
	
	public double getHeight() {  //getter method that returns the height attribute
		return this.height;
	}
	
	public Cone(double radius, double height) { //parameterized constructor that passes a radius and height double variable
		
		this.radius = radius; //assigns the attribute's value to the parameter
		this.height = height;
	}
	
	
	@Override
	public double surface_area() {  //overriding this method from the upser class shape that caculates a surface area
		// The formula for the surface area of a cone is pie * r * (radius + the square root of (height squared + radius squared))
		
		double surfaceArea = Math.PI * getRadius() * (getRadius() + Math.sqrt(Math.pow(getHeight(), 2) + Math.pow(getRadius(), 2))); /*
		this calculates the surface area of a cone*/
		
		return surfaceArea; //returns the surface area
	}

	@Override
	public double volume() {  //this method is overridden from the super class shape
		// The formula for the volume of a cone is (1/3) * pie * radius squared * height
		
		double volume = (1.0/3.0) * Math.PI * Math.pow(getRadius(), 2) * getHeight(); //Calculates the volume of a cone
		
		return volume; //returns the volume
	}
	
	public String toString() {  //method that prints the surface area and volume to the console
		
		double surfaceArea = surface_area();  //assigns variables to the different objects attributes
		double volume = volume();
		
		String surfaceAreaToStr = Double.toString(surfaceArea); //converts the surface area to a string
		String volumeToStr = Double.toString(volume);  //converts the volume to a string
		
		String surfaceAreaPlusVolume = "The surface area of the cone is " +  surfaceAreaToStr + "\n" + 
		"The volume of the cone is" + " " + volumeToStr; //creates string variable that holds the statement
		
			
			return surfaceAreaPlusVolume; //returns the string variable
			
		}

}
