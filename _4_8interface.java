package example;

interface Money {
	// 공동 기능을 추출한 Money라는 인터페이스를 선언한다
	abstract void give(int money, String date);

	abstract void receive(int money, String date);

}

interface Work {
// 공동 기능을 추출한 Work라는 인터페이스를 선언한다
	abstract void work(int salary, String date);

}

// 인터페이스는 메서드만 있음!