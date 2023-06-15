package sub3;

/*
 * 날짜 : 2023/06/15
 * 이름 : 강나은
 * 내용 : Java Method 형태 실습
 * 
 */
public class MethodTypeTest {
	public static void main(String[] args) {
		
		double r1 = type1(1.1); // 매개변수, 리턴값 다 존재
		double r2 = type1(2.1);
		
		System.out.println("r1 : " + r1);
		System.out.println("r2 : " + r2);
		
		type2(true); // 리턴값이 없으니 대입연산자 필요없음
		type2(false);
		
		boolean r3 = type3(); // 리턴값 있음
		
		type4(); // 매개 변수와 리턴값 존재 X
		
	}
	
	// Method 형태 1 : 매개변수 O, 리턴값 O
	public static double type1(double x)	{
		
		double y = x + 3.14;
		return y;
	}
	
	
	// Method 형태 2 : 매개변수 O, 리턴값 X
	public static void type2(boolean status) {
		
		if (status) {
			System.out.println("참 입니다.");
		}else {
			System.out.println("거짓 입니다.");
		}
	}
	
	
	// Method 형태 3 : 매개변수 X, 리턴값 O
	public static boolean type3() {
		
		int num1 = 1;
		int num2 = 2;
		
		if (num1 > num2) {
			return true;
		}else {
			return false;
		}
	}
	
	
	// Method 형태 4 : 매개변수 X, 리턴값 X
	public static void type4() {
		
		double y = type1(0.3);
		System.out.println("type4 실행 결과 : " + y);
	}
	
}
