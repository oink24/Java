package sub3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * 날짜 : 2023/06/29
 * 이름 : 강나은
 * 내용 : Java 역직렬화 실습
 * 
 */
public class DeserializeTest {
	public static void main(String[] args) {
		
		String path = "C:\\Users\\Java\\Desktop\\Apple.txt";
		
		try {
			// 스트림 생성
			FileInputStream fis = new FileInputStream(path);
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			// 역직렬화
			Apple apple = (Apple) ois.readObject(); // Object형이라 어떤 타입으로든 다운캐스팅 가능
			apple.show();
			
			// 스트림 해제
			ois.close();
			fis.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료");
	}
}
