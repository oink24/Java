package sub5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 날짜 : 2023/07/04
 * 이름 : 강나은
 * 내용 : Java 맵 스트림 실습
 * 
 * 맵 스트림
 *  - 스트림 요소(컬렉션 원소)를 다른 요소로 변환시키는 스트림
 *  - map(), flatMap() 등
 *  
 */
public class MapStreamTest {
	public static void main(String[] args) {
		
		List<Person> people = new ArrayList<>();
		people.add(new Person("김유신", 23));
		people.add(new Person("김춘추", 21));
		people.add(new Person("장보고", 33));
		people.add(new Person("강감찬", 43));
		people.add(new Person("이순신", 53));
		
		// map
		people.stream().map(person -> person.getName()).forEach(name -> System.out.print(name + ", "));
		System.out.println(); // 개행
		
		
		List<String> list = Arrays.asList("1,2,3", "4,5,6", "7,8,9");
		System.out.println(list);
		
		// flatMap
		list.stream().flatMap(str -> Arrays.stream(str.split(","))).forEach(num -> System.out.print(num + ", "));
		System.out.println(); // 개행
		
		
		// faltMapToInt
		int result = list.stream().flatMapToInt(str -> {
						
						String[] strArr = str.split(","); // ,를 기준으로 분리해서 문자열 배열에 넣기
			
						int[] nums = new int[strArr.length]; // 문자열 배열 크기만큼 정수 배열 생성
						
						for (int i=0 ; i<strArr.length ; i++)
							nums[i] = Integer.parseInt(strArr[i]); // 정수 배열에 형변환하여 넣기
						
						return Arrays.stream(nums);
					}).sum();
		System.out.println("result : " + result);
	}
}
