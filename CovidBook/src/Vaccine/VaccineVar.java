package Vaccine;

public class VaccineVar {
	private String name; // 이름
	private String residentNum; // 주민번호
	private String phoneNum; // 휴대폰번호
	private String vaccinetype; // 백신 종류
	private String date; // 백신 접종일

	public String getName() {
		return name;
	}
	public void setName(String name) {
		// 변수명 앞에 this 붙이면 필드 뜻함.
		this.name = name;
	}

	public String getResidentNum() {
		return residentNum;
	}
	public void setResidentNum(String residentNum) {
		this.residentNum = residentNum;
	}	

	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}	

	public String getVaccinetype() {
		return vaccinetype;
	}
	public void setVaccinetype(String vaccinetype) {
		this.vaccinetype = vaccinetype;
	}	

	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}	

	@Override
	public String toString() {
		return "Var [이름=" + name + ", 주민번호=" + residentNum + ", 휴대폰번호=" + phoneNum + ", 백신종류="
				+ vaccinetype + ", 접종일=" + date + "]";
	}
	
}
