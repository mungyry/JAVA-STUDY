package enum_methods;

public class App {

public static void main(String[] args) {
	// enum에서 사용하는 메소드
	
	Fruit[] fruits = Fruit.values(); // enum의 모든 상수들을 배열로 리턴
	
	for(Fruit f : fruits ) {
		System.out.println(f);
	}
	
	for(Fruit f : Fruit.values() ) {
		System.out.println(f);
	}
	
	// ordinal() : enum의 상수의 순서(인덱스 번호), 배열의 주소값
	System.out.println(Fruit.ORANGE.ordinal());
	System.out.println(Fruit.APPLE.ordinal());
	System.out.println(Fruit.BANANA.ordinal());

	// valueOf("상수값") : 상수값과 같은 enum을  찾음
	Fruit f1 = Fruit.valueOf("ORANGE");
	System.out.println(f1);
	System.out.println(f1 == Fruit.ORANGE);
	
}
}