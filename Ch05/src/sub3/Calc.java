package sub3;

public class Calc {

	// 싱글톤 객체
	// 메모리에 오직 하나의 인스턴스로 생성되는 객체
	private static Calc instance = new Calc();
	// getter를 통해 인스턴스를 제공함
	// 클래스메서드니까 클래스 이름으로 참조
	// 그래서 main에서 사용할 땐 Calc c1 = Calc.getInstance();
	public static Calc getInstance() {
		return instance;
	}
	// new를 생성하지 못하도록
	private Calc() {}
	
	public int plus(int x, int y) {
		return x + y;
	}
	
	public int minus(int x, int y) {
		return x - y;
	}
	
	public int multi(int x, int y) {
		return x * y;
	}
	
	public int div(int x, int y) {
		return x / y;
	}
}
