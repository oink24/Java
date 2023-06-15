package test2;

/*
 * 날짜 : 2023/06/15
 * 이름 : 강나은
 * 내용 : Java 배열 최대값 찾기 연습문제
 * 
 */
public class Test02 {
	public static void main(String[] args) {
		
		int arr[] = {17, 92, 18, 33, 58, 7, 26, 42};
		
		int maxNum = arr[0];
		
		for (int i=0 ; i<8 ; i++) { // 배열의 길이만큼 돌리려고
			
			if (maxNum < arr[i]) // 더 큰 수가 나타나면
				maxNum = arr[i];
		}
		System.out.println("배열 arr에서 가장 큰 수 : " + maxNum);
	}
}
