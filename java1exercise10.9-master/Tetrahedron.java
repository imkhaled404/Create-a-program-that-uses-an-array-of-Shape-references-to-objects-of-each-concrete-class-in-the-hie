
public class Tetrahedron extends ThreeDimensionalShape{

	public Tetrahedron (double dim1, double dim2, double dim3)	{
		super(dim1, dim2, dim3);
	}

	private double tetrahedronArea = 4 * (0.5 * getDimOne() * getDimTwo()) ;
	private double tetrahedronVolume = ((0.5 * getDimOne() * getDimTwo()) * getDimThree())/3;
	
	@Override
	public double getArea()	{
		return tetrahedronArea;
	}
	
	@Override
	public double getVolume()	{
		return tetrahedronVolume;
	}
		
	@Override
	public String toString()	{
		return " base width: " + getDimOne() + " base height: " + getDimTwo() + " height " + getDimThree();  
	}
}
