package sub5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UserDAO {
	
	// 싱글톤
	private static UserDAO instance = new UserDAO();
	public static UserDAO getInstance() {
		return instance;
	}
	private UserDAO() {}
	
	
	// DB 정보 상수로 선언
	private final String HOST = "jdbc:mysql://127.0.0.1:3306/userdb";
	private final String USER = "root";
	private final String PASS = "1234";
	
	// 반복되는 1,2단계 모듈화. 메서드로 정의.
	private Connection getConnection() throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		return DriverManager.getConnection(HOST, USER, PASS);
	}
	
	private Connection conn = null;
	private Statement stmt;
	private PreparedStatement psmt;
	private ResultSet rs;
	
	public void insertUser(UserVO vo) {
		try 
		{
			Connection conn = getConnection();
			PreparedStatement psmt = conn.prepareStatement(SQL.INSERT_USER);
			psmt.setString(1, vo.getUid());
			psmt.setString(2, vo.getName());
			psmt.setString(3, vo.getHp());
			psmt.setInt(4, vo.getAge());
			
			psmt.executeUpdate();

			close();
			
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	public UserVO selectUser(String uid) {
		
		UserVO vo = new UserVO();
		
		try 
		{
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.SELECT_USER);
			psmt.setString(1, uid);
			rs = psmt.executeQuery();
			
			// 결과값은 0 아니면 1이므로 (PK로 검색하니까)
			if(rs.next()) 
			{
				vo.setUid(rs.getString(1));
				vo.setName(rs.getString(2));
				vo.setHp(rs.getString(3));
				vo.setAge(rs.getInt(4));
			}
			// else구문은 없어도됨. 검색조건에 해당되는 데이터가 없다면 어차피 vo는 null값으로 리턴될테니
			
			close();
			
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		return vo;
	}
	
	public List<UserVO> selectUsers() {
		
		List<UserVO> users = new ArrayList<>();
		
		try 
		{
			Connection conn = getConnection();
			Statement stmt = conn.createStatement(); // 전체조회할거니 쿼리파라미터 필요 없으므로.
			ResultSet rs = stmt.executeQuery(SQL.SELECT_USERS);
			
			// 결과처리 (List로 만들기)
			while(rs.next()) 
			{
				UserVO vo = new UserVO();
				
				vo.setUid(rs.getString(1));
				vo.setName(rs.getString(2));
				vo.setHp(rs.getString(3));
				vo.setAge(rs.getInt(4));
				
				users.add(vo);
			}
			
			close();
			
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		return users;
	}
	
	public int updateUser(UserVO vo) {
		
		int result = 0;
		
		try 
		{
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.UPDATE_USER);
			psmt.setString(1, vo.getName());
			psmt.setString(2, vo.getHp());
			psmt.setInt(3, vo.getAge());
			psmt.setString(4, vo.getUid());
			
			result = psmt.executeUpdate();
			
			close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		return result; // 1:수정성공, 0:수정할 uid 존재X
	}
	
	public int deleteUser(String uid) {
		
		int result = 0;
		
		try
		{
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.DELETE_USER);
			psmt.setString(1, uid);
			
			result = psmt.executeUpdate();
			
			close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		return result; // 1:삭제성공, 0:수정할 uid 존재X
	}
	
	public void close() throws SQLException {
		if (rs != null)
			rs.close();
		
		if (stmt != null)
			stmt.close();
		
		if (psmt != null)
			psmt.close();
		
		if (conn != null)
			conn.close();
	}
}
