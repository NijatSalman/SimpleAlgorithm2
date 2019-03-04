package Shape;

public class Triangle extends TwodimensionalShape{

	public Triangle(int teref) {
		super(teref);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return (Math.pow(getTeref(), 2)*Math.pow(3,0.5)/4);
	}

}
