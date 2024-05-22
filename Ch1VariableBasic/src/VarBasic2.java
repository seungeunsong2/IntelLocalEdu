import java.util.Scanner;

public class VarBasic2 {

	public static void main(String[] args) {
//      문자열
//      String str = "abvc";
////      문자
//      char ch = 'a';
//      
//      byte b = 1;
//      
//      int num = 100;
//      
////      concat, 합성, 더하다
//      System.out.println("sdsfdjlsdsdfk" + num);
//      System.out.println("아\t" + "한글이 된다");
//      System.out.println(str + "헐 뭐야/?");
//      
////      문자열 + any type -> 문자열 + 문자열 -> 문자열
////      any type + 문자열  -> 문자열 + 문자열 -> 문자열
//      
//      
//      System.out.println(" " + " " + 7);
//      System.out.println(7 + 7 + "");
//      System.out.println("" + 7 + 7);

      Scanner scan = new Scanner(System.in);
      
      String input = scan.nextLine();
      //num = scan.nextInt();
      
      System.out.println("니가 작성한 글이야~-> " + input);
   }
   
}
