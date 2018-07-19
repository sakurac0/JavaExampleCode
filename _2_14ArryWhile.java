package example;

public class _2_14ArryWhile {
	public static void main(String[] args) {
		String str[] = { "Hello", "Java", "Nice", "to", "meet you", "Bye!" };
		int i = 0;
		while (i < 5) { // i값이 5가 될때까지 반복
			System.out.println(str[i]);
			i++;
		}
	}
}
