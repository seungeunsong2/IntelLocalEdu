public class ConditionBasic11 {

	public static void main(String[] args) {
		
		//삼항연산자, 조건연산자
		//조건식? 식1: 식2;
		//true이면 식1 실행
		//false면 식2 실행
		
		int rslt = 0;
		rslt = 5 > 0 ? 10 : -10;
		System.out.println(rslt);
		
		rslt = 5 < 0 ? 10 : -10;
		System.out.println(rslt);
		
		rslt = 5 < 0 ? 10 : 5 >-10 ? -10 : 0;
		System.out.println(rslt);
		
	}

}
