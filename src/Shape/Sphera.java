package Shape;

public class Sphera extends ThreedimensionalShape {

	public Sphera(int teref) {
		super(teref);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 4*Math.PI*Math.pow(getTeref(), 2);
	}

	@Override
	public double getVolume() {
		// TODO Auto-generated method stub
		return 4/3*Math.PI*Math.pow(getTeref(), 2);
	}


}
