package ch07.confirm.test07;

/*
 * 날짜 : 2023/07/20
 * 이름 : 강나은
 * 내용 : Ch07 확인문제 7번
 * 
 */
public class Parent {
	public String nation;
    
    public Parent(){
    	this("대한민국");
        System.out.println("Parent() Call");
    }
    
    public Parent(String nation){
    	this.nation = nation;
        System.out.println("Parent(String nation) call");
    }
}
