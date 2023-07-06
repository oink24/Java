package for_loop;

import java.util.Scanner;

public class StarPatterns04_utilize {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int line = sc.nextInt(); // 출력할 줄 갯수
		
		for (int i=1 ; i<=line ; i++) // 줄 갯수
		{
			for (int j=line-1 ; j>=i ; j--)
			{
				System.out.print(" "); // 공백 출력
			}
			for (int j=1 ; j<=i ; j++)
			{
				System.out.print("*"); // 별 출력
			}
			System.out.println(); // 개행
		}
	}
}