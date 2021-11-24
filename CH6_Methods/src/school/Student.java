package school;

public class Student {
	private String name;
	private int age;
	private boolean visible; // 집체 true, 원격 false
	private double temperature; // 온도체크
	
   // 생성자 자동생성 alt+shift+s ->constructor using feilds 후 원하는거 체크
	public Student(String name, int age) {
//		super();
		visible = true;
		temperature = 0.0;
		this.name = name;
		this.age = age;
	}
	
	// 자동완성 기능으로 getter setter 메소드 완성  
    // (마우스 우측클릭 or 알트+쉬프트+s -> 제너레이트 getters and setters-> select all
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isVisible() {
		return visible;
	}
	public void setVisible(boolean visible) {
		this.visible = visible;
	}
	public double getTemperature() {
		return temperature;
	}
	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}

	@Override

	// toString 메소드 자동(alt shift s -> toString 선택 확인 후 아래처럼 한글로 원하는거 이름 바꿔줌)
	public String toString() {
		return "학생 [이름=" + name + ", 나이=" + age + ", 집체=" + visible + ", 온도=" + temperature + "]";
	}
	
	
	
	


	
	
	
	
	
	
}
