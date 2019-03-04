package Shape;

public class Cube extends ThreedimensionalShape{

	public Cube(int teref) {
		super(teref);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 6*Math.pow(getTeref(), 2);
	}

	@Override
	public double getVolume() {
		// TODO Auto-generated method stub
		return Math.pow(getTeref(), 3);
	}



}
