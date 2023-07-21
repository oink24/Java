package ch08.confirm.test08;

/*
 * 날짜 : 2023/07/21
 * 이름 : 강나은
 * 내용 : Ch08 확인문제 8번
 * 
 */
public class Example {
	public static void action(A a) {
		a.method1();
		if (a instanceof C c)
			c.method2();
	}
	
	public static void main(String[] args) {
		action(new B());
		action(new C());
	}
}
