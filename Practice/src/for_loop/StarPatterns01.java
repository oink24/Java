package for_loop;

/*
 * 날짜 : 2023/06/13
 * 이름 : 강나은
 * 내용 : Java for문 활용한 별 찍기
 * 
 * 출력할 결과물
 * *
 * **
 * ***
 * ****
 * *****
 */
public class StarPatterns01 {
	public static void main(String[] args) {
		for (int i=1 ; i<=5 ; i++) {
			
			for (int j=0 ; j<i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
