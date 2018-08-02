package example;

class _4_3OverrideSubjectExample {
	// 객체를 정의/생성하는 툴인 _4_3OverrideSubjectExample이라는 클래스를 만든다
	public static void main(String[] args) {
		MajorSubject sub = new MajorSubject();
		// MarjorSubject라는 클래스의 객체를 담는 sub라는 변수를 선언하고
		// MarjorSubject 클래스의 객체를 새로 생성하여 저장한다
		sub.name = "자바프로그래밍";
		// sub 변수 안의 name 변수에 "자바프로그래밍"을 저장한다
		sub.targetGrader = "2학년";
		// sub 변수안의 TargetGrader 변수에 "2학년"을 저장한다
		sub.printInfo();
		// sub 변수 안의 printInfo 메서드를 호출한다
	}
}
// 오버라이딩 vs 오버로딩
// 오버라이딩 슈퍼 클래스를 상속받은 서브 클래스에서 슈퍼 클래스의 메서드를 다시 정의 하는것
// 오버로딩 하나의 클래스 내에서 동일한 이름의 메서드를 파라미터, 리턴 타입 등을 다르게 하여 여러개
// 정의하는것
