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
		System.out.println(ExamObj1.b);
		System.out.println(ExamObj1.c());
	}
}
