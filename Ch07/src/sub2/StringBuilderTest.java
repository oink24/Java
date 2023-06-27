package sub2;

/*
 * 날짜 : 2023/06/27
 * 이름 : 강나은
 * 내용 : Java StringBuilder 클래스 실습
 * 
 */
public class StringBuilderTest {
	public static void main(String[] args) {
		
		// String immutable 특성
		String str = "Java";
		System.out.println("str 객체주소 : " + System.identityHashCode(str));
		
		str += "Programming";
		System.out.println("str 객체주소 : " + System.identityHashCode(str));
		
		System.out.println("str : " + str);
		
		// String immutable 특성을 개선한 StringBuilder
		StringBuilder sb = new StringBuilder("Java");
		System.out.println("sb 객체주소 : " + System.identityHashCode(sb));
		
		sb.append("Programming");
		System.out.println("sb 객체주소 : " + System.identityHashCode(sb));
		
		System.out.println("sb : " + sb);
	}
}
