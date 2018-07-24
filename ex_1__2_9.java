package example;

public class ex_1__2_9 {
	public static void main(String[] args) {
		System.out.println("Hello! CMS"); // "Hello CMS" 문자열출력
		String str1 = "Hello"; // String변수 str1~3까지 선언후 문자열 값 저장
		String str2 = "CMS";
		String str3 = "Welcome";
		System.out.println(str1); // String변수 str1~3까지 출력
		System.out.println(str2);
		System.out.println(str3);
		System.out.println("1+1=" + (1 + 1)); // ()안의 계산값 출력
		System.out.println("3-1=" + (3 - 1));
		System.out.println("2*1=" + (2 * 1));
		System.out.println("2/2=" + (2 / 2));
		System.out.println("2/2 나머지 값은 " + (2 % 2)); // 2/2의 나머지값 구하는 연산자%
		int a = 10; // 정수 =10값 변수 선언

		a += 2; // a+=2는 변수 a값에 2를 플러스함
		System.out.println(a);
		a -= 2; // -=2는 변수 a값에 2를 마이너스함
		System.out.println(a);
		a *= 2; // *=2는 변수a값에 2를 곱하기함
		System.out.println(a);
		a /= 2; // /=2는 변수a값에 2를 나누기함
		System.out.println(a);
		a %= 5; // %=5는 a갖ㅅ에 /5를한후 나머지 값을 구함
		System.out.println(a);

		System.out.println(++a);
		System.out.println(a--);
		System.out.println(++a);

		int b = 2;
		System.out.println("a<b : " + (a < b)); // 변수a와b의사이에연산자값에따라true,false출력
		System.out.println("a>b : " + (a > b));
		System.out.println("a!= : " + (a != b));
		System.out.println("a==b : " + (a == b));

		System.out.println((a == 1) && (b == 1)); // =는a=10처럼값을대입하므로==가같다&&는and연산자임
		System.out.println((a == 1) || (b == 1)); // ||는 or연산자
		System.out.println(!(a == 1)); // !연산자는 값이 false일경우 true값출력
	}
}
