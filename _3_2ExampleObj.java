package example;

class _3_2ExampleObj { // 객체를정의 생성하는툴인 _3_2ExampleObj이라는 변수를 선언한다
	public static void main(String[] args) {
		_3_1ExamObj ExamObj1; // _3_1ExamObj이라는 객체를 담는 ExamObj1이라는 변수를 선언한다
		ExamObj1 = new _3_1ExamObj();
		ExamObj1.a = "ExamObjTestOK";
		// ExamObj1변수안의 a변수에 "ExamObjTestOK"을 저장한다
		ExamObj1.b = 1234;
		// ExamObj1변수안의 b변수에 "1234"을 저장한다
		System.out.println(ExamObj1.a);
		// ExamObj1변수안의 a변수의 값을 시스템 콘솔에 출력하고 한줄 띄운다
		System.out.println(ExamObj1.b);
		// ExamObj1변수안의 b변수의 값을 시스템 콘솔에 출력하고 한줄 띄운다
		System.out.println(ExamObj1.c());
		// ExamObj1변수 안의 c메서드를 호출하여 시스템 콘솔에 출력하고 한 줄 띄운다
	}
}
