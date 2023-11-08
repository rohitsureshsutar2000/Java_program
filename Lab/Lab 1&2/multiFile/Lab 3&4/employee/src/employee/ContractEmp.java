package employee;

import java.time.LocalDate;

public class ContractEmp extends Employee {
	private int hr;
	private int charges;
	public ContractEmp() {
		super();
		
	}
	public ContractEmp(int id, String name, String mobile, String email,int dept, String desg, LocalDate doj,int hr, int charges) {
		super(id,name,mobile,email,dept,desg,doj);
		this.hr = hr;
		this.charges = charges;
	}
	public int getHr() {
		return hr;
	}
	public void setHr(int hr) {
		this.hr = hr;
	}
	public int getCharges() {
		return charges;
	}
	public void setCharges(int charges) {
		this.charges = charges;
	}
	@Override
	public String toString() {
		return super.toString()+"ContractEmp [hr=" + hr + ", charges=" + charges + "]";
	}
	
}
