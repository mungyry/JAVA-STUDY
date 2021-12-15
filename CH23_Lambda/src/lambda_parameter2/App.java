package lambda_parameter2;

interface Runner {
	void execute(String name, String text); // 무상메소드에 매개변수가 있는경우
}
public class App {
	public static void main(String[] args) {
		// 매개 변수가 있는 경우
		Runner run1 = (n, t) -> System.out.printf("%s님 %s", n,t );
		run1.execute("펭수", "안녕하세요");
		
	}

}
