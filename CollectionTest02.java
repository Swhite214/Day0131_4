package collection;

import java.util.ArrayList;
import java.util.List;

public class CollectionTest02 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		char[] arr= new char[] {'A'};
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add(new String(arr)); //이건가능
		//list는 중복을 허용하는 컬렉션입니다.
		System.out.println(list.size());
		for(int i=1; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

}
