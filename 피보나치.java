package example;

public class 피보나치 {
	public static void main(String[] args) {

		int arr1[] = new int[100];
		int arr2[] = new int[100];

		for (int i = 0; i <= 99; i++) {

			arr1[i] = arr1[i] + i;
			arr1[i] %= 2;
			arr2[i] = arr2[i] + i;
			if (arr1[i] != 0) { // arr1[i]의 값이 0이 아닐경우 arr2[i]의 값을 콘솔창에 출력
				System.out.println(arr2[i]);
			}

		}

	}

}
