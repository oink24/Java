package sub4;

import java.util.Arrays;
import java.util.List;

/**
 * 날짜 : 2023/07/04
 * 이름 : 강나은
 * 내용 : Java 필터 스트림 실습
 * 
 * 필터 스트림
 *  - 요소를 걸러내는 중간 처리 기능
 *  - distinct() : 요소의 중복을 제거
 *  - filter() : 매개값으로 주어진 Predicate가 true를 리턴하는 요소만 필터링
 *  
 */
public class FilterStreamTest {
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,1,2,3);
		System.out.println(numbers);
		
		// 중복제거
		numbers.stream().distinct().forEach(num -> System.out.print(num + ", "));
		System.out.println(); // 개행
		
		// 5 이상 데이터 필터링
		numbers.stream().filter(num -> num >= 5).forEach(num -> System.out.print(num + ", "));
		System.out.println(); // 개행
		
		// 중복제거, 짝수 데이터 출력
		numbers.stream().distinct().filter(num -> num % 2 == 0).forEach(num -> System.out.print(num + ", "));
	}
}
