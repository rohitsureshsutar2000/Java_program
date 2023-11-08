package Team;

public class Player {
	private int no;
	private String name;
	private String skill;
	public Player() {
		super();
	}
	public Player(int no, String name, String skill) {
		super();
		this.no = no;
		this.name = name;
		this.skill = skill;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	@Override
	public String toString() {
		return "Player [no=" + no + ", name=" + name + ", skill=" + skill + "]";
	}
	
}
