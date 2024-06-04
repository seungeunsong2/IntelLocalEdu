package five78.basic;

import java.util.ArrayList;

public class BasicArrayListTest3 {
	
	public static void main(String[] args) {
		
//		Iterator
		
		ArrayList<Integer> numList = new ArrayList<>();
		
		for (int i = 0; i < 5; i++) {
			numList.add(i);
		}
		
		for (int num : numList) {
			System.out.println(num);
			
		}
		
	}


}
