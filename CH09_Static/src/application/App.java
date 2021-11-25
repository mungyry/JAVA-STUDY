package application;

public class App {

	public static void main(String[] args) {
		// 스태틱 변수는 클래스명.변수로 객체 생성없이 사용, 그리고 메소드에 static 붙으면 객체 상관없이 클래스명.메소드로 사용가능
		System.out.println(Cat.FOOD);
		System.out.println(Math.PI);

		System.out.println(Cat.count);
	    Cat cat1 = new Cat("마틸타");
	    System.out.println(Cat.getCount());
	    Cat cat2 = new Cat("라이언");
	    System.out.println(Cat.getCount());
	    
	    System.out.println(cat1.toString());
	    System.out.println(cat2.toString());
	    Cat cat3 = new Cat("울버린");
	    System.out.println(cat3.getCount());
	    System.out.println(cat3.toString());
	}

}
