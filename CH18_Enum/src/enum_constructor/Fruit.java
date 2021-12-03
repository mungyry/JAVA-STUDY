package enum_constructor;

public enum Fruit { // keyword 가 enum
	APPLE("초록색"), BANANA("노란색"), ORANGE("주황색"); // 상수들의 집합
	
	private String color;
	
	Fruit(String color) { // enum의 생성자
		this.color = color;
	}
	
	public String toString() {
		return super.toString().toLowerCase()+" ("+color+")";
	}
	
}
