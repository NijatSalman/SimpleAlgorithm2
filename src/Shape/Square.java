package Shape;

public class Square extends TwodimensionalShape {

	public Square(int teref) {
		super(teref);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return Math.pow(getTeref(), 2);
	}

	

}
