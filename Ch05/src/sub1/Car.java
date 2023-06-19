package sub1;

// Car 클래스 정의
// 이 클래스를 가지고 객체를 생성해야함 - new 연산자 사용
public class Car {
	
	// 필드(속성)
	// 변수 선언
	String name;
	String color;
	int speed;
	
	
	// 메서드(기능)
	public void speedUp(int speed) {
		this.speed += speed;
	}
	
	public void speedDown(int speed) {
		this.speed -= speed;
	}
	
	public void show() {
		System.out.println("차량명 : " + this.name);
		System.out.println("차량 색 : " + this.color);
		System.out.println("현재 속도 : " + this.speed);
	}
}
