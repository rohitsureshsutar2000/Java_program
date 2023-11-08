package Team;

import java.util.Arrays;

public class Team {
	private int tno;
	private String tname;
	private Player captain;
	private Player[] arr;
	public Team() {
		super();
	}
	public Team(int tno, String tname, Player captain, Player[] arr) {
		super();
		this.tno = tno;
		this.tname = tname;
		this.captain = captain;
		this.arr = arr;
	}
	public int getTno() {
		return tno;
	}
	public void setTno(int tno) {
		this.tno = tno;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public Player getCaptain() {
		return captain;
	}
	public void setCaptain(Player captain) {
		this.captain = captain;
	}
	public Player[] getArr() {
		return arr;
	}
	public void setArr(Player[] arr) {
		this.arr = arr;
	}
	@Override
	public String toString() {
		return "Team [tno=" + tno + ", tname=" + tname + ", captain=" + captain + ", arr=" + Arrays.toString(arr) + "]";
	}
	
}
