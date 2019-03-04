package Shape;

public class Tetrahedron extends ThreedimensionalShape{

	public Tetrahedron(int teref) {
		super(teref);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return Math.pow(3, 0.5)*Math.pow(getTeref(), 2);
	}

	@Override
	public double getVolume() {
		// TODO Auto-generated method stub
		return Math.pow(2, 0.5)/12*Math.pow(getTeref(), 3);
	}


}
