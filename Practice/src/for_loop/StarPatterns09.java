package for_loop;

/*
 * 날짜 : 2023/06/15
 * 이름 : 강나은
 * 내용 : Java for문 활용한 별 찍기
 * 
 * 출력할 결과물
 * *********
 *  *******
 *   *****
 *    ***
 *     *
 */
public class StarPatterns09 {
	public static void main(String[] args) {
		
		for (int i=1 ; i<10 ; i+=2) // 줄 개수
		{
			for (int j=0 ; j<=i ; j+=2) // 공백 출력
			{
				System.out.print(" ");
			}
			for (int j=9 ; j>=i ; j--) // 별 출력
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
