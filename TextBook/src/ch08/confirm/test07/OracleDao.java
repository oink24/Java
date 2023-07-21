package ch08.confirm.test07;

/*
 * 날짜 : 2023/07/21
 * 이름 : 강나은
 * 내용 : Ch08 확인문제 7번
 * 
 */
public class OracleDao implements DataAccessObject {
	@Override
	public void select() {
		System.out.println("Oracle DB에서 검색");
	}
	
	@Override
	public void insert() {
		System.out.println("Oracle DB에 삽입");
	}
	
	@Override
	public void update() {
		System.out.println("Oracle DB를 수정");
	}
	
	@Override
	public void delete() {
		System.out.println("Oracle DB에서 삭제");
	}
}
