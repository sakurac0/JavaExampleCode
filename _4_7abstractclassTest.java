package example;

class _4_7abstractclassTest {
	// 객체를 정의 생성하는 툴인 _4_7abstractclassTest이라는 클래스를 만든다

	public static void main(String[] args) {
// 모든 패키지와 클래스에서 접근 가능하고, 같은 클래스에서 생성된 객체값을 공유하며 리턴값이
// 없는 main이라는 함수를 선언하고, 문자열 값을 담는 args[]이라는 배열을 인자로 받는다 		
		_4_7abstractclassEctenedsDog dog = new _4_7abstractclassEctenedsDog();
// _4_7abstractclassEctenedsDog라는 클래스의 객체를 담는 dog라는 변수에
// _4_7abstractclassEctenedsDog라는 클래스의 객체를 새로 생성하여 저장한다		
		_4_7abstractclassEctenedsCat cat = new _4_7abstractclassEctenedsCat();
		// _4_7abstractclassEctenedsCat라는 클래스의 객체를 담는 cat라는 변수에
		// _4_7abstractclassEctenedsCat라는 클래스의 객체를 새로 생성하여 저장한다			
		dog.cry();
		// dog 변수안의 cry() 메서드를 호출한다
		cat.cry();
	    // cat 변수안의 cry() 메서드를 호출한다
	}
}
