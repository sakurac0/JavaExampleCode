package example;

public class _2_15_IfelseIf {
	public static void main(String[] args) {
		int a = 80, b = 60, c = 40, k = 45;
		if (k >= a) {
			System.out.println("A"); // k값이 a<=k일경우 A출력
		} else if (k >= b) {
			System.out.println("B"); // k값이 b<=k일경우 B출력
		} else if (k >= c) {
			System.out.println("C"); // k값이 c<=k일경우 C출력
		} else {
			System.out.println("D"); // k값이 a, b, c값안에 충족하지 못할경우 D출력
		}
	}
}
