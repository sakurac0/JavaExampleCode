package example;

class _3_2PersonExample { // 객체를정의 생성하는툴인 _3_2PersonExample이라는 변수를 선언한다

	public static void main(String[] args) {

		_3_1Person PersonObj1; // _3_1Person이라는 객체를 담는 PersonObj1이라는 변수를 선언한다

		PersonObj1 = new _3_1Person(); // PersonObj1변수에 Person 클래스의 객체를 새로 생성하여 저장한다
		PersonObj1.name = "김삿갓"; // PersonObj1변수안의 name변수에 "김삿갓을 저장한다
		PersonObj1.age = 50; // PersonObj1 age변수에 50을 저장한다
		PersonObj1.weight = 80; // PersonObj1 weight 변수에 80을 저장한다
		
		System.out.println(PersonObj1.name); // PersonObj1변수안의 name변수의 값을 시스템 콘솔에 출력하고 한줄 띄운다
		System.out.println(PersonObj1.eat()); // PersonObj1변수 안의 eat메서드를 호출하여 시스템 콘솔에 출력하고 한 줄 띄운다
	}
}
