package test6;

/*
 * 날짜 : 2023/07/18
 * 이름 : 강나은
 * 내용 : Java 총정리 연습문제2
 * 
 */
public class Test09 {
	public static void main(String[] args) {
		
		pyramid(3);
		pyramid(5);
		pyramid(7);		
	}
	
	public static void pyramid(int n) {
		for (int i=1 ; i<=n ; i++) // 줄 갯수
		{
			for (int j=i ; j<n ; j++)
				System.out.print(" "); // 공백출력
			
			for (int k=1 ; k<=2*i-1 ; k++)
				System.out.print("*"); // 별 출력
			
			System.out.println();
		}
	}
}
