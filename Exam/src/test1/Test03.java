package test1;

/*
 * 날짜 : 2023/06/13
 * 이름 : 강나은
 * 내용 : Java 연산자 연습문제
 * 
 */
public class Test03 {
	public static void main(String[] args) {
		
		int result = 0, num = 1;
		
		result = num++;
		System.out.println("result : " + result);
		
		result = ++num;
		System.out.println("result : " + result);
		
		result = num--;
		System.out.println("result : " + result);
		
		result = --num;
		System.out.println("result : " + result);
	}
}
