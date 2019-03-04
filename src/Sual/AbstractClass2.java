package Sual;

public   class AbstractClass2 extends AbstractClass {
    
	int b;
	
	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public AbstractClass2(int a,int b) {
		super(a);
		setB(b);
	}

	@Override
	public int metod() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void interfeysmetod() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int interfeysmetod2() {
		// TODO Auto-generated method stub
		return 0;
	}
	


	
  
}
