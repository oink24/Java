package ch03.confirm;

/*
 * 날짜 : 2023/07/18
 * 이름 : 강나은
 * 내용 : Ch03 확인문제 7번
 * 
 */
public class Test07 {
	public static void main(String[] args) {
		
		double x = 5.0;
		double y = 0.0;
		double z = 5 % y;
		
		if (Double.isNaN(z))
			System.out.println("0.0으로 나눌 수 없습니다.");
		else
		{
			double result = z + 10;
			System.out.println("결과 : " + result);
		}
	}
}
