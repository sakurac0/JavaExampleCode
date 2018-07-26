package example;

public class _2_14Continue {
	public static void main(String[] args) {

		for (int i = 0; i < 4; i++) {
			if (i == 3) { // i==3일경우 continue실행
				continue;
			}
			System.out.print(i); // break와 달리 continue는아래구문을건너뛰고 실행하므로 012출력

		}
	}
}
