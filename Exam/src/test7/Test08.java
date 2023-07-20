package test7;

/*
 * 날짜 : 2023/07/18
 * 이름 : 강나은
 * 내용 : Java 총정리 연습문제3
 * 
 */
interface IRunnable {
	public void run();

	public void fly();
}

interface IFlyable {
	public void fly();
}

class FlyingCar implements IRunnable, IFlyable {
	@Override
	public void fly() {
		System.out.println("Car fly!");
	}
	
	@Override
	public void run() {
		System.out.println("Car run!");
	}
}

public class Test08 {
	public static void main(String[] args) {
		IRunnable car = new FlyingCar();
		car.run();
		car.fly();
	}
}
