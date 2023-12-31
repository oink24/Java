package test2;

/*
 * 날짜 : 2023/06/15
 * 이름 : 강나은
 * 내용 : Java 최대공약수 메서드 연습문제
 * 
 */
public class Test07 {
	public static void main(String[] args) {
		
		System.out.println("   1과   5의 최대공약수 : " + gcd(1, 5));
		System.out.println("   3과   6의 최대공약수 : " + gcd(3, 6));
		System.out.println("  12과  18의 최대공약수 : " + gcd(12, 18));
		System.out.println("  60과  24의 최대공약수 : " + gcd(60, 24));
		System.out.println(" 192과 162의 최대공약수 : " + gcd(192, 162));
	}
	
	// 최대공약수 메서드 정의
	public static int gcd(int a, int b) {
		
		int temp = 0;
		
		if (a < b) { // 작은 수를 temp에 넣기
			temp = a; 
		} else {
			temp = b;
		}
		
		while (true) {
			if (a % temp == 0 && b % temp == 0)
				break;
			temp--;
		}
		return temp;
	}
}
