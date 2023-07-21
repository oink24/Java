package ch08.confirm.test05;

/*
 * 날짜 : 2023/07/21
 * 이름 : 강나은
 * 내용 : Ch08 확인문제 5번
 * 
 */
public class TV implements Remocon {
	
	@Override
	public void powerOn() {
		System.out.println("TV를 켰습니다.");
	}
	
	public static void main(String[] args) {
		Remocon r = new TV();
		r.powerOn();
	}
}
