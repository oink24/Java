package sub9;

public interface Car {
	
	// 인터페이스니까 오직 추상메서드만.
	public abstract void speedUp(int speed);
	public abstract void speedDown(int speed);
	public void show(); // abstract 키워드 생략 가능
}
