package ch07.confirm.test12;

/*
 * 날짜 : 2023/07/20
 * 이름 : 강나은
 * 내용 : Ch07 확인문제 12번
 * 
 */
public class Example {
	public static void action(A a) {
		a.method1();
		if (a instanceof C c)
		{
			c.method2();
		}
	}
	
	public static void main(String[] args) {
		action(new A());
		action(new B());
		action(new C());
	}
}
