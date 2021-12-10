package hashmap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class ORderedMap {

	public static void main(String[] args) {
		// Map 정렬
		// HashMap, LinkedHashMap(입력순서대로), TreeMap(정렬)
		
		Map<Integer, String> months1 = new LinkedHashMap<>();
		months1.put(1, "1월");
		months1.put(3, "3월");
		months1.put(6, "6월");	
		months1.forEach((k,v) -> System.out.println(k + " : " + v));
		
		Map<Integer, String> months2 = new TreeMap<>();				
		months2.put(1, "1월");
		months2.put(3, "3월");
		months2.put(6, "6월");		
		months2.forEach((k,v) -> System.out.println(k + " : " + v));
		
		
		
		
	}

}
