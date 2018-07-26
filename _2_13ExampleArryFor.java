package example;

public class _2_13ExampleArryFor {
	public static void main(String[] args) {

		int a[] = { 2, 3, 4, 5, 6, 7, 8, 9 }; // 배열을 이용한 2중 for문 구구단
		int b[] = { 2, 3, 4, 5, 6, 7, 8, 9 };
		for (int i = 0; i <= 7; i++) { // 배열a값 [2~9]까지 반복
			for (int j = 0; j <= 7; j++) { // 배열b값 2~9까지 반복
				System.out.println(a[i] + "*" + b[j] + "=" + a[i] * b[j]); // a[i]*b[j]값출력

			}
		}

		for (int i = 2; i <= 9; i++) { // 2중 for문 구구단
			for (int j = 2; j <= 9; j++) {
				System.out.println(i + "*" + j + "=" + i * j);

			}
		}

	}
}
