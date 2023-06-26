package sub1;

public class Tiger extends Animal {

	// Animal의 속성이 따로 없기 때문에 생성자 생성 X
	
	@Override
	public void move() {
		System.out.println("Tiger run...");
	}
	
	@Override
	public void hunt () {
		System.out.println("Tiger hunt...");
	}
}
