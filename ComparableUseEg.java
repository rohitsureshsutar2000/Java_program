package practiceProgram;

import java.util.ArrayList;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


//get id and name class in that Comparable method available
class rohit implements Comparable<rohit>
{
	private int id;
	private String name ;					// no need Equals
	
	public rohit() {
		super();
	}
	public rohit(int id, String name) {
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
		return "rohit [id=" + id + ", name=" + name + "]";
	}
	@Override
	public int compareTo(rohit o) {		// CompareTo is use Comparable
		return this.name.compareTo(o.name);
	}	
}




//main class in that main method available
public class ComparableUseEg {
	public static void main(String[] args) {
		List<Integer> lst=new ArrayList<>();
		lst.add(10);
		lst.add(20);
		lst.add(50);
		lst.add(30);
		lst.add(60);
		Collections.sort(lst);
		System.out.println(lst);
		
		
		// Lets try sort by name 
		List<rohit> nlst=new ArrayList<>();
		nlst.add(new rohit(1,"rohit"));
		nlst.add(new rohit(3,"manish"));
		nlst.add(new rohit(2,"nisha"));
		Collections.sort(nlst);
		System.out.println(nlst);				//output manish nisha rohit
	}
}
