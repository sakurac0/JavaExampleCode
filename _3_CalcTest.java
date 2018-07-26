package example;

class _3_CalcTest { // 객체를 생성하는 툴인 CalcTest라는 클래스를 만든다 
	public static void main(String[] args) {
		_3_3Calc calc = new _3_3Calc(); // _3_3라는 클래스의 객체를 담는 calc라는 변수를 선언하고 _3_3Calc 클래스의 객체를 새로 생성하여 저장한다
		calc.plus(); // calc변수 안의 plus()메서드를 호출한다
		System.out.println(calc.plus(1, 3)); // calc안의 plus 메서드를 1과3 파라미터값으로 호출하여 시스템콘솔에 출력하고 한줄 띄운다
		System.out.println(calc.plus(1.5, 2.5, 3.5)); // calc안의 plus 메서드를 1.5,2.5,3.5 파라미터값으로 호출하여 시스템콘솔에 출력하고 한줄 띄운다
	}
}
