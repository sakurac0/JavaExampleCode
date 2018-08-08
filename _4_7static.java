package example;

class _4_7static {
	// 객체를 정의 생성하는 툴인 static이라는 클래스를 만든다
	String name;
	// 문자열 값을 담는 name변수를 선언한다
	static int price;

	// 같은 클래스에서 생성된 객체들과 값을 공유하고, 정수값을 담는 price라는 변수를 선언한다

	void printInfo() {
		// 리턴값이 없는 printinfo라는 메서드를 선언한다
		System.out.println(name + ":" + price);
		// name변수값 다음에 ":" 다음에 price값을 시스템 콘솔에 출력하고 한줄 띄운다
	}
}

// 자바에서 static'은 정지된 메모리', 즉 하나의 메모리 주소에 계속 저장한다는 의미로 사용
// 변수앞에 static이 붙으면 그 변수는 같은 메모리 주소에 값을 계속 저장