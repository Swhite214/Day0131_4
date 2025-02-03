package arrays;

import java.util.HashMap;
import java.util.Map;

public class Collection03 {

	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<String, Integer>();
		
		map.put("a", 10);
		map.put("a", 100);
		map.put("a", 1000);
		map.put("b", 100);
		map.put(new String("b"), 1000);
		
		
		System.out.println(map.size());
		System.out.println(map.get("a"));//키값 중복불가 오류가나는것이 아니라 덮어써지는형태입니다.
		System.out.println(map.get("b"));
	}

}
