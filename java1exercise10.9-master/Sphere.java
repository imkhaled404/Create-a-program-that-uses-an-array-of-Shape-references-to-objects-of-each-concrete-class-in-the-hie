
public class Sphere extends ThreeDimensionalShape {
	
	public Sphere(double dim1) {
		super(dim1);
	}

	private double sphereArea = 4 * (Math.pow(getDimOne(), 2) * Math.PI);
	private double sphereVolume = Math.PI * 4/3 * Math.pow(getDimOne(), 3.0);
	
	@Override
	public double getArea() {
		return sphereArea;
	}

	@Override
	public double getVolume() {
		return sphereVolume;
	}
	
	@Override 
	public String toString()	{
		return " radius: " + getDimOne(); 
	}
}
