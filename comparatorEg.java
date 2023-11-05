package practiceProgram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student
{
	private int id;
	private String name;
	public Student() {
		super();
	}
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
}



public class comparatorEg {	
	public static void main(String[] args) {
		Comparator<Student> com= new Comparator<Student>()
		{

			@Override
			public int compare(Student o1, Student o2) {
				if (o1.getId()>o2.getId())
					return 1;
				else if(o1.getId()==o2.getId())
					return 0;
				else
					return -1;
			}
			

		};
		
		List<Student> lst=new ArrayList<>();
		lst.add(new Student(10,"raj"));
		lst.add(new Student(5,"mayu"));
		lst.add(new Student(3,"didi"));
		lst.add(new Student(6,"pillu"));
		
		Collections.sort(lst,com);
		for (Student i:lst) 				//if u dont write toString function and try to print List or any thing the it will memory address
		{
			System.out.println(i);
		}
		

	}

}
