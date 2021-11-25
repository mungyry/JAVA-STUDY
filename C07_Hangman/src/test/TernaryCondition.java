package test;

public class TernaryCondition { // 삼항 조건 연산자

	public static void main(String[] args) {
		// 조건 ? A : B (조건이 참이면 A 아니면 B 이다)
		System.out.println(true ? "참":"아님");
		System.out.println(false ? "참":"아님");
		
		int n = 99;
		n = n > 100 ? 100 : n;
		System.out.println(n);
		
		int[] values = { 6, 3, 92, 64, 17 };
		int max = 0; //최대값
		for(int val : values) {
//			if( val > max) {
//				max = val; // 맥스값보다 val가 크면
//			}
			max = val > max ? val : max;
		}
		System.out.println(max);
	}

}
