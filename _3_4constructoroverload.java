package example;

class _3_4constructoroverload { // 생성자 오버로딩
	String name;
	int age;
	int weight;

	_3_4constructoroverload(String name, int age, int qwight) {
		this.name = name;
		this.age = age;
		this.weight = weight;
	}

	_3_4constructoroverload(String name, int age) {
		this.name = name;
		this.age = age;
		this.weight = weight;
	}

	String eat() {
		return "eat";
	}

	String sleep() {
		return "sleep";
	}

}
