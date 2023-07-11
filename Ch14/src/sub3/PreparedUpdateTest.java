package sub3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 * 날짜 : 2023/07/11
 * 이름 : 강나은
 * 내용 : PreparedStatement 실습
 *
 */
public class PreparedUpdateTest {
	public static void main(String[] args) {
		
		// DB 정보
		String host = "jdbc:mysql://127.0.0.1:3306/userdb";
		String user = "root";
		String pass = "1234";
		
		try {
			// 1단계 - JDBC 드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 2단계 - 데이터베이스 접속
			Connection conn = DriverManager.getConnection(host, user, pass);
			
			// 3단계 - SQL 실행객체 생성
			String sql = "UPDATE `user2` SET `hp`=?, `age`=? WHERE `uid`=?";
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, "010-1234-1111");
			psmt.setInt(2, 33);
			psmt.setString(3, "j101");
			
			// 4단계 - SQL 실행
			psmt.executeUpdate();
			
			// 5단계 - 결과처리(SELECT 경우)		
			// 6단계 - 연결해제
			psmt.close();
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Update 완료...");
	}
}
