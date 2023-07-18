package ch04.confirm;

/*
 * 날짜 : 2023/07/18
 * 이름 : 강나은
 * 내용 : Ch04 확인문제 4번
 * 
 */
public class Test04 {
	public static void main(String[] args) {
		
		while(true)
		{
			int num1 = (int) Math.ceil(Math.random() * 6);
			int num2 = (int) Math.ceil(Math.random() * 6);
			
			System.out.printf("(%d, %d)", num1, num2);
			
			if (num1 + num2 == 5)
			{
				System.out.printf("\n(%d, %d)", num1, num2);
				System.out.println(" -> 두 눈의 합이 5이므로 실행을 멈춥니다.");
				break;
			}
		}
	}
}
