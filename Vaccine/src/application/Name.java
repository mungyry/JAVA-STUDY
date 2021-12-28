package application;

public class Name {
	private String name; // 이름
	private String resident_num; // 주민번호
	private int phonenum; // 폰번호 

	public Name(String name, String resident_num, int phonenum) {
		this.name = name;
		this.resident_num = resident_num;
		this.phonenum = phonenum;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getResident_num() {
		return resident_num;
	}
	public void setResident_num(String resident_num) {
		this.resident_num = resident_num;
	}

	public int getPhonenum() {
		return phonenum;
	}
	
	public void setPhonenum(int phonenum) {
		this.phonenum = phonenum;
	}

	@Override
	public String toString() {
		return "Name [이름=" + name + ", 주민번호=" + resident_num + ", 폰번호=" + phonenum + "]";
	}
	}

