package ch08.confirm.test07;

/*
 * 날짜 : 2023/07/21
 * 이름 : 강나은
 * 내용 : Ch08 확인문제 7번
 * 
 */
public class DaoExample {
	public static void dbWork(DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}
	
	public static void main(String[] args) {
		dbWork(new OracleDao());
		dbWork(new MySqlDao());
	}
}
