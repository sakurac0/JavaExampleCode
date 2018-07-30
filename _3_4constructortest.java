package example;

class _3_4constructortest {
	public static void main(String[] args) { // 여러 생성자로 객체 초기화 하기
		_3_1Person p1 = new _3_1Person();
		p1.name = "hin";
		_3_1Person p2 = new _3_1Person();
		p2.name = "John";
		p2.age = 19;
		_3_1Person p3 = new _3_1Person();
		p3.name = "Miranda";
		p3.age = 24;
		p3.weight = 50;
		System.out.println(p1.name);
		System.out.println(p2.name);
		System.out.println(p3.name);
		}
}
