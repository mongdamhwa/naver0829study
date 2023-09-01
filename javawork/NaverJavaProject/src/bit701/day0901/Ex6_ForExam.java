package bit701.day0901;

import java.util.Scanner;

public class Ex6_ForExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); // 입력받아야하니까 이거 쓰나보구나
		// 숫자 n 입력받아야하니까?

		/*
		1.숫자 n을 입력받은 후 1부터 n까지의 총 합계를 출력하시오
		int n;
		int sum=0;
		System.out.println("합계를 구할 숫자 입력");
		n=sc.nextInt();
		
		//1부터 n까지의 총합
		for(int a=1;a<=a;a++)
			sum+=a;
		
		System.out.println("1부터"+n+"까지의 합은"+sum+"입니다");
		*/

		/*
		2.구구단 2~9 사이의 숫자를 입력받은 후 범위를 벗어날 경우
		"잘못 입력하여 종료합니다"라고 종료
		제대로 입력시 해당 구구단 출력
		
		**5단의 경우**
		5 X 1 = 5
		5 X 2 = 10
		.
		.
		5 X 9 = 45
		
		*/

		int dan;
		System.out.println("출력할 구구단은?");
		dan = sc.nextInt();
		if (dan < 2 || dan > 9) {
			System.out.println("잘못된 숫자입니다");
			return;
		}

		System.out.println("\t**" + dan + "단 **\n");

		for (int i = 1; i <= 9; i++) {
			System.out.printf("%6d X %d = %2d\n", dan, i, dan * i);
		}

	}

}
