package sub1;

/*
 * 날짜 : 2023/06/14
 * 이름 : 강나은
 * 내용 : Java 배열 실습
 * 
 */
public class ArrayTest {
	public static void main(String[] args) {
		
		// ----- 배열
		int[] arr1 = {1, 2, 3, 4, 5};
		char[] arr2 = {'A', 'B', 'C'};
		String[] arr3 = {"서울", "대전", "대구", "부산"};
		
		
		// ------- 원소 출력
		// 값을 참조해서 출력함
		System.out.println("arr1[0] : " + arr1[0]); // 첫 번째 원소
		System.out.println("arr1[2] : " + arr1[2]); // 세 번째 원소
		System.out.println("arr1[3] : " + arr1[3]); // 네 번째 원소
		
		System.out.println("arr2[2] : " + arr2[2]); // 세 번째 원소
		
		
		// ------- 배열 길이
		// 즉, 원소의 개수 구하기
		System.out.println("arr1 길이 : " + arr1.length);
		// 참조연산자 ' . ' : 기능을 참조할 때 사용하는 연산자
		System.out.println("arr2 길이 : " + arr2.length);
		System.out.println("arr3 길이 : " + arr3.length);
		
		
		
		// ------- 배열 반복문
		// 데이터를 연속적으로 처리하기 위해 사용하기때문에 for문과 궁합이 잘 맞음
		for (int i=0 ; i<arr1.length ; i++) {
			// 배열의 원소 갯수만큼 반복 처리
			System.out.print(arr1[i] + " ");
		}
		System.out.println(); // 개행
		
		for (char c : arr2) {
			// 자바에서 배열의 반복문
			System.out.print(c + " ");
		}
		System.out.println(); // 개행
		
		for (String s : arr3) {
			System.out.print(s + " ");
		}
		
		
		// ------- 1차원 배열
		// 선형. 쭉 나열된 것.
		// 배열 이름 형태 : 복수형으로 적어줄 것
		int[] scores = {80, 60, 78, 62, 92};
		int total = 0;
		
		for (int i=0 ; i<scores.length ; i++) {
			total += scores[i];
		}
		System.out.println("점수 합 : " + total);
		
		for (int score : scores) {
			total += score;
		}
		System.out.println("점수 합 : " + total);
		
		
		
		// ---------------------------- 2차원 배열
		// x축, y축 해서 평면
		int[][] arr2d = {{1,2,3,4}, 
						 {5,6,7,8}, 
						 {9,10,11,12}};
		// {} 선형의 배열 안에 {{}, {}, {}} 이렇게 또 들어가는거임
		// 행 번호 세로로 0,1,2 열 번호도 가로로 0,1,2,3
		// 행 번호와 열 번호로 참조 [행, 열]
		// 숫자 1의 인덱스 번호는 [0, 0]
		// 숫자 3은 [0, 2]
		// 숫자 6은 [1, 1]
		// 숫자 8은 [1, 3]
		
		for (int a=0 ; a<3 ; a++) {
			// 행
			for (int b=0; b<4 ; b++) {
				// 열
				System.out.println("arr2d[" + a + "][" + b + "] : " + arr2d[a][b]);
			}
		}
		
		
		
		
		// ---------------------------- 3차원 배열
		// z축 까지 나와서 공간.
		int [][][] arr3d = {{{1,  2,  3}, 
							 {4,  5,  6}, 
							 {7,  8,  9}}, 
							{{10, 11, 12}, 
							 {13, 14, 15}, 
							 {16, 17, 18}}, 
						    {{19, 20, 21}, 
						   	 {22, 23, 24}, 
							 {25, 26, 27}}};
		// 구조 이해하기. {{}, {}, {}} 여기까지가 2차원
		// 그림첨부
		// 숫자 1 : [0, 0, 0]
		// 숫자 25 : [2, 2, 0]
		
		for (int i=0 ; i<3 ; i++) {
			// 면?
			for (int j=0 ; j<3 ; j++) {
				// 행
				for (int k=0 ; k<3 ; k++) {
					// 열
					System.out.printf("arr3d[%d][%d][%d] : %d\n", i, j, k, arr3d[i][j][k]);
				}
			}
		}
		
	}
}
