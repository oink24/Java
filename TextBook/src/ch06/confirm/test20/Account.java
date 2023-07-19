package ch06.confirm.test20;

/*
 * 날짜 : 2023/07/19
 * 이름 : 강나은
 * 내용 : Ch06 확인문제 20번
 * 
 */
public class Account {
	
	private String ano;
	private String owner;
	private int balance;
	
	public Account(String ano, String owner, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
	
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
}
