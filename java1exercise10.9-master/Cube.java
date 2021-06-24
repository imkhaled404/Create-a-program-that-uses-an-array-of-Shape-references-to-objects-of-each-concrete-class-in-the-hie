
public class Cube extends ThreeDimensionalShape {

    public Cube(double dim1) {
        super(dim1);
    }
    
    private double cubeArea = 6 * Math.pow(getDimOne(), 2.0);
    private double cubeVolume = Math.pow(getDimOne(), 3.0);

    @Override
    public double getArea() {
        return cubeArea;
    }

    @Override
    public double getVolume() {
        return cubeVolume;
    }
    
    @Override 
    public String toString()    {
        return " length: " + getDimOne(); 
    }
}
