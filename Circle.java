
// This class represents a circle shape
public class Circle extends ShapeTester{

    // Instance variables (data members) of class Circle
    protected double radius; // the radius of the circle
    protected double x; // the x coordinate of the circle's center
    protected double y; // the y coordinate fo the circle's center

    // The default constructor with no argument
    public Circle(){
      // Initializing the values of the instance variables
      radius = 1.0;
      x = 0.0;
      y = 0.0;
    }

    // Second constructor with given radius, but origin default
    public Circle(double r) {
      radius = r;
      x = 0.0;
      y = 0.0;
    }

    // Overloaded constructor
    // Parameter r should be the radius length
    // Parameter ex should be the x coordinate
    // Parameter why should be the y coordinate
    public Circle(double r, double ex, double why) {
      radius=r;
      x=ex;
      y=why;
    }

    // A public getter method for retrieving the radius
    public double getRadius() {
     return radius;
    }

    // A public getter method for retrieving the center coordinates
    public double[] getCenter()
    {
     double[] c = {this.x, this.y};
     return c;
    }

    // A public getter method for computing and returning
    // the area of the circle
    public double getArea()
    {
      return radius * radius * Math.PI;//calculating area of circle
    }

    // A public method you need to write to
    // compute and return the circumference of the circle
    public double getCircumference()
    {
      return 2.0 * Math.PI * radius;//calculating perimeter of circle
    }

    // A public method that compares the sizes of two circles: the circle
    // represented by the current object, and the circle passed as a parameter.
    // Example: circleA.isBiggerThan(circleB) should return true if circleA
    // has a larger area than circleB, false otherwise.
    // NOTE: You may need to modify the parameter list!
    public boolean isBiggerThan(Circle A)
    {
      double a1= this.getArea();
      double a2= A.getArea();
      if(a1>a2)//checking if the current object's area is greater than the area of the object passed in parameter
      return true;
      else
      return false;
    }

    // A public method that takes as input an x coordinate (as a double)
    // and a y coordinate (a double), and returns true if the (x, y) coordinate
    // is inside the current circle, false otherwise.
    // NOTE: You may need to modify the parameter list!
    public boolean containsPoint(double xx, double yy)
    {
      double l= Math.sqrt(Math.pow((xx-this.x),2)+Math.pow((yy-this.y),2));
      if (l<=radius)
      return true;
      else
      return false;
    }

    // A public method named setRadius that sets this object's radius
    // based on the passed parameter (of type double).
    // The method should not return anything.
    public void setRadius(double r)
    {
      this.radius= r;
    }

    // A public method named setCenter that sets this object's center.
    // The method takes two doubles as parameters: ex and why.
    // It should set the x coordinate of the circle to ex,
    // and the y coordinate of the circle to why.
    // The method should not return anything.
    public void setCenter (double ex, double why)
    {
      this.x=ex;
      this.y=why;
    }

    // Overriden method toString which should
    // return the string representation of this Circle object, as follows:
    // "This circle is centered at point <display_coordinate_of_center_here>
    // with radius <display_radius>"
    @Override
    public String toString()
    {
      return "This circle is centered at point ("+this.x+" , "+this.y+") with radius" +radius;
    }

		// Override the method equals which is inherited from class Object
		// (similar to what we did in class Employee), and make it return true if the
		// two circles have equal areas, false otherwise
		// Important: Use the @Override annotation
    @Override
    public boolean equals (Object ob)
    {
      if(!(ob instanceof Circle))
      return false;
      Circle c = (Circle) ob;
      if (this.getArea()==(c.getArea()))
      return true;
      else
      return false;
    }
}
