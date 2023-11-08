package employee;

import java.time.LocalDate;

public class Vendors extends Employee{
	private int noOfEmp;
	private double amt;
	public Vendors()
	{
		super();
		
		
	}
	public Vendors(int id, String name, String mobile, String email,int dept, String desg, LocalDate doj,int noOfEmp, double amt) {
		super(id,name,mobile,email,dept,desg,doj);
		this.noOfEmp = noOfEmp;
		this.amt = amt;
	}
	public int getNoOfEmp() {
		return noOfEmp;
	}
	public void setNoOfEmp(int noOfEmp) {
		this.noOfEmp = noOfEmp;
	}
	public double getAmt() {
		return amt;
	}
	public void setAmt(double amt) {
		this.amt = amt;
	}
	@Override
	public String toString() {
		return super.toString()+"Vendors [noOfEmp=" + noOfEmp + ", amt=" + amt + "]";
	}
	
}
