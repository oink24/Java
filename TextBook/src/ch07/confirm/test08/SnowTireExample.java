package ch07.confirm.test08;

/*
 * 날짜 : 2023/07/20
 * 이름 : 강나은
 * 내용 : Ch07 확인문제 8번
 * 
 */
public class SnowTireExample {
	public static void main(String[] args){
    	SnowTire snowTire = new SnowTire();
        Tire tire = snowTire;
        
        snowTire.run();
        tire.run();
    }
}
