package example;

class _4_8interfaceExample extends _3_1Person implements Money, Work {
// _3_1Person이라는 클래스를 확장(상속)하여, 공동 기능을 추출한 Money와 Work라는
// 인터페이스를 담는 객체를 정의 생성하는 툴인 _4_8interfaceExample라는 클래스를 만든다	
	
	public void give(int money, String date) {
// 모든 패키지와 클래스에서 접근 가능하고, 리턴값이 없는 give라는 함수를 선언하고
// 정수값을 담는  money와 문자열값을 담는 date파라미터 함수를 인자로 받는다		
		System.out.println(date + "] -" + money);
// date 변수값 다음에 "]-" 다음에 money 변수값을 출력하고 한 줄 띄운다
	}

	public void receive(int money, String date) {
// 모든 패키지와 클래스에서 접근 가능하고, 리턴값이 없는 receive라는 함수를 선언하고
// 정수값을 담는  money와 문자열값을 담는 date파라미터 함수를 인자로 받는다		
		System.out.println(date + "]+" + money);
// date 변수값 다음에 "]-" 다음에 money 변수값을 출력하고 한 줄 띄운다
	}

	public void work(int salary, String date) {
		// 모든 패키지와 클래스에서 접근 가능하고, 리턴값이 없는 work라는 함수를 선언하고
		// 정수값을 담는  salary와 문자열값을 담는 date파라미터 함수를 인자로 받는다
		System.out.println(date + "]+" + salary);
		// date 변수값 다음에 "]-" 다음에 salary 변수값을 출력하고 한 줄 띄운다
	}
}