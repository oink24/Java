package ch04.confirm;

import java.util.Scanner;

/*
 * 날짜 : 2023/07/18
 * 이름 : 강나은
 * 내용 : Ch04 확인문제 7번
 * 
 */
public class Test07 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int money = 0, balance = 0;
		
		while (true)
		{
			// 메뉴 출력
			System.out.println("-------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-------------------------------");
			
			System.out.print("선택> ");
			int choose = sc.nextInt();
			
			if (choose == 1)
			{
				System.out.print("예금액> ");
				money = sc.nextInt();
				balance += money;
			}
			else if (choose == 2)
			{
				System.out.print("출금액> ");
				money = sc.nextInt();
				balance -= money;
			}
			else if (choose == 3)
			{
				System.out.println("잔고> " + balance);
			}
			else if (choose == 4)
			{
				System.out.println("프로그램 종료");
				break;
			}
			else
			{
				System.out.println("존재하지 않는 메뉴번호입니다. 다시 입력하여주세요.");
			}
		}
	}
}
