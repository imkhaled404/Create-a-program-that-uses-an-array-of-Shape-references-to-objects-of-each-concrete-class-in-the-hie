
public abstract class ThreeDimensionalShape extends Shape {

	public ThreeDimensionalShape(double dim1) {
		super(dim1);
	}
	
	public ThreeDimensionalShape (double dim1, double dim2, double dim3)	{
		super(dim1, dim2, dim3);
	}
	
	public abstract double getArea();
	public abstract double getVolume();
}
