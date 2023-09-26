/*
 Chapter 9: 
                  A class is a datatype so we would categorize it with things like int, boolean, string, and so on.
                  It's just a better data type designed to fit our needs explicitly.
                  Choose one of the items on the list below and create a class to represent the object as a single digital datatype:
                                              -  be sure to overload your constructors, 
                                              -  include all getters and setters,
                                              -  and override the toString() method to get full points
                  Then use a Java main method to instantiate a couple unique instances of the class and print them to the console.


Note:
- for this assignment im going to get car information
*/

package modulethree.taskOne;

public class One {
    public static void main(String[] args) {
        
        
        // Make car OBJ and put info inside:
        Car car1 = new Car();
        car1.setModelYear(2013);
        car1.setModelName("BMW 328i xDrive");
        car1.setBodyShape("Sedan");
        car1.setMilesDriven(56632);
        car1.setCarColor("Black");

        
        /* Another car but im just going to take it out but
             if you want you and remove the comment thingy.
        
        Car car2 = new Car();
        car2.setModelYear(2023);
        car2.setModelName("Tesla Model 3");
        car2.setBodyShape("Sedan");
        car2.setMilesDriven(2316);
        car2.setCarColor("White");
        
        */

        
        // Print car information.
        System.out.println("Car 1:");
        System.out.println(car1.toString());

        
        /* Same here you can remove this if you want to look at the results.
        
        System.out.println("Car 2:");
        System.out.println(car2.toString());
        
        */
        
    }
    
}
