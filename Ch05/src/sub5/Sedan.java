package sub5;

public class Sedan extends Car {
	
	private int cc;
	
	public Sedan(String name, String color, int speed, int cc) {
		super(name, color, speed);
		this.cc = cc; //여기것도 초기화해주기.. 부모것만 해줬으니까
	}
	
	public void speedTurbo() {
		this.speed += 20; // 부모클래스에서 private로 선언되어있기때문에.
						  // 온전히 상속 안됨
						  // 해결법 : 부모클래스에서 protected로 접근제한자 수정해주기
	}
	
	public void show() {
		super.show(); // super : 부모클래스를 지칭하는 키워드
		System.out.println("배기량 : " + cc);
	}

}
