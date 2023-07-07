package sub1;

import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * 날짜 : 2023/07/07
 * 이름 : 강나은
 * 내용 : Java Swing 실습
 *
 * GUI 프로그래밍
 *  - 사용자가 편리하게 프로그램을 사용할 수 있게 윈도우를 지원하는 프로그래밍
 *  - Java GUI 개발을 위해 Swing 라이브러리 지원
 *  - 편리한 GUI 개발을 위해 Windowbuilder 설치
 */
public class HelloSwingTest {
	public static void main(String[] args) {
		
		// 윈도우 생성 (기본 창 띄우기)
		JFrame frame = new JFrame("Hello Swing!");
		frame.setPreferredSize(new Dimension(300, 200));
		frame.pack();
		frame.setVisible(true);
		
		// 컨테이너 배치
		Container pane = frame.getContentPane();
		
		// 컴포넌트 배치
		JLabel label = new JLabel("Hello Swing!"); // 텍스트출력 컴포넌트
		pane.add(label);
		
		JButton button = new JButton("확인");
		pane.add(button);
	}
}
