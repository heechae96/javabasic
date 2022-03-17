package ch07;

public class Ch07_23 {

	public static void main(String[] args) {

		// 다형성
		// 여러가지 형태를 가질 수 있는 능력
		// 조상 타입 참조변수로 자손 타입 객체를 다루는 것
		
		// 이전						// 타입 일치
		// Tv t = new Tv();
		// SmartTv s = new SmartTv();
		
		// 이후						// 타입 불일치
		// 조상			자손
		// Tv t = new SmartTv();	// 허용
		// 자손			조상
		// SmartTv s = new Tv();	// 에러. 허용 안 됨
				
		// Q. 객체와 참조변수의 타입이 일치할 때와 일치하지 않을 때의 차이?
		// A. 스마트 티비를 스마트 티비 리모콘으로 쓰면 7개의 기능을 사용 할 수 있다
		//		스마트 티비를 티비 리모콘으로 쓰면 5개의 기능을 사용 할 수 있다
		// Q. 이게 무슨 장점이야?
		// A. 뒤에서 배움..
		
		
		// 자손 타입의 참조변수로 조상 타입의 객체를 가리킬 수 없다
		//	-> 없는 기능을 호출하는데 당연히 에러
		
		// 다형성까지 이해해야 뒤에 추상클래스, 인터페이스를 이해 할 수 있다!
		
		
		
		
	}

}