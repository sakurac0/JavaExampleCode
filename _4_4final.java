package example;

public class _4_4final {

	public static void main(String[] args) {

		final String name = "Hee Eun";
		// 변경할수없는 문자열 값을 담는 name 변수를 선언하고 "Hee Eun"을 저장한다
		final int examfinal1 = 123;
		// 변경할수없는 정수 값을 담는 examfinal1 변수를 선언하고 123을 저장한다
		int examfinal2 = 0;
		// 정수값을 담는 examfinal2를 선언하고 0을 저장한다

		System.out.println(name);
		// name 변수를 콘솔에 출력하고 한줄 띄운다
		System.out.println(examfinal1);
		// final1변수를 콘솔에 출력하고 한줄 띄운다
		for (int i = 0; i <= 4; i++) { // 1중 for문
			// examfinal1++;
			// examfinal1변수는 변경할수없는 값을 갖는 변수 이므로 error
			examfinal2++;
			// examfinal2변수의 값에 +1한다
			System.out.println(examfinal2);
			// examfinal2변수를 콘솔에 출력하고 한줄 띄운다

		}
	}
}
