
public class ForBasic1 {

	public static void main(String[] args) {
		
		//for문은 반복 횟수를 알고 있을 때 적합하다.
		//구조가 직관적이라 이해하기 쉽다.
		/*표현식(expression)
		for(초기화; 조건식; 증감식) {
			조건식이 참일 때 수행할 문장들 작성*/
			
		//}
		
	/*	for(int i = 0; i <= 5; i++) {
			System.out.println("I can do it");
			System.out.println("\t");
			System.out.println();*/
		
		for(int i = 9; i >= -5; i--) {
			if(i == 5 || i == 0) {
				System.out.print(i + "\n");
			}else {
				System.out.print(i + " ");
				//System.out.print(" ");
			}
			
		}
	}

}
