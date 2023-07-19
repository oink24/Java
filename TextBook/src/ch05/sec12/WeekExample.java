package ch05.sec12;

import java.util.Calendar;

/*
 * 날짜 : 2023/07/19
 * 이름 : 강나은
 * 내용 : 교재 197p 예제 풀이
 * 
 */
public class WeekExample {
	public static void main(String[] args) {
		
		Week today = null; // Week 열거타입 변수 선언
		
		// 컴퓨터 날짜 및 시간 정보를 가진 Calendar 객체를 얻고 번지를 cal 변수에 대입
		// Calendar 얻기
		Calendar cal = Calendar.getInstance();
		
		// 일(1) ~ 토(7) 까지의 숫자를 얻고 week 변수에 대입
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		// 숫자를 열거 상수로 변환해서 변수에 대입
		switch(week)
		{
		case 1: today = Week.SUNDAY; break;
		case 2: today = Week.MONDAY; break;
		case 3: today = Week.TUESDAY; break;
		case 4: today = Week.WEDNESDAY; break;
		case 5: today = Week.THURSDAY; break;
		case 6: today = Week.FRIDAY; break;
		case 7: today = Week.SATURDAY; break;
		}
		
		// 열거타입 변수를 사용
		if (today == Week.WEDNESDAY)
			System.out.println("오늘은 수요일입니다.");
		else
			System.out.println("오늘은 수요일이 아닙니다.");
	}
}
