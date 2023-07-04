package sub1;

/**
 * 날짜 : 2023/07/04
 * 이름 : 강나은
 * 내용 : 함수형 프로그래밍 실습
 *
 * 함수형 프로그래밍
 *  - 프로그래밍 단위를 함수 단위로 실행하는 프로그래밍 패러다임
 *  - 함수형 프로그래밍의 함수는 람다식으로 표현
 */
interface A {
	public void mothod(); // 추상메서드 선언
}

class B implements A {
	@Override
	public void mothod() {
		System.out.println("method 실행...");
	}
}

public class FunctionalTest {
	public static void main(String[] args) {
		
		// 객체지향 방식
		A a1 = new B();
		a1.mothod();
		
		
		// 익명클래스 (인터페이스를 바로 객체로 생성)
		A a2 = new A() {
			@Override
			public void mothod() {
				System.out.println("method 실행...");
			}
		};
		a2.mothod();
		
		
		// 함수형 프로그래밍 방식 (람다식)
		A a3 = () -> {System.out.println("method 실행...");};
		a3.mothod();
	}
}