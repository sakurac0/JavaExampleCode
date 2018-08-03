package example;

class _4_2OverrideSubject {
	// 객체를 정의/생성하는 툴인 _4_2OverrideSubject라는 클래스를 만든다

	String name;

	// 문자열 값을 담는 name이라는 변수를 선언한다
	void printInfo() {
		// 리턴값이 없는 printInfo라는 메서드를 선언한다
		System.out.println("과목명:" + name);
		// "과목명 다음에 name 변수의 값을 시스템 콘솔에 출력하고 한줄 띄운다
	}
}

class MajorSubject extends _4_2OverrideSubject {
	// _4_2OverrideSubject라는 클래스를 확장(상속)하여 객체를
	// 정의/생성하는 툴인 MajorSubject라는 클래스를 만든다

	String targetGrader;

	// 문자열 값을 담는 targetGrader라는 변수를 선언한다
	void printInfo() {
		// 리턴값이 없는 printInfo라는 메서드를 선언한다
		super.printInfo();
		// 슈퍼클래스 안의 printInfo 메서드를 호출한다
		System.out.println("대상학년:" + targetGrader);
		// "대상학년" 다음에 targetGrader 변수의 값을 시스템 콘솔에 출력하고 한줄 띄운다
	}

}