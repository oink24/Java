package for_loop;

/*
 * 날짜 : 2023/06/17
 * 이름 : 강나은
 * 내용 : Java for문 활용한 별 찍기
 * 
 * 출력할 결과물
 * ***** *****
 * ****   ****
 * ***     ***
 * **       **
 * *         *
 * **       **
 * ***     ***
 * ****   ****
 * ***** *****
 */
public class StarPatterns11 {
	public static void main(String[] args) {
		
		// 아래로 갈수록 줄어드는 별 구현
		for (int i=1 ; i<=5 ; i++) // 줄 개수
		{
			for (int j=5 ; j>=i ; j--) // 왼쪽부분 별 출력
			{
				System.out.print("*");
			}
			for (int j=1 ; j<=i*2-1 ; j++) //공백 출력
			{
				System.out.print(" ");
			}
			for (int j=5 ; j>=i ; j--) // 오른쪽부분 별 출력
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		// 아래로 갈수록 늘어나는 별 구현
		for (int i=1 ; i<=4 ; i++)
		{
			for (int j=2 ; j<=i+2 ; j++) // 왼쪽부분 별 출력 3456
			{
				System.out.print("*");
			}
			for (int j=8 ; j>=i*2 ; j--) // 공백 출력 2468
			{
				System.out.print(" ");
			}
			for (int j=2 ; j<=i+2 ; j++) // 오른쪽부분 별 출력
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
