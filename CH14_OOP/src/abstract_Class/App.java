package abstract_Class;

public class App {

	public static void main(String[] args) {
		// 추상 클래스
//		GameObject obj = new GameObject(); 추상클래스는 객체 생성 불가
		
		GameObject[] objs = {new Player(), new Monster() };
		
		for(GameObject ob : objs ) {
			System.out.println(ob);
			ob.describe();
			
		}

	}

}
