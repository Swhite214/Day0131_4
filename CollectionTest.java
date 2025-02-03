package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CollectionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> sets = new HashSet<Integer>();
		sets.add(10);
		sets.add(9);
		sets.add(8);
		sets.add(7);
		sets.add(6);
		sets.add(5);
		sets.add(4);
		sets.add(3);
		sets.add(2);
		sets.add(10);
		
		for(int i=0; i<sets.size(); i++) {
			//get안됨 set은 인덱스가없습니다 그리고 중복도 허용안합니다.
		}
		Iterator<Integer> it = sets.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
