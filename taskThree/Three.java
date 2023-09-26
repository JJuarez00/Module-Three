/*
Chapter 11 - 11.1
(THE TRIANGLE CLASS) Design a class named Triangle that extends ­GeometricObject.

- Three double data fields named side1, side2, and side3 with default values 1.0 to denote three sides of a triangle.

- A no-arg constructor that creates a default triangle.

- A constructor that creates a triangle with the specified side1, side2, and side3.

- The accessor methods for all three data fields.

- A method named getArea() that returns the area of this triangle.

- A method named getPerimeter() that returns the perimeter of this triangle.

- A method named toString() that returns a string description for the triangle.

ToString:
return "Triangle: side1 = " + side1 + " side2 = " + side2 +
  " side3 = " + side3;

*/

package modulethree.taskThree;

public class Three {
    
    public static class Triangle extends GeometricObject{
        
        // Data Fields 
        private double side1 = 1.0;
        private double side2 = 1.0;
        private double side3 = 1.0;

        // No-arg constructor.
        public Triangle() {
        }

        // Create triangle with the sides
        public Triangle(double one, double two, double three) {
            this.side1 = one;
            this.side2 = two;
            this.side3 = three;
        }
    

        // Getter method
        public double getSide1() {
            return side1;
        }

        public double getSide2() {
            return side2;
        }

        public double getSide3() {
            return side3;
        }  
        // End of getter method
    
    
    
    
        // Resuable math equation to get the area of a triangle with three sides
        public double getPerimeter(double one, double two, double three) {
            return (one+two+three) / 2;
        }
    
        public double getArea(double perimeter, double one, double two, double three) {
            return Math.sqrt(perimeter * (perimeter - one) * (perimeter - two) * (perimeter - three) );
        }
        // End of the resuable math equation to get the area of the thre
        
        @Override
        public String toString() {
            return super.toString() + "\n\nTriangle Data: \nside1 = " + side1 + " \nside2 = " + side2 + " \nside3 = " + side3;
        }
        
} // End of Triangle

    
    // MAIN
    public static void main(String[] args) {
        
            // Get Shape
            Triangle shape = new Triangle();
            shape.setColor("Green");
            shape.setFill(true);
            
            double p = shape.getPerimeter(shape.side1, shape.side2, shape.side3);
            double area = shape.getArea(p, shape.side1, shape.side2, shape.side3);
                        
            System.out.println(shape.toString());
            
            System.out.println("\n\nArea of the triangle is: " + area);
    }   // End of MAIN
    
} // End of Three
