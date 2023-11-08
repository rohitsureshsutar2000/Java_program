package employee;

import java.time.LocalDate;

public class Sal_emp extends Employee {
	private double sal;
	private int bonus;
	
	public Sal_emp() {
		super();

	}

	public Sal_emp(int id, String name, String mobile, String email,int dept, String desg, LocalDate doj,double sal, int bonus) {
		super(id,name,mobile,email,dept,desg,doj);
		this.sal = sal;
		this.bonus = bonus;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	@Override
	public String toString() {
		return super.toString()+"Sal_emp [sal=" + sal + ", bonus=" + bonus + "]";
	}
	
	
}
