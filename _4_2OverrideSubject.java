package example;

class _4_2OverrideSubject {
	String name;

	void printInfo() {
		System.out.println("과목명:" + name);
	}
}

class MajorSubject extends _4_2OverrideSubject {
	String targetGrader;

	void printInfo() {
		super.printInfo();
		System.out.println("대상학년:" + targetGrader);
	}

}