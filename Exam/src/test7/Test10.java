package test7;

/*
 * 날짜 : 2023/07/18
 * 이름 : 강나은
 * 내용 : Java 총정리 연습문제3
 * 
 */
class Human {
	public void print() {
		System.out.println("사람 입니다.");
	}
}

class Man extends Human {
	@Override
	public void print() {
		System.out.println("남자 입니다.");
	}
}

class Woman extends Human {
	@Override
	public void print() {
		System.out.println("여자 입니다.");
	}
}

public class Test10 {
	public static void main(String[] args) {
		
		Human p1 = makeHuman(1);
		Human p2 = makeHuman(2);
		
		p1.print();
		p2.print();
	}
	
	public static Human makeHuman(int kind) {
		if (kind == 1)
			return new Man();
		else
			return new Woman();
	}
}
