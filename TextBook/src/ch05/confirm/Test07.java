package ch05.confirm;

/*
 * 날짜 : 2023/07/19
 * 이름 : 강나은
 * 내용 : Ch05 확인문제 7번
 *  - for문을 이용하여 주어진 배열 항목에서 최대값 구하기
 *  
 */
public class Test07 {
	public static void main(String[] args) {
		
		int[] array = {1, 5, 3, 8, 2};
		
		int temp = 0;
		for (int i=0 ; i<array.length ; i++)
		{
			for (int j=i+1 ; j<array.length ; j++)
			{
				if(array[i] > array[j]) // 앞에 있는 원소가 더 크다면
				{
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		
		System.out.println(array[array.length-1]);
	}
}
