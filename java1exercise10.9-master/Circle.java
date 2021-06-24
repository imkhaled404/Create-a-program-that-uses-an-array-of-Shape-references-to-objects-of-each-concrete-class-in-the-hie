import java.lang.Math;

public class Circle extends TwoDimensionalShape {
    
    public Circle(double dim1) {
        super(dim1);
    }

    private double circleArea = (Math.pow(getDimOne(), 2) * Math.PI);
    
    @Override
    public double getArea()
    {
        return circleArea;
    }
    
    @Override 
    public String toString()
    {
        return " radius: " + getDimOne(); 
    }
    
}

