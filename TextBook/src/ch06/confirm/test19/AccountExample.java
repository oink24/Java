package ch06.confirm.test19;

/*
 * 날짜 : 2023/07/19
 * 이름 : 강나은
 * 내용 : Ch06 확인문제 19번
 *    
 */
public class AccountExample {
	public static void main(String[] args) {
		
		Account account = new Account();
		
		account.setBalance(10000);
		System.out.println("현재잔고 : " + account.getBalance()); // 10000
		
		account.setBalance(-100);
		System.out.println("현재잔고 : " + account.getBalance()); // 10000
		
		account.setBalance(2000000);
		System.out.println("현재잔고 : " + account.getBalance()); // 10000
		
		account.setBalance(30000);
		System.out.println("현재잔고 : " + account.getBalance()); // 30000
	}
}
