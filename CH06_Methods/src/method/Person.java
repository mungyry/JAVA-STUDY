package method;

public class Person {
	// 클래스 안의 일반변수 => 인스턴스 변수(객체 생성시 생성됨)
	String name;
	int age;
	
	// 클래스 안의 만든 함수를 메소드라 부른다. => 객체 생성시 사용가능
	void sayHello() {   // sayHello 라는 메소드임, void는 리턴시켜줌
		System.out.println("헬로우" + name);
	}
}


