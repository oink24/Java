package ch04.confirm;

/*
 * 날짜 : 2023/07/18
 * 이름 : 강나은
 * 내용 : Ch04 확인문제 6번
 * 
 */
public class Test06 {
	public static void main(String[] args) {
		
		for (int i=1 ; i<=5 ; i++) // 줄 갯수
		{
			for (int j=1 ; j<=i ; j++)
				System.out.print("*"); // 별 출력
			System.out.println(); // 개행
		}
	}
}
