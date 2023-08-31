package bit701.day0831;

import java.util.Scanner;

public class Ex4_Oper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		점수를 입력받아 90이상 :"A", 80이상:"B", 70이상:"c"
		60이상:"D", 나머지는"F"
		99 입력시 99점은 A학점입니다
		
		if문과 조건연산자 두가지 방법으로 학점을 구해서 출력해보라
		*/
		
		Scanner sc=new Scanner(System.in);
		System.out.println("점수를 입력하세요");
		int score=sc.nextInt();
		if(score<1 || score>100) 
		{
			System.out.println("잘못된 값 입력으로 종료합니다");
			return;
		}
		System.out.println("입력된 점수:"+score+"점");
		
		//if문
		String grade="";
		if(score>=90) 
			grade="A";
		else if(score>=80)
			grade="B";
		else if(score>=70)
			grade="C";
		else if(score>=60)
			grade="D";
		else
			grade="F";
		
		System.out.println(+score+"점은 "+grade+"학점입니다");
		
		//조건연산자
		grade=score>=90?"A":score>=80?"B":score>=70?"C":score>=60?"D":"F";
		System.out.println(+score+"점은 "+grade+"학점입니다");
		System.out.printf("%d점은 %s학점입니다",score,grade);
			
		
	}

}
