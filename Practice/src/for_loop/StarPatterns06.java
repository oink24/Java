package for_loop;

/*
 * 날짜 : 2023/06/15
 * 이름 : 강나은
 * 내용 : Java for문 활용한 별 찍기
 * 
 * 출력할 결과물
 * *****
 * ****
 * ***
 * **
 * *
 * **
 * ***
 * ****
 * *****
 */
public class StarPatterns06 {
	public static void main(String[] args) {
		
		for (int i=1 ; i<=5 ; i++) // 줄 개수
		{
			for (int j=5 ; j>=i ; j--) // 별 출력
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		// 아래로 갈수록 늘어나는 별 구현
		for (int i=1 ; i<=4 ; i++) // 줄 개수
		{
			for (int j=2 ; j<=i+2 ; j++) // 별 개수
			{ 
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
