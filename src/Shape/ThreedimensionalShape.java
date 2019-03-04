package Shape;

public abstract class ThreedimensionalShape extends Shape{

	public ThreedimensionalShape(int teref) {
		super(teref);
		// TODO Auto-generated constructor stub
	}
	
	public abstract double getVolume();

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "sahe: " + getArea() + " hecm: " + getVolume();
	}
}
