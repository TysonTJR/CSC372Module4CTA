package csc372module4CTA;



public class Cylinder extends Shape {  // class that represents a cylinder object that extends from the shape class
	
	private double radius;
	private double height;    //These are a cylinder object's attributes

	
	public double getRadius() {   //this getter method returns the radius of the cylinder object
		return this.radius;
	}
	
	public double getHeight() {  //this getter method returns the height of the cylinder object
		return this.height;
	}
	
	public Cylinder(double radius, double height) {   //parameterized constructor that passes a radius and height parameter
		
		this.radius = radius;   //assigns radius and height object attribute to the parameters value
		this.height = height;
	}
	
	
	
	@Override
	public double surface_area() {   //overriding this method from the super class shape that calculates a surface area
		
		//the formula for surface area for a cylinder is SA = 2 * pie * radius squared + 2 * pie * radius * height
		double pie  = Math.PI;
		double surfaceArea = (2 * pie * Math.pow(getRadius(), 2) + (2 * pie * getRadius() * getHeight())); /* this calculates the
		surface area*/
		
		
		return surfaceArea;  //returns the surface area as a double
	}

	@Override
	public double volume() {  //this method is overridden from the super class shape
		
		// the formula for the volume of a cylinder is V = pie * radius squared * height
		double pie  = Math.PI;
		
		double volume = pie * Math.pow(getRadius(), 2) * getHeight(); //Calculates the volume of a cylinder
		
		return volume;  //returns the volume as a double
	}
	
	public String toString() {  //method that prints the surface area and volume to the console
		
		double surfaceArea = surface_area();  //assigns variables to the different objects attributes
		double volume = volume();
		
		String surfaceAreaToStr = Double.toString(surfaceArea);  //converts the surface area to a string
		String volumeToStr = Double.toString(volume);  //converts the volume to a string
		
		String surfaceAreaPlusVolume = "The surface area of the cylinder is " +  surfaceAreaToStr + "\n" + 
		"The volume of the cylinder is" + " " + volumeToStr;  //creates string variable that holds the statement
		
			
			return surfaceAreaPlusVolume; //returns the string variable 
			
		}

}
