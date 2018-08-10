package example;

public class _4_8interfaceLife {
// 객체를 정의 생성하는 툴인 _4_8interfaceLife라는 클래스를 만든다
	public static void main(String[] args) {
// 모든 패키지와 클래스에서 접근가능하고, 클래스에서 생성된 객체들과 값을 공유하며,
// 리턴값이 없는 main이라는 함수를 선언하고, 문자열값을 담는 args[]라는 배열을 인자로 받는다		
		_4_8interfaceExample c = new _4_8interfaceExample();
// _4_8interfaceExample 클래스의 객체를 담는 c 변수에 _4_8interfaceExample 클래스의
// _4_8interfaceExample 클래스의 객체를 새로 생성하여 저장한다		
		c.give(1000, "2015-05-01");
// c변수안의 give() 메서드를 1000과 "2015-05-01"을 파라미터 값으로하여 호출한다
		c.receive(25000, "2015-05-02");
// c변수안의 receive() 메서드를 25000과 "2015-05-02"를 파라미터 값으로 하여 호출한다		
		c.work(300000, "2015-05-25");
// c변수안의 work() 메서드를 300000과 "2015-05-25"를 파라미터 값으로 하여 호출한다
	}

}
