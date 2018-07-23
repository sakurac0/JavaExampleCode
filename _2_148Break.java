package example;

public class _2_148Break {
	public static void main(String[] args) {
		int a = 1;
		while (true) {
			if (a == 3) { // if a==3이면 Break
				break;
			}
			a++; // a값에 계속 +1함.
		}
		System.out.println(a); // Break로 while문 종료되므로 a++이 실행되지못해 a3=3값 출력
	}
}
