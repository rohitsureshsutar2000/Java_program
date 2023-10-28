package student;

public class MainFun {

	public static void main(String[] args) {

		InsertData obj=new InsertData();
		obj.insert();
		DisplayData.DisplayFunction(obj);
		
		InsertData obj1=new InsertData();
		obj1.insert();
		DisplayData.DisplayFunction(obj1);

//		public String toString()
//		{
//			return this.id+this.name+this.marks;
//		}
		
	}

}
