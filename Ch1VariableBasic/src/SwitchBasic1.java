import java.util.Scanner;

public class SwitchBasic1 {

	public static void main(String[] args) {

		
		System.out.println("계절");
		int month = 0;
		String monthStr= "";
		
		switch (month) {
		case 3: case 4: case 5:
			monthStr = "봄";
			break;
			
		case 6: case 7: case 8:
			monthStr = "여름";
			break;
			
		case 9: case 10: case 11:
			monthStr = "가을";
			break;
			
		case 12: case 1: case 2:
			monthStr = "겨울";
			break;
			
		default:
			monthStr = "특이한 계절";
		}
		System.out.println("계절: " + monthStr);
	}

}
