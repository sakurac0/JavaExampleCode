package example;

class PersonExample {
	public static void main(String[] args) {
		Person PersonObj1;
		PersonObj1 = new Person();
		PersonObj1.name = "김삿갓";
		PersonObj1.age = 50;
		PersonObj1.weight = 80;
		System.out.println(PersonObj1.name);
		System.out.println(PersonObj1.eat());
	}
}
