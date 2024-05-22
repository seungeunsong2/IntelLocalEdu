
public class CastingBasic1 {

	public static void main(String[] args) {
		
		// boolean을  제외한 나머지 7개의 기본형은 서로 형변환이 가능하다.
		// 기본형과 참조형은 서로 형변환할 수 없다.
		// 서로 다른 타입의 변수간의 연산문 형변환을 하는 것이 원칙이지만,
		// 값의 범위가 작은 타입에서 큰 타입으로 형변환은 생략할 수 없다
		
		int firstNum = 0;
		int secondNum = 0;
		
		int totalNum = 0;
		double avg = 0.0;
		
		// 총점과 평균을 구하시오
		firstNum = 10;
		secondNum = 7;
		
		totalNum = firstNum + secondNum;
		System.out.println(totalNum);
		
		avg = (double)totalNum / 3;
		System.out.println("평균: " + avg);
		
		//소수점 3째자리 올림
		//소수점 3째자리 반올림
		
				
		System.out.println("올림: " + Math.ceil(avg * 100) / 100.0);
		System.out.println("반올림: " + Math.round(avg * 100) / 100.0);
		
		avg = avg + 0.005;
		System.out.println(avg);
		
		avg = avg * 100;
		System.out.println(avg);
		
		avg = (int)avg;
		System.out.println(avg);
		
		avg = avg / 100;
		System.out.println(avg);

	}

}
