package ch06.confirm.test19;

/*
 * 날짜 : 2023/07/19
 * 이름 : 강나은
 * 내용 : Ch06 확인문제 19번
 *    
 */
public class Account {
	
	static final int MIN_BALANCE = 0;
	static final int MAX_BALANCE = 1000000;
	
	private int balance = 0;
	
	public void setBalance(int balance) {
		if (balance >= MIN_BALANCE && balance <= MAX_BALANCE)
			this.balance = balance;
	}
	public int getBalance() {
		return this.balance;
	}
}
