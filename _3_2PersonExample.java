package example;

class _3_2PersonExample {
	public static void main(String[] args) {
		_3_1Person PersonObj1;
		PersonObj1 = new _3_1Person();
		PersonObj1.name = "김삿갓";
		PersonObj1.age = 50;
		PersonObj1.weight = 80;
		System.out.println(PersonObj1.name);
		System.out.println(PersonObj1.eat());
	}
}
