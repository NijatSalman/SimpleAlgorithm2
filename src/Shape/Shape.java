package Shape;

public abstract  class Shape {
	
	private double teref;

	public Shape(int teref)
	{
		setTeref(teref);
	}
	
	public double getTeref() {
		return teref;
	}

	public void setTeref(double teref) {
		this.teref = teref;
	}
	
	public abstract double getArea();
	
	public abstract String toString();
		
}
	
	

