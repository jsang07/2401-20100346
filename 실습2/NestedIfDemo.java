package chap002;

import java.util.Scanner;

public class NestedIfDemo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String grade;
		System.out.print("정수를 입력하세요 : ");
		int score = scanner.nextInt();
		
		if (score >= 90) 
			grade = "A";
		else {
			if(score >= 80)
				grade = "B";
			else {
				if(score >= 70)
				grade = "C";
					else {
						if(score >= 60)
							grade = "D";
							else 		
								grade = "F";
					}
				}
			}
		
		
		System.out.println("당신의 학점은 : " + grade);
		
		}
}
