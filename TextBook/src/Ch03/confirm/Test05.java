package ch03.confirm;

/*
 * 날짜 : 2023/07/18
 * 이름 : 강나은
 * 내용 : Ch03 확인문제 5번
 * 
 */
public class Test05 {
	public static void main(String[] args) {
		
		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
		
		double area1 = (double) (lengthTop + lengthBottom) * height / 2;
		double area2 = (double) ((lengthTop + lengthBottom) * height / 2);
		
		System.out.println(area1);
		System.out.println(area2);
	}
}
