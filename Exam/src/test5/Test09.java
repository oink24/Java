package test5;

/*
 * 날짜 : 2023/07/17
 * 이름 : 강나은
 * 내용 : Java 총정리 연습문제
 * 
 */
public class Test09 {
	public static void main(String[] args) {
		
		int count = 0;
		for (int i=0 ; i<7 ; i++)
		{
			if (i <= 3)
				count++;
			else
				count--;
			
			for (int j=1 ; j<5-count ; j++)
				System.out.print("☆");
			
			for (int k=1 ; k<count*2 ; k++)
				System.out.print("★");
			
			for (int j=1 ; j<5-count ; j++)
				System.out.print("☆");
			
			System.out.println(); // 개행
		}
		System.out.println(); // 개행
	}
}
