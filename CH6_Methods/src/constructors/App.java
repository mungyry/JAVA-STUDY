package constructors;

public class App {

	public static void main(String[] args) {
		// 생성자 : 클래스의 특별한 메소드
		Person p1 = new Person();    // p1, p2 ,p3 는 각각 다른 객체임
		// 기본 생서자는 생략 가능
		p1.setName("펭수");
		p1.setHeight(120.0);
		
		Person p2 = new Person();
		p2.setName("길동");
		p2.setHeight(180.0);
		
		Person p3 = new Person();
//		p3.setName("민수");
//		p3.setHeight(150.0);
		
		System.out.printf("이름 : %s, 키 : %.1f \n", p1.getName(), p1.getHeight());
		System.out.printf("이름 : %s, 키 : %.1f \n", p2.getName(), p2.getHeight());
		System.out.printf("이름 : %s, 키 : %.1f \n", p3.getName(), p3.getHeight());
		
		
	}

}
