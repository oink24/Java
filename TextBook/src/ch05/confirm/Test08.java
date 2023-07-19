package ch05.confirm;

/*
 * 날짜 : 2023/07/19
 * 이름 : 강나은
 * 내용 : Ch05 확인문제 8번
 *  - 중첩 for문을 이용하여 주어진 배열 항목의 전체 합과 평균 구하기
 *  
 */
public class Test08 {
	public static void main(String[] args) {
		
		int[][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		
		int sum = 0;
		int array_count = 0; // 평균을 구하기 위해 배열의 개수 변수
		
		for (int i=0 ; i<array.length ; i++)
		{
			for (int j=0 ; j<array[i].length ; j++)
			{
				sum += array[i][j];
				array_count++;
			}
		}
		
		System.out.println("총합 : " + sum);
		System.out.println("평균 : " + sum/array_count);
	}
}
