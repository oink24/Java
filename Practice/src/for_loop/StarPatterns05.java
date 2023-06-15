package for_loop;

/*
 * 날짜 : 2023/06/15
 * 이름 : 강나은
 * 내용 : Java for문 활용한 별 찍기
 * 
 * 출력할 결과물
 * *
 * **
 * ***
 * ****
 * *****
 * ****
 * ***
 * **
 * *
 */
public class StarPatterns05 {
	public static void main(String[] args) {
		
		for (int i=1 ; i<=5 ; i++) // 줄 개수
		{
			for (int j=1 ; j<=i ; j++) // 별 출력
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		// 아래로 갈수록 줄어드는 별 구현
		for (int i=1 ; i<=4 ; i++) // 줄 개수
		{
			for (int j=4 ; j>=i ; j--) // 별 출력
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
