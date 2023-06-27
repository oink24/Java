package sub5;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*
 * 날짜 : 2023/06/27
 * 이름 : 강나은
 * 내용 : Java Date 클래스 실습
 * 
 */
public class DateTest {
	public static void main(String[] args) {
		
		// Date 클래스
		Date date = new Date();
		System.out.println("date : " + date);
		
		// 날짜시간 형식 만들어주기
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String result = sdf.format(date);
		
		System.out.println("result : " + result);
		
		
		// Calender 클래스
		// 싱글톤은 클래스 내부에서 getter로 가져와야함
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1; // 0부터 시작하기때문에 +1해주기
		int d = cal.get(Calendar.DATE);
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int min = cal.get(Calendar.MINUTE);
		int sec = cal.get(Calendar.SECOND);
		
		System.out.printf("%d-%d-%d %d:%d:%d", year, month, d, hour, min, sec);
	}
}
