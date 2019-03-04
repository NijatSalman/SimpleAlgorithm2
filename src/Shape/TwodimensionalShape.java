package Shape;

public abstract class TwodimensionalShape extends Shape {

	public TwodimensionalShape(int teref) {
		super(teref);
		// TODO Auto-generated constructor stub
	}
	
	public  String toString()
	{
		return "Sahe: " + getArea();
	}
}
