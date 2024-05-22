import java.util.Scanner;

public class GugudanExam1 {

	public static void main(String[] args) {
		
		System.out.println("숫자 입력");
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		switch(n * 2) {
		case 2:
			for(int j = 1; j < 10; j++) {
				for(int i = 2; i < 10; i++) {
					System.out.print(i + "*" + j + "=" + i * j);
					System.out.print("\t");
					if(i == 9) {
						System.out.println("");
					}
					}
				}
			break;
				
		case 4:
			for(int i = 2; i < 10; i++) {
				for(int j = 1; j < 10; j++) {
					System.out.print(i + "*" + j + "=" + i * j);
					System.out.print("\t");
					if(j == 9) {
						System.out.println("");
					}
				}
			}break;
		}
		
	}

}
