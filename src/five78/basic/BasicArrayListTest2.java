package five78.basic;

import java.util.ArrayList;
import java.util.Iterator;

public class BasicArrayListTest2 {
	
	public static void main(String[] args) {
		
//		Iterator
		
		ArrayList<Integer> numList = new ArrayList<>();
		
		for (int i = 0; i < 5; i++) {
			numList.add(i);
		}
		
		Iterator it = numList.iterator();
		
		Object obj = null;
		
		while(it.hasNext()) {
			obj = it.next();
			
			System.out.println((int)obj);
		}
	}


}
