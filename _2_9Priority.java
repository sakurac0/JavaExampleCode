package example;

public class _2_9Priority {
	public static void main(String[] args) {

		System.out.println("3+2*8-4 = " + (3 + 2 * 8 - 4)); // 사칙연산 순서에의해 계산
		System.out.println("(3+2)*(8+4) = " + (3 + 2) * (8 - 4)); // ()안값 먼저
																	// 계산하고 *계산
		System.out.println("3<<2 = " + (3 << 2)); // 시프트 연산자
		System.out.println("8>>3 = " + (8 >> 3)); // 시프트 연산자

	}
}
