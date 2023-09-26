package modulethree.taskThree;

public class GeometricObject {
    
    // Date Fields
    private String color = "";
    private boolean fill = false;
    
    // No-Arg
    public GeometricObject() {
    
}
    
    // Create Object
    public GeometricObject(String one, boolean two) {
        this.color = one;
        this.fill = two;
    }
    
    
    // Getter
    public String getColor() {
        return color;
    }
    
    public boolean isFilled() {
        return fill;
    }
    
    
    // Setter
    public void setColor(String color) {
        this.color = color;
    }
    
    public void setFill(boolean fill) {
        this.fill = fill;
    }
    
    public static String isFilled(boolean answer) {
    return answer ? "Yes" : "No";
}

    
    @Override
    public String toString() {
        return "Triangle Info:\nColor - " + color + "\nIs it filled? - " + isFilled(fill);
    }
}
