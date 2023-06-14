package ch04.sec05;

import java.util.Scanner; // Scanner 를 사용하기 위해 필요

/*
 * 날짜 : 2023/06/14
 * 이름 : 강나은
 * 내용 : 교재 131p 예제 풀이
 * 
 */
public class KeyControlExample {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); // Scanner 생성
		boolean run = true; // while 문의 조건식을 위한 변수
		int speed = 0;
		
		while (run) {
			
			// 메뉴 생성
			System.out.println("--------------------");
			System.out.println("1. 증속 | 2. 감속 | 3. 중지");
			System.out.println("--------------------");
			System.out.print("선택 : ");
			
			// 키보드에서 입력한 내용 읽기
			String strNum = scanner.nextLine();
			
			if (strNum.equals("1")) {
				speed++;
				System.out.println("현재 속도 = " + speed);
			} else if (strNum.equals("2")) {
				speed--;
				System.out.println("현재 속도 = " + speed);
			} else if (strNum.equals("3")) {
				run = false; // while문 탈출
			}
		}
		System.out.println("프로그램 종료");
	}
}
