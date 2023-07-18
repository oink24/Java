package test6;

/*
 * 날짜 : 2023/07/18
 * 이름 : 강나은
 * 내용 : Java 총정리 연습문제2
 * 
 * 원주율 공식
 *  - ∏ = 4 X (1/1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + ...)
 *  - 함수가 늘어날수록 정확도가 높아진다.
 *  
 */
public class Test02 {
	public static void main(String[] args) {
		
		boolean sign = false;
		double pi = 0;
		
		for (int i=1 ; i<=10000 ; i+=2)
		{
			if (sign == false)
			{
				pi += 1.0 / i;
				sign = true;
			}
			else
			{
				pi -= 1.0 / i;
				sign = false;
			}
			
			System.out.printf("i = %d, PI = %f\n", i, 4 * pi);
		}
	}
}
