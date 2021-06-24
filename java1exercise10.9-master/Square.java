

public class Square extends TwoDimensionalShape {
	
	public Square(double dim1) {
		super(dim1);
	}

	private double squareArea = getDimOne() * getDimOne(); 
	
	@Override
	public double getArea()
	{
		return squareArea;
	}
	

	@Override //first line of console
	public String toString()
	{
		return " length: " + getDimOne();
	}

}