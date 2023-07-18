package ch04.confirm;

/*
 * 날짜 : 2023/07/18
 * 이름 : 강나은
 * 내용 : Ch04 확인문제 3번
 * 
 */
public class Test03 {
	public static void main(String[] args) {
		
		int sum = 0;
		
		for (int i=1 ; i<=100 ; i++)
		{
			if (i % 3 == 0) // i가 3의 배수라면
				sum += i;
		}
		
		System.out.println(sum);
	}
}
