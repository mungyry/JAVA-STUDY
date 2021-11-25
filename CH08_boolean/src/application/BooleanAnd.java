package application;

public class BooleanAnd {

	public static void main(String[] args) {
		// A && B => A,B 모두 참일때만 참
		boolean isRaining = true; // 비가 오는가?
		boolean haveUmbrella = true; // 우산을 가지고 있나?
		boolean takeUmbrella = false; // 우산을 쓰나?
		
		// 방법 1
		if(isRaining) {
			if(haveUmbrella) {
				takeUmbrella = true;
			}
		}
		System.out.println("첫번쨰 : " + takeUmbrella);
		
		// 방법 2		
		if(isRaining && haveUmbrella) {
			takeUmbrella = true;
		}
		System.out.println("두번쨰 : " + takeUmbrella);
		
		// 방법 3
		takeUmbrella = isRaining && haveUmbrella ? true : false;
		System.out.println("세번쨰 : " + takeUmbrella);
	}

}
