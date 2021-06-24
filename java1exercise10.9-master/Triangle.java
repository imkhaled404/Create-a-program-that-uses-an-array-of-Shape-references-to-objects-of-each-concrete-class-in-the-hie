public class Triangle extends TwoDimensionalShape {
	
	//2 arg constructor
	public Triangle(double dim1, double dim2) {
		super(dim1, dim2);
	}

	private double triangleArea = getDimOne() * getDimTwo() * 0.5;
	
	@Override
	public double getArea()	{
		return triangleArea;
	}
	
	@Override 
	public String toString(){
		return " base: " + getDimOne() + " height: " + getDimTwo(); 
	}
}