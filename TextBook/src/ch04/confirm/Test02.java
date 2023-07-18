package ch04.confirm;

/*
 * 날짜 : 2023/07/18
 * 이름 : 강나은
 * 내용 : Ch04 확인문제 2번
 * 
 */
public class Test02 {
	public static void main(String[] args) {
		
		String grade = "B";
		
		int score
		= switch (grade)
		{
		case "A" -> 100;
		case "B" -> {
			int result = 100 - 20;
			yield result;
			}
		default -> 60;
		};
		
		System.out.println(score);
	}
}
