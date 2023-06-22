package sub9;

// 상속이 아니라 구현임. extends 키워드 말고 implements
public class Sedan implements Car {

	private String name;
	private String color;
	private int speed;
	
	public Sedan(String name, String color, int speed) {
		this.name = name;
		this.color = color;
		this.speed = speed;
	}

	@Override
	public void speedUp(int speed) {
		this.speed += speed;
	}

	@Override
	public void speedDown(int speed) {
		this.speed -= speed;
	}

	@Override
	public void show() {
		System.out.println("차량 명 : " + this.name);
		System.out.println("차량 색 : " + this.color);
		System.out.println("현재속도 : " + this.speed);
	}
}
