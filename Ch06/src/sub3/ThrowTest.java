package sub3;

import java.util.Scanner;

/*
 * 날짜 : 2023/06/26
 * 이름 : 강나은
 * 내용 : Java 예외 발생시키기 실습
 * 
 */

// 사용자 정의 예외클래스
class MinusException extends Exception {
	// 자바의 예외처리 클래스 상속받기
	public MinusException(String msg) {
		super(msg);
	}
}

class OverException extends Exception {
	public OverException(String msg) {
		super(msg);
	}
}

class Score {
	
	// 점수 체크 메서드
	public void check(int score) throws MinusException, OverException {
		// throws MinusException, OverException 을 throws Exception으로 해도 됨.
		
		if (score < 0) {
			// MinusException 예외 발생시키기
			throw new MinusException("점수는 음수가 될 수 없습니다.");
		} else if (score > 100) {
			throw new OverException("점수는 100점을 초과할 수 없습니다.");
		} else {
			System.out.println("점수가 정상입니다.");
		}
	}
}

public class ThrowTest {
	public static void main(String[] args) {
		
		Score score = new Score();
		
		try {
			score.check(-3);
			score.check(102);
			score.check(96);
		} catch(MinusException e) {
			e.printStackTrace();
		} catch(OverException e) {
			e.printStackTrace();
		}
		
		System.out.println("프로그램 정상 종료...");
	}
}
