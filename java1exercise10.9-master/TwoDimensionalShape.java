public abstract class TwoDimensionalShape extends Shape {	
	
	public TwoDimensionalShape(double dim1) {
		super(dim1);
	}
	
	public TwoDimensionalShape(double dim1, double dim2) {
		super(dim1, dim2);
	}
	
	public abstract double getArea();	
}
