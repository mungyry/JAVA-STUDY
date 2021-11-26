package entities;

public class Fruit {
	protected int id; // 다른 패키지 에서는 사용불가, 상속한 자식 클래스에서는 사용 가능

	@Override
	public String toString() {
		return "Fruit [id=" + id + "]";
		
	}
	
}
