package example;

class _3_4constructor {

	String name;
	int age;
	int weight;

	public _3_4constructor(String name, int age, int weight) {
		// constructor클래스의 객체 필드를 초기 설정하는 생성하는 생성자를 만들고
		// 문자열 값을 담는 name 파라미터변수와 정수를 담는 sge,weight 파라미터 변수를 인자로 받는다

		super();
		this.name = name;
		// 이 클래스로 생성된 객체 안의 name 변수에 name 파라미터 변수를 저장한다
		this.age = age;
        // 이 클래스로 생성된 객체 안의 age 변수에 age 파라미터 변수를 저장한다
		this.weight = weight;
	    // 이 클래스로 생성된 객체 안의 weight 변수에 weight 파라미터 변수를 저장한다
	}

	String eat() {
		return "eat";
	}

	String sleep() {
		return "sleep";
	}
}
