package sub3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class MyCalc {

	private JFrame frmMycalcV;
	private JTextField txtDisplay;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyCalc window = new MyCalc();
					window.frmMycalcV.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MyCalc() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	ArrayList<Double> numberList = new ArrayList<>(); // 숫자를 저장하는 리스트
	ArrayList<String> arithList = new ArrayList<>(); // 연산자를 저장하는 리스트
	static final Double ERROR_NUM = -99999.999; // 오류넘버;
	
	StringBuilder data = new StringBuilder(); // 입력되는 데이터(숫자, 연산자)를 저장하는 변수
	char[] arithmetic = { '+', 'X', '-', '/' };
	
	
	// -------------------------------------------------------------------------------
	// 입력된 데이터(숫자, 연산자)를 통해 결과 값을 반환하는 메서드
	public Double cal() {
		if (!distinct())
			return ERROR_NUM; // 계산하기 전에 현재까지 입력된 데이터를 숫자와 연산자를 나누는 메서드를 호출하여 분리
		double result = 0; // 결과 값
		
		// 우선순이 1번째인 'X', '/' 연산에 대한 계산 로직
		int size = arithList.size(); // 연산자 리스트의 크기
		for (int i=0 ; i<size ; i++)
		{
			String s = arithList.get(i);
			if (s.contains("X") || s.contains("/"))
			{
				if (s.equals("X"))
					result = numberList.get(i) * numberList.get(i + 1);
				else if (s.equals("/"))
					result = numberList.get(i) / numberList.get(i + 1);
				
				arithList.remove(i); // 연산에 사용된 연산자 제거
				numberList.set(i + 1, result); // 연산 결과값을 덮어씌워 저장
				numberList.remove(i); // 2개의 값은 계산 후 하나의 값이 되므로 덮어씌운 값을 제외한 나머지 값 제거
				i--;
				size--;
			}
		}
		
		// 우선순위 2번째인 '+', '-' 연산에 대한 계산 로직
		size = arithList.size();
		for (int i=0 ; i<size ; i++)
		{
			String s = arithList.get(i);
			
			if (s.equals("+"))
				result = numberList.get(i) + numberList.get(i + 1);
			else if (s.equals("-"))
				result = numberList.get(i) - numberList.get(i + 1);
			
			arithList.remove(i); // 연산에 사용된 연산자 제거
			numberList.set(i + 1, result); // 연산 결과값을 덮어씌워 저장
			numberList.remove(i); // 2개의 값은 계산 후 하나의 값이 되므로 덮어씌운 값을 제외한 나머지 값 제거
			i--;
			size--;
		}
		
		return numberList.get(0);
	}
	
	
	// -------------------------------------------------------------------------------
	// 숫자와 연산자를 나누어 저장하는 메서드
	public boolean distinct() {
		char[] cArr = data.toString().toCharArray();
		StringBuilder temp = new StringBuilder();
		
		for (int i=0 ; i<cArr.length ; i++)
		{
			
			// 해당 인덱스의 값이 연산자일 경우
			if (cArr[i] == '+' || cArr[i] == '-' || cArr[i] == '/' || cArr[i] == 'X')
			{
				if (i == 0) // 첫번째 값의 부호가 '+'나 '-'인 경우
				{
					if(cArr[i] == '-' || cArr[i] == '+')
					{
						temp.append(cArr[i]);
						continue;
					}
					else if (cArr[i] == 'X' || cArr[i] == '/')
					{
						// 첫번째 값의 부호가 'X'나 '/'인 경우는 잘못된 수식이므로 모든 데이터를 초기화
						JOptionPane.showMessageDialog(null, "잘못된 수식입니다.", "경고", JOptionPane.INFORMATION_MESSAGE);
						reset();
						return false;
					}
				}
				
				numberList.add(Double.parseDouble(temp.toString())); // 연산자가 나오기전까지 저장되었던 숫자 값을 저장
				arithList.add(String.valueOf(cArr[i])); // 연산자 저장
				temp.delete(0, temp.length()); // 값을 저장 후 다시 숫자를 넣어야하므로 초기화
			}
			else if (i == cArr.length - 1)
			{
				// 데이터에 저장된 마지막 인덱스일 경우,
				// 마지막 연산자 후에 숫자를 저장해온 temp변수에 마지막 인덱스 값을 넣고 numberList에 저장
				temp.append(cArr[i]);
				numberList.add(Double.valueOf(temp.toString()));
			}
			else
				temp.append(cArr[i]);
		}
		
		return true;
	}
	
	
	// -------------------------------------------------------------------------------
	// 모든 데이터를 초기화하는 메서드
	public void reset() {
		data.delete(0, data.length());
		numberList.clear();
		arithList.clear();
		txtDisplay.setText("0");
	}
	
	
	// -------------------------------------------------------------------------------
	// 버튼이 눌릴때마다 텍스트에 해당 버튼의 값을 추가해서 보이도록 하는 메서드
	public void dataAppend(String btnText) {
		data.append(btnText);
		txtDisplay.setText(data.toString());
	}
	
	
	// -------------------------------------------------------------------------------
	// data 변수가 비어있는지 확인하는 메서드
	public boolean isEmpty() {
		return data.length() == 0;
	}
	
	
	// data 변수 마지막 문자열 값이 연산자인지 확인하는 메서드
	public boolean check() {
		if (isEmpty())
			return true;
		
		// '='을 포함하고 있는 경우 초기화
		if (data.toString().contains("="))
		{
			reset();
			return false;
		}
		
		char[] cArr = data.toString().toCharArray();
		
		for (char ch : arithmetic)
		{
			if (cArr[cArr.length - 1] == ch)
			{
				changeArit();
				return true;
			}
		}
		
		return true;
	}
	
	
	// data 변수 마지막에 있는 문자열 삭제 메서드
	public void changeArit() {
		char[] cArr = data.toString().toCharArray();
		
		data.delete(data.length() - 1, data.length());
		System.out.println(data.toString());
	}
	
	
	// -------------------------------------------------------------------------------
	private void initialize() {
		frmMycalcV = new JFrame();
		frmMycalcV.setTitle("MyCalc v1.0");
		frmMycalcV.setBounds(100, 100, 266, 353);
		frmMycalcV.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMycalcV.getContentPane().setLayout(null);
		
		txtDisplay = new JTextField();
		txtDisplay.setBackground(new Color(255, 255, 255));
		txtDisplay.setEditable(false);
		txtDisplay.setFont(new Font("굴림", Font.PLAIN, 24));
		txtDisplay.setHorizontalAlignment(SwingConstants.RIGHT);
		txtDisplay.setText("0");
		txtDisplay.setBounds(12, 10, 224, 47);
		frmMycalcV.getContentPane().add(txtDisplay);
		txtDisplay.setColumns(10);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn0.setBounds(12, 255, 47, 47);
		frmMycalcV.getContentPane().add(btn0);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dataAppend(btn1.getText());
			}
		});
		btn1.setBounds(12, 194, 47, 47);
		frmMycalcV.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dataAppend(btn2.getText());
			}
		});
		btn2.setBounds(71, 194, 47, 47);
		frmMycalcV.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dataAppend(btn3.getText());
			}
		});
		btn3.setBounds(130, 194, 47, 47);
		frmMycalcV.getContentPane().add(btn3);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dataAppend(btn4.getText());
			}
		});
		btn4.setBounds(12, 137, 47, 47);
		frmMycalcV.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dataAppend(btn5.getText());
			}
		});
		btn5.setBounds(71, 137, 47, 47);
		frmMycalcV.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dataAppend(btn6.getText());
			}
		});
		btn6.setBounds(130, 137, 47, 47);
		frmMycalcV.getContentPane().add(btn6);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dataAppend(btn7.getText());
			}
		});
		btn7.setBounds(12, 78, 47, 47);
		frmMycalcV.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dataAppend(btn8.getText());
			}
		});
		btn8.setBounds(71, 78, 47, 47);
		frmMycalcV.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dataAppend(btn9.getText());
			}
		});
		btn9.setBounds(130, 78, 47, 47);
		frmMycalcV.getContentPane().add(btn9);
		
		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				check();
				dataAppend(btnDiv.getText());
			}
		});
		btnDiv.setBounds(189, 78, 47, 47);
		frmMycalcV.getContentPane().add(btnDiv);
		
		JButton btnMulti = new JButton("X");
		btnMulti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				check();
				dataAppend(btnMulti.getText());
			}
		});
		btnMulti.setBounds(189, 137, 47, 47);
		frmMycalcV.getContentPane().add(btnMulti);
		
		JButton btnMinus = new JButton("-");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				check();
				dataAppend(btnMinus.getText());
			}
		});
		btnMinus.setBounds(189, 194, 47, 47);
		frmMycalcV.getContentPane().add(btnMinus);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				check();
				dataAppend(btnPlus.getText());
			}
		});
		btnPlus.setBounds(189, 255, 47, 47);
		frmMycalcV.getContentPane().add(btnPlus);
		
		JButton btnCancel = new JButton("C");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				data.delete(0, data.length());
				txtDisplay.setText("0");
				numberList.clear();
				arithList.clear();
			}
		});
		btnCancel.setBounds(71, 255, 47, 47);
		frmMycalcV.getContentPane().add(btnCancel);
		
		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (check() == false) // '=' 값이 이미 입력되어 있을경우
					return;
				if (isEmpty()) // 데이터가 비어있을 경우
					return;
				
				Double result = cal();
				if (result == ERROR_NUM) // 결과값이 오류번호일 경우
					return;
				
				String formatResult = "";
				result = Double.parseDouble(String.format("%.1f", result)); // 소수 첫째자리까지만 표현
				
				if (String.valueOf(result).length() > 8)
				{
					// 결과값의 길이(소수점포함)가 8 이상일 경우 지수표현식 사용
					DecimalFormat df = new DecimalFormat("#.####E0");
					formatResult = df.format(result);
				}
				else
					formatResult = String.valueOf(result);
				
				dataAppend(btnEqual.getText());
				dataAppend(formatResult);
				numberList.clear();
				arithList.clear();
			}
		});
		btnEqual.setBounds(130, 255, 47, 47);
		frmMycalcV.getContentPane().add(btnEqual);
	}

}
