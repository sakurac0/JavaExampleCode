package example;

class _4_1Student extends _3_1Person {
	// _3_1Person이라는 클래스를 확장(상속)하여 객체를 정의/생성하는 툴인 _4_1Student라는 클래스를 만든다
	int stuNo; // 정수형을 담는 stuNo라는 변수를 선언한다

	String study() { // 문자열을 리턴값으로 받는 study라는 메서드를 생성한다
		return "study"; // 이 메서드를 호출한곳에 study를 리턴한다
	}

}

class _4_1Worker extends _3_1Person {
	// _3_1Person이라는 클래스를 확장 상속하여 객체를 정의/생성하는 툴인 _4_1Worker라는 클래스를 만든다
	String position; // 문자열을 담는 position이라는 변수를 선언한다

	String goToWorker() {
		return "go to worker"; // 이메서드를 호출한곳에 "go to worker를 리턴한다
	}

	String attendMeeting() {
		return "attend a meeting"; // 이메서드를 호출한곳에 "attend a meeting"을 리턴한다
	}

}
