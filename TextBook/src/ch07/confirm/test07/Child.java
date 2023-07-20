package ch07.confirm.test07;

/*
 * 날짜 : 2023/07/20
 * 이름 : 강나은
 * 내용 : Ch07 확인문제 7번
 * 
 */
public class Child extends Parent {
	private String name;
    
    public Child(){
    	this("홍길동");
        System.out.println("Child() call");
    }
    
    public Child(String name){
    	this.name = name;
        System.out.println("Child(String name) call");
    }
}
