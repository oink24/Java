package ch05.confirm;

import java.util.Scanner;

/*
 * 날짜 : 2023/07/19
 * 이름 : 강나은
 * 내용 : Ch05 확인문제 9번
 * 
 */
public class Test09 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int choose = 0; // 메뉴판 선택 변수
		int studentCount = 0; // 학생 수
		int[] scores = null; // 점수 배열
		
		while(true)
		{
			// 메뉴판 출력
			System.out.println("---------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("---------------------------------------------");
			
			System.out.print("선택> ");
			choose = sc.nextInt();
			
			if (choose == 1)
			{
				// 학생 수 입력
				System.out.print("학생수> ");
				studentCount = sc.nextInt();
				scores = new int[studentCount]; // 학생 수만큼 점수배열 생성
			}
			else if (choose == 2)
			{
				// 점수 입력
				for (int i=0 ; i<studentCount ; i++)
				{
					System.out.printf("scores[%d]> ", i);
					scores[i] = sc.nextInt();
				}
			}
			else if (choose == 3)
			{
				// 점수 리스트
				for (int i=0 ; i<studentCount ; i++)
				{
					System.out.printf("scores[%d]: %d\n", i, scores[i]);
				}
			}
			else if (choose == 4)
			{
				// 분석
				// 최댓값 구하기
				for (int i=0 ; i<scores.length ; i++)
				{
					for (int j=i ; j<scores.length ; j++)
					{
						if (scores[i] > scores[j])
						{
							int temp = scores[i];
							scores[i] = scores[j];
							scores[j] = temp;
						}
					}
				}
				System.out.println("최고 점수 : " + scores[scores.length-1]);
				
				// 평균값 구하기
				int sum = 0;
				for (int num : scores)
					sum += num;
				System.out.println("평균 점수 : " + (float)sum/scores.length);
			}
			else if (choose == 5)
			{
				// 종료
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			else
			{
				System.out.println("메뉴판에 없는 번호입니다. 다시 선택하세요.");
				continue;
			}
		}
		sc.close();
	}
}
