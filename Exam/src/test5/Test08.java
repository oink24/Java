package test5;

/*
 * 날짜 : 2023/07/17
 * 이름 : 강나은
 * 내용 : Java 총정리 연습문제
 * 
 */
public class Test08 {
	public static void main(String[] args) {
		
		for (int y=1 ; y<=9 ; y++)
		{
			for (int x=2 ; x<=9 ; x++)
				System.out.printf("%d X %d = %2d\t", x, y, x*y);
			System.out.println(); // 개행
		}
	}
}
