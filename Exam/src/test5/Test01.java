package test5;

/*
 * 날짜 : 2023/07/17
 * 이름 : 강나은
 * 내용 : Java 총정리 연습문제
 * 
 */
public class Test01 {
	public static void main(String[] args) {
		
		char a = 'A';
		int b = a;
		char c = 66;
		int d = a + b;
		
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		System.out.println("c : " + c);
		System.out.println("d : " + d);
		
		float  n1 = 301415922653589793f;
		double n2 = 301415922653589793d;
		
		int n3 = (int) n1;
		int n4 = (int) n2;
		
		System.out.println("n1 : " + n1);
		System.out.println("n2 : " + n2);
		System.out.println("n3 : " + n3);
		System.out.println("n4 : " + n4);
		
		String str1 = "홍길동";
		String str2 = null;
		String str3 = "Hello\nWorld\nKorea";
		
		System.out.println("str1 : " + str1);
		System.out.println("str2 : " + str2);
		System.out.println("str3 : " + str3);
	}
}
