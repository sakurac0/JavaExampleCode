package example;

class _4_5constuctorinitialization {
	// 객체를 정의 생성하는 툴인 _4_4constuctorinitialization라는 클래스를 만든다

	final String name;
	// 변경할수없는 문자열 값을 담는 name이라는 변수를 선언한다

	_4_5constuctorinitialization(String name) {
		// _4_4constuctorinitialization클래스의 객체필드를 파라미터 변수를 선언한다
		// 초기 설정하는 생성자를 만들고 문자열값을 담는 name

		this.name = name;
		// 이 클래스로 생성된 객체 안의 name 변수에 name 파라미터 변수를 저장한다
	}
}