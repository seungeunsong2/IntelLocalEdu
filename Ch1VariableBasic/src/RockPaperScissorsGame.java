import java.util.Scanner;

public class RockPaperScissorsGame {

	public static void main(String[] args) {
		int user, com;
		
		System.out.println("가위(1), 바위(2), 보(3) 중 하나를 입력");
		
		Scanner scan = new Scanner(System.in);
		
		user = scan.nextInt(); 
		
		com = (int)(Math.random() * 3) + 1;
		
		
		System.out.println("당신은 " + user + "입니다");
		System.out.println("컴은 " + com + "입니다");
		System.out.println();
		
		switch (user - com) {
			case 2, -1:
				System.out.println("당신이 졌습니다.");
				break;
			case 1, -2:{
				System.out.println("당신이 이겼습니다.");
				break;
			}
				
			case 0: {
				System.out.println("비겼습니다");
				break;
			}
				
		}
		
		System.out.println("프로그램 종료");
	}
	
	
	
	
}
