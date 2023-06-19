package sub2;

public class Car {

	// 필드(속성)
	// 변수 선언
	private String name;
	private String color;
	private int speed;		
		
	// 생성자 : 캡슐화된 속성을 초기화하기 위한 메서드
	// = 클래스 이름과 동일한 메서드
	public Car(String name, String color, int speed) {
		this.name = name;
		this.color = color;
		this.speed = speed;
	}
	
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
	
	// Getter, setter 정의 - 필요에 따라서 정의함
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	
}
