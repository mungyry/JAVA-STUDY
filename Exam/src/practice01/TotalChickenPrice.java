package practice01;

import java.util.ArrayList;

public class TotalChickenPrice {
	public static void main(String[] args) {
		// ArrayList 생성
		ArrayList<Chicken> order = new ArrayList<Chicken>();
		
		// 1 주문한 치킨을 ArrayList에 추가		
		order.add(new Chicken("후라이드",9900));
		order.add(new Chicken("양념",10900));
		order.add(new Chicken("간장",11900));
		
		// 2. ArrayList를 순회하여 총합을 구하세요
		int sum =0;
		for(int i =0; i < order.size(); i++) {
			Chicken temp = order.get(i);
			sum = sum + temp.getPrice(); 
		}
		
		// 결과 출력
		System.out.printf("총합 : %d원 \n", sum);
	}
}


