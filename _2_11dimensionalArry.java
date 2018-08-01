package example;

public class _2_11dimensionalArry {
	public static void main(String[] args) {

		int arr2[][] = { { 1, 2, 3 }, { 4, 5, 6 } }; // 2차원배열

		System.out.println("arr2[0][0] = " + arr2[0][0]); // 시스템 콘솔창에 출력하고 한줄
															// 띄운다
		System.out.println("arr2[0][1] = " + arr2[0][1]);
		System.out.println("arr2[0][2] = " + arr2[0][2]);
		System.out.println("arr2[1][0] = " + arr2[1][0]);
		System.out.println("arr2[1][1] = " + arr2[1][1]);
		System.out.println("arr2[1][2] = " + arr2[1][2]);

		int arr3[][] = new int[2][5], k = 0; // 2차원배열 정수형변수 arr3[2][5]를 선언한다

		for (int i = 0; i <= 1; i++) { // arr3[2][5] 정수형 변수를 이용해 1~10까지 출력한다
			for (int j = 0; j <= 4; j++) {
				++k;
				arr3[i][j] = arr3[i][j] + k;
				System.out.println(arr3[i][j]);
			}
		}

	}
}
