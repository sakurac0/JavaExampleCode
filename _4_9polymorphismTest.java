package example;

public class _4_9polymorphismTest {
// 객체를 정의 생성하는 툴인 _4_9polymorphismTest라는 클래스를 만든다	
	public static void main(String[] args) {
// 모든 패키지와 클래스에서 접근가능하고, 클래스에서 생성된 객체들과 값을 공유하며,
// 리턴값이 없는 main이라는 함수를 선언하고, 문자열값을 담는 args[]라는 배열을 인자로 받는다
		_4_7abstractclass animals[] = { new _4_7abstractclassEctenedsDog(), new _4_7abstractclassEctenedsCat() };
// _4_7abstractclass라는 객체를 담는 animals라는 배열을 선언하고,
// _4_7abstractclassEctenedsDog라는 클래스의 객체를 새로 생성하여 0번째 요소에,
// _4_7abstractclassEctenedsCat라는 클래스의 객체를 새로 생성하여 1번째 요소에 저장한다		
		for (int i = 0; i < animals.length; i++) {
// 정수 값을 담는 i라는 변수에 0을 저장하고 i를 1씩 증가시키면서 i가 animals 배열의 크기(2)보다 작을 동안 {}안을 반복해라	
			animals[i].cry();
// animals 배열의 i번째 요소에 저장된 값 안의 cry() 메서드를 호출한다		
		}
	}
}
