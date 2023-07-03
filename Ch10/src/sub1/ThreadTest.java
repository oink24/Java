package sub1;

/**
 * 날짜 : 2023/07/03
 * 이름 : 강나은
 * 내용 : Java Thread 실습
 *
 * 스레드(Thread)
 *  - 하나의 프로세스 안에서 실행되는 프로그램 실행흐름
 *  - 스레드는 동시에 실행되는 병행실행
 *  - Thread 클래스를 상속받아 start 실행
 *  
 */
public class ThreadTest {
	public static void main(String[] args) {
		
		// 스레드 객체 생성
		SubThread st1 = new SubThread("Sub1");
		SubThread st2 = new SubThread("Sub2");
		
		// 자식스레드 실행
		st1.start();
		st2.start();
		
		for(int i=0 ; i<10 ; i++) 
		{
			try {
				Thread.sleep(1000); // 1초 대기
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
			System.out.println("Main Thread 실행...");
		}
		
		System.out.println("Main Thread 종료...");
	}
}
