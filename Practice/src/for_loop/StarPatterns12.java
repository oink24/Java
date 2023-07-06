package for_loop;

public class StarPatterns12 {
	public static void main(String[] args) {
		
		for (int i=1 ; i<=4 ; i++) // 줄 갯수
		{
			for (int j=3 ; j>=i ; j--) // 왼쪽부분 ☆ 출력
			{
				System.out.print("☆");
			}
			for (int j=1 ; j<=i*2-1 ; j++) // 중간부분 ★ 출력
			{
				System.out.print("★");
			}
			for (int j=3 ; j>=i ; j--) // 오른쪽부분 ☆ 출력
			{
				System.out.print("☆");
			}
			System.out.println(); // 개행
		}
	}
}