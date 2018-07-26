package example;

public class _2_16_Example_Switch {
	public static void main(String[] args) {

		int a = 1000, b = 2000, c = 500, d = 300;

		switch (d * 8) { // (d*8)값에따라 프로그램의 흐름을 전환한다.

		case 1000:
			System.out.println(a * 8);
			break;
		case 2000:
			System.out.println(b * 8);
			break;
		case 500:
			System.out.println(c * 8);
			break;
		case 300:
			System.out.println(d * 8);
			break;
		default:
			System.out.println(d * 8); // case구문에 (d*8)에 일치하는 값이 없으므로 default값실행
			break;
		}
	}
}