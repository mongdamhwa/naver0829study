package bit701.day0830;

public class ExamEx8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//money 변수에 arg[0]값을 대입후 (급여:백만단위:5674321)
		/*
		 * 출력
		 * money:5674321원
		 * 만원짜리 567장
		 * 천원짜리 4장
		 * 백원짜리 3개
		 * 십원짜리 2개
		 * 일원짜리 1개
		 * 
		 * 산술연산자 사용해서 출력해보세요
		 */
		
		String money=args[0];
		int su1=Integer.parseInt(money);
		System.out.println("money:"+money+"원");
		System.out.println("만원짜리"+(su1/10000)+"장");
		System.out.println("천원짜리"+((su1-((su1/10000)*10000))/1000)+"장");
		System.out.println("백원짜리"+(su1-5674000)/100+"개");
		System.out.println("십원짜리"+(su1-5674300)/10+"개");
		System.out.println("일원짜리"+(su1-5674320)/1+"개");
		
		System.out.println("만원짜리"+su1/10000+"장");
		System.out.println("천원짜리"+(su1%10000)/1000+"장");
		System.out.println("만원짜리"+((su1%10000)%1000)/100+"장");
		System.out.println("만원짜리"+(((su1%10000)%1000)%100)/10+"장");
		System.out.println("만원짜리"+((((su1%10000)%1000)%100)%10)/1+"장");
		
	}

}
