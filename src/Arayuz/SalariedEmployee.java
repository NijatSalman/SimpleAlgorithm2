package Arayuz;

public class SalariedEmployee extends Employee{

	private double salary;
	
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public double getPaymentAmount() {
		// TODO Auto-generated method stub
		return getSalary();
	}

}
