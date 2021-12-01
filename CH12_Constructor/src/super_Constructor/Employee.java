package super_Constructor;

public class Employee extends Person{ // Person 상속
	public Employee() {
		super("익명"); // 부모클래스의 생성자, 생략되어있음
		System.out.println("Employee 생성자");
	}
	
	public Employee(String name) {
		super(name);
		System.out.println("Employee 생성자");
	}
}
