package sub2;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 날짜 : 2023/06/28
 * 이름 : 강나은
 * 내용 : Java 자료구조 스택 실습
 * 
 * 큐(Queue)
 *  - 데이터가 차례대로 쌓이는 자료구조(FIFO)
 *  - 이벤트, 애니메이션 실행에 사용
 *  
 */
public class QueueTest {
	public static void main(String[] args) {
		
		Queue<Integer> queue = new LinkedList<>();
		
		queue.offer(1);
		queue.offer(2);
		queue.offer(3);
		queue.offer(4);
		queue.offer(5);
		
		while(!queue.isEmpty())
			System.out.println(queue.poll());
	}
}
