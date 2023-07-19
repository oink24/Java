package ch06.confirm.test20;

import java.util.Scanner;

/*
 * 날짜 : 2023/07/19
 * 이름 : 강나은
 * 내용 : Ch06 확인문제 20번
 * 
 */
public class BankApplication {
	
	private static Account[] accountArray = new Account[100];
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int choose = 0;
		boolean run = true;
		
		while(run)
		{
			// 메뉴판 출력
			System.out.println("------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("------------------------------------------");
			
			System.out.print("선택> ");
			choose = sc.nextInt();
			
			if (choose == 1)
				createAccount();
			else if (choose == 2)
				accountList();
			else if (choose == 3)
				deposit();
			else if (choose == 4)
				withdraw();
			else if (choose == 5)
				run = false;
		}
		System.out.println("프로그램 종료");
	}
	
	// 계좌 생성
	private static void createAccount() {
		
		System.out.println("-------");
		System.out.println("계좌 생성");
		System.out.println("-------");
		
		System.out.print("계좌번호 : ");
		String ano = sc.next();
		
		System.out.print("계좌주 : ");
		String owner = sc.next();
		
		System.out.print("초기입금액 : ");
		int balance = sc.nextInt();
		
		// 계좌생성
		Account account = new Account(ano, owner, balance);
		
		for(int i=0 ; i<accountArray.length ; i++)
		{
			if (accountArray[i] == null)
			{
				accountArray[i] = account;
				System.out.println("결과 : 계좌가 생성되었습니다.");
				break;
			}
		}
	}
	
	
	// 계좌 목록
	private static void accountList() {
		
		System.out.println("-------");
		System.out.println("계좌 목록");
		System.out.println("-------");
		
		for (int i=0 ; i<accountArray.length ; i++)
		{
			if (accountArray[i] == null)
				break;
			System.out.println(accountArray[i].getAno() + "\t"
								+ accountArray[i].getOwner() + "\t"
								+ accountArray[i].getBalance() + "\t");
		}
	}
	
	
	// 예금
	private static void deposit() {
		
		System.out.println("-------");
		System.out.println("  예금  ");
		System.out.println("-------");
		
		System.out.print("계좌번호 : ");
		String ano = sc.next();
		
		System.out.print("예금액 : ");
		int balance = sc.nextInt();
		
		Account account = findAccount(ano);
		if (account == null)
		{
			System.out.println("결과 : 계좌가 존재하지 않습니다.");
			return;
		}
		
		account.setBalance(account.getBalance() + balance);
		System.out.println("결과 : 예금이 성공하였습니다.");
	}
	
	
	// 출금
	private static void withdraw() {
		
		System.out.println("-------");
		System.out.println("  출금  ");
		System.out.println("-------");
		
		System.out.print("계좌번호 : ");
		String ano = sc.next();
		
		System.out.print("출금액 : ");
		int balance = sc.nextInt();
		
		Account account = findAccount(ano);
		if (account == null)
		{
			System.out.println("결과 : 계좌가 존재하지 않습니다.");
			return;
		}
		
		if (account.getBalance() < balance)
		{
			System.out.println("예금액보다 많은 금액을 출금할 수 없습니다.");
			return;
		}
		
		account.setBalance(account.getBalance() - balance);
		System.out.println("결과 : 출금이 성공하였습니다.");
	}
	
	
	// Account 배열에서 ano와 동일한 Account 객체 찾기
	private static Account findAccount(String ano) {
		Account account = null;
		
		for (int i=0 ; i<accountArray.length ; i++)
		{
			if (accountArray[i] != null)
			{
				if (accountArray[i].getAno().equals(ano))
				{
					account = accountArray[i];
					break;
				}
			}
		}
		
		return account;
	}
}
