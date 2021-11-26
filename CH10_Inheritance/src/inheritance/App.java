package inheritance;

public class App {

	public static void main(String[] args) {
		// 동물 클래스는 메소드 eat()
		Animal ani = new Animal(); // 객체생성
		ani.eat(); // 객체.메소드명
		
		// 새 클래스는 메소드 fly()
		Bird bird = new Bird();
		bird.eat(); // Bird 클래스에 eat가 없지만 Animal 클래스의 eat를 상속(extends Animal 문구가 추가되어)받았기 때문에 사용가능
		bird.fly();
		
		
	}

}
