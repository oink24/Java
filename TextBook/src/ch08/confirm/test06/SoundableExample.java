package ch08.confirm.test06;

/*
 * 날짜 : 2023/07/21
 * 이름 : 강나은
 * 내용 : Ch08 확인문제 6번
 * 
 */
public class SoundableExample {
	public static void printSound(Soundable soundable) {
		System.out.println(soundable.sound());
	}
	
	public static void main(String[] args) {
		printSound(new Cat());
		printSound(new Dog());
	}
}
