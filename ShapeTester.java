
public class ShapeTester {

  // !!!Important!!!
  // All methods in this class should be declared "static"

  // A public method isLarger which takes as input two shapes
  // (a Circle first, then a Rectangle) and returns true if the area of
  // the circle is bigger than (or equal to) the area of the rectangle,
  // false otherwise.
  public static boolean isLarger (Circle c, Rectangle r)
  {
    double areaCircle= c.getArea();
    double areaRectangle=r.getArea();
    if(areaCircle>=areaRectangle)
    return true;
    else
    return false;
  }

  // A public method longerPerim which takes as input
  // a Circle object followed by a Rectangle object and returns
  // the length of the perimeter of the longer of the two objects.
  public static double longerPerim (Circle c,Rectangle r)
  {
    double periCircle=c.getCircumference();
    double periRectangle=r.getPerimeter();
    if(periCircle>periRectangle)
    return periCircle;
    else
    return periRectangle;
  }

  // Another version of the public method longerPerim which has the
  // same name and functionality but it takes as input a Rectangle object
  // followed by a Circle object. The method also returns the length of
  // the perimeter of the longer of the two objects.
  public static double longerPerim (Rectangle r,Circle c)
  {
    double periRectangle=r.getPerimeter();
    double periCircle=c.getCircumference();
    if(periRectangle>periCircle)
    return periRectangle;
    else
    return periCircle;
  }

  // A public method largerArea which takes as input
  // a Circle object followed by a Rectangle object and returns
  // the area of the larger of the two objects.
  public static double largerArea (Circle c,Rectangle r)
  {
    double areaCircle= c.getArea();
    double areaRectangle=r.getArea();
    if(areaCircle>areaRectangle)
    return areaCircle;
    else
    return areaRectangle;
  }

  // Another version of the public method largerArea which has the
  // same name and functionality but it takes as input a Rectangle object
  // followed by a Circle object.
  public static double largerArea (Rectangle r,Circle c)
  {
    double areaRectangle=r.getArea();
    double areaCircle= c.getArea();
    if(areaRectangle>areaCircle)
    return areaRectangle;
    else
    return areaCircle;
  }

  // A public method containsCenter which takes as input two circles,
  // and returns true if the first circle contains the center of the second circle,
  // false otherwise.
  public static boolean containsCenter (Circle c1, Circle c2)
  {
    boolean b= c1.containsPoint(c2.x,c2.y);
    if(b==true)
    return true;
    else
    return false;
  }
}
