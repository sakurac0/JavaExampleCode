package example;

public class _2_10Arry {
	public static void main(String[] args) {

		String str[] = { "Hello", "Java", "Nice to meet you", "Bye!" }; // 1차원배열

		System.out.println(str[0]); // 시스템 콘솔창에 출력하고 한줄 띄운다
		System.out.println(str[1]);
		System.out.println(str[2]);
		System.out.println(str[3]);

		int arr1[] = new int[10], j = 0; // 1차원배열 정수형 변수 arr1[10]을 선언한다

		for (int i = 0; i <= 9; i++) { // arr1[10] 정수형 변수를 이용해 1~10까지 출력한다
			++j;
			arr1[i] = arr1[i] + j;
			System.out.println(arr1[i]);
		}
	}
}
