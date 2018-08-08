package example;

class _4_6staticProgramTest {
	// 객체를 정의 생성하는 툴인 _4_6staticProgramTest라는 클래스를 만든다
	public static void main(String[] args) {

		_4_6staticProgram h1 = new _4_6staticProgram();
		// _4_6staticProgram 클래스의 객체를 담는 h1 변수에 _4_6staticProgram 클래스의 객체를 새로 생성하여 저장한다
		_4_6staticProgram h2 = new _4_6staticProgram();
        // _4_6staticProgram 클래스의 객체를 담는 h2 변수에 _4_6staticProgram 클래스의 객체를 새로 생성하여 저장한다
		h1.greeting();
		// h1 변수안의 greeting() 메서드를 호출한다
		h2.greeting();
		// h2 변수안의 greeting() 메서드를 호출한다
		_4_6staticProgram.greeting();
	    // _4_6staticProgram 클래스 안의 greeting() 메서드를 호출한다
	}
}