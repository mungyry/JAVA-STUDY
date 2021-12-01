package method_Overloading;

public class Person {
	public void greet() {
		// 이름이 같은 그리트 메소드가 2개 이지만 매개변수가 다르면 다른 메소드로 인식
		System.out.println("헬로우");
	}
	public void greet(String name) {
		System.out.println("헬로우 " + name);
		
	}
		public void greet(int height) {
			if( height > 185) {
				System.out.println("키가 크군요");
			}
			System.out.println("헬로우 ");
		}
		public void greet(String name, int height) {
			if( height > 185) {
				System.out.println("키가 크군요");
			}
			System.out.println("헬로우 "+ name);
			
	}
}
