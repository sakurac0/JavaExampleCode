package example;

class _4_7staticTest {
	// 객체를 정의 생성하는 툴인 _4_7staticTest라는 클래스를 만든다

	public static void main(String[] args) {

		_4_7static b1 = new _4_7static();
		// _4_7staticTest클래스의 객체를 담는 b1변수에 _4_7staticTest 클래스의 객체를 새로 생성하여 저장한다
		_4_7static b2 = new _4_7static();
		// _4_7staticTest클래스의 객체를 담는 b2변수에 _4_7staticTest 클래스의 객체를 새로 생성하여 저장한다
		b1.name = "Java";
		// b1 변수 안의 name 변수에 "Java"를 저장한다
		b2.name = "C";
		// b2 변수 안의 name 변수에 "C"를 저장한다
		b1.price = 10000;
		// b1 변수안의 price 변수에 10000을 저장한다
		b2.price = 15000;
		// b2 변수안의 price 변수에 15000을 저장한다
		b1.printInfo();
		// b1 변수안의 printInfo() 메서드를 호출한다
		b2.printInfo();
		// b2 변수안의 printInfo() 메서드를 호출한다
	}
}

// static이 붙은 메서드는 클래스메서드라고 불리며 한 메모리 주소에 메서드 코드가 저장
// 클래스와 그 클래스로 생성한 객체 모두가 메서드를 공유하고 객체를 생성하지 않아도 클래스의 이름으로 바로 참조할수 있음
// static 메서드는 오버라이딩이 불가능