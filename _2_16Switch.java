package example;

public class _2_16Switch {
	public static void main(String[] args) {

		int i = 2;

		switch (i * 5) { // (i*5)값에따라 프로그램의 흐름을 전환한다.

		case 0:
			System.out.println(i + "*5=0");
			break;
		case 10:
			System.out.println(i + "*5=10"); // case값이 (i*5)의값 10과 일치 하므로 구문실행.
			break;
		case 15:
			System.out.println(i + "*5=10");
			break;
		default:
			System.out.println("모르겠음");
			break;
		}
	}
}
