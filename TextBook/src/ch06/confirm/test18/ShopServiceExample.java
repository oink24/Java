package ch06.confirm.test18;

/*
 * 날짜 : 2023/07/19
 * 이름 : 강나은
 * 내용 : Ch06 확인문제 18번
 *  - "같은 ShopService 객체입니다."라는 메시지가 출력되도록
 *    싱글톤 패턴을 사용해서 ShopService 클래스를 작성하시오.
 *    
 */
public class ShopServiceExample {
	public static void main(String[] args) {
		
		ShopService obj1 = ShopService.getInstance();
		ShopService obj2 = ShopService.getInstance();
		
		if (obj1 == obj2)
			System.out.println("같은 shopService 객체입니다.");
		else
			System.out.println("다른 shopService 객체입니다.");
	}
}
