package employee;

import java.time.LocalDate;

public class Employee extends Person {
	private int dept;
	private String desg;
	private LocalDate doj;
	public Employee() {
		super();
		
	}
	public Employee(int id, String name, String mobile, String email,int dept, String desg, LocalDate doj) {
		super(id,name,mobile,email);
		this.dept = dept;
		this.desg = desg;
		this.doj = doj;
	}
	public int getDept() {
		return dept;
	}
	public void setDept(int dept) {
		this.dept = dept;
	}
	public String getDesg() {
		return desg;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
	public LocalDate getDoj() {
		return doj;
	}
	public void setDoj(LocalDate doj) {
		this.doj = doj;
	}
	@Override
	public String toString() {
		return super.toString()+"Employee [dept=" + dept + ", desg=" + desg + ", doj=" + doj + "]";
		
	} 
}
