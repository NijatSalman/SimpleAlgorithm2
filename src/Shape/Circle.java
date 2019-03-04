package Shape;

public class Circle extends TwodimensionalShape {

	public Circle(int teref) {
		super(teref);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return Math.PI * Math.pow(getTeref(), 2);
	}
	  
       
}
