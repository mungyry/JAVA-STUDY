package method_Overloading;

public class App {

	public static void main(String[] args) {
		// 메소드 오버로딩(메소드 이름이 같고 매개변수나 타입이 다를떄)
		Person p = new Person();

		p.greet();
		p.greet("펭수");
		System.out.println("123");
		System.out.println(123);
		System.out.println(1.23);
		
		
	}

}
