package ch04.confirm;

/*
 * 날짜 : 2023/07/18
 * 이름 : 강나은
 * 내용 : Ch04 확인문제 5번
 * 
 */
public class Test05 {
	public static void main(String[] args) {
		
		for (int x=1 ; x<=10 ; x++)
		{
			for (int y=1 ; y<=10; y++)
			{
				if (4*x + 5*y == 60)
					System.out.printf("(%d, %d)", x, y);
			}
		}
	}
}
