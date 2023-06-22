package sub8;

// 최소 하나 이상의 추상메서드를 갖는 클래스.
// 추상클래스
public abstract class Car {

	protected String name;
	protected String color;
	protected int speed;
	
	public Car(String name, String color, int speed) {
		this.name = name;
		this.color = color;
		this.speed = speed;
	}
	
	// 미완성메서드. 추상메서드.
	// 내용 없이 메서드 선언부만 있음.
	// 상속받는 자식클래스에서 완성시켜줘야함.
	public abstract void speedUp(int speed);;
	public abstract void speedDown(int speed);
	
	public void show() {
		System.out.println("차량명 : " + this.name);
		System.out.println("차량 색 : " + this.color);
		System.out.println("현재 속도 : " + this.speed);
	}
}
