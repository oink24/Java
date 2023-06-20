package sub3;

public class Car {
	
	// 필드(속성)
	// 변수 선언
	// Heap에 저장됨
	private String name;
	private String color;
	private int speed;
	
	// 클래스변수 (정적변수)
	// Data영역(Method Area)에 저장됨
	public static int count;
	
	// 생성자 : 캡슐화된 속성을 초기화하기 위한 메서드
	// = 클래스 이름과 동일한 메서드
	public Car(String name, String color, int speed) {
		this.name = name;
		this.color = color;
		this.speed = speed;
		count++; // 객체를 생성할 때마다 카운트
	}
	
	// 클래스 메서드(정적메서드)
	// 클래스 변수를 취급하고 있는 메소드니 클래스 메서드로 맞춰주기
	public static int getCount() {
		return count;
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
}
