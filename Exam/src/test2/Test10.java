package test2;

/*
 * 날짜 : 2023/06/15
 * 이름 : 강나은
 * 내용 : Java 피보나치 수열 재귀 매서드 연습문제
 * 
 *  - 피보나치 수는 첫째 및 둘째 항이 1이며 그 뒤의 모든 항은 바로 앞 두 항의 합인 수열.
 * 
 */
public class Test10 {
	public static void main(String[] args) {
		
		for(int i=0 ; i<10 ; i++)
			System.out.print(fibo(i) + " ");
	}
	
	public static int fibo(int n) {
		
		if(n <= 1) {
			return n;
		}
		
		return fibo(n-1) + fibo(n-2);
	}
}
