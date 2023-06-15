package test2;

/*
 * 날짜 : 2023/06/15
 * 이름 : 강나은
 * 내용 : Java 배열 역순으로 정렬 연습문제
 * 
 */
public class Test03 {
	public static void main(String[] args) {
		
		int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		// 현재 배열 출력
		for (int i=0; i<10; i++) {
			System.out.print(arr[i] + ", ");
		}
		System.out.print("\n");
		
		// 배열의 원소를 역순으로 정렬
		for (int j=0 ; j<5 ; j++) {
			int temp = arr[j]; // 앞부분 원소를 temp에 저장
			arr[j] = arr[9-j]; // 뒷부분 원소를 앞부분에 넣어주고
			arr[9 - j] = temp; // temp에 있는 앞부분 원소를 뒷부분에 저장
		}
		
		// 역순으로 정렬된 배열 출력
		for (int i=0 ; i<10 ; i++) 
			System.out.print(arr[i] + ", ");
	}
}
