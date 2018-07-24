package example;

import java.text.BreakIterator;

public class ex_2_10__2_16 {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, };
		String str[] = { "Hello", "CMS", "Java", "Example", "Arry" };
		for (int i = 0; i <= 4; i++) { // for문으로 a[],str[] 배열값출력
			System.out.println(a[i] + " " + str[i]);
		}
		int i = 0;
		while (i <= 4) { // while문으로 a[],str[]값출력
			System.out.println(a[i] + " " + str[i]);
			if (i == 4) {
				break; // i==4이면 while문 탈출
			}
			i++;
		}
		int j = 0;
		do { // dowhile문으로 a[],str[]값 출력
			System.out.println(a[j] + " " + str[j]);
			j++;
		} while (j <= 4);
		int k[][] = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 } }; // 2차원배열
		for (int l = 0; l <= 1; l++) { // 2중 for문으로 k[]출력
			for (int m = 0; m <= 4; m++) {
				System.out.println(k[l][m]);
			}
		}
		for (int n = 2; n <= 9; n++) { // 2중 for문 구구단
			for (int o = 2; o <= 9; o++) {

				System.out.println(n + "*" + o + "=" + n * o);
			}
		}
		int p[] = { 2, 3, 4, 4, 6, 7, 8, 9 }; // 배열을 이용한 2중 for문 구구단
		int q[] = { 2, 3, 4, 5, 6, 7, 8, 9 };
		for (int r = 0; r <= 7; r++) { // 배열 p값 2~9까지반복
			for (int s = 0; s <= 7; s++) { // 배열 q값 2~9까지반복
				System.out.println(p[r] + "*" + q[s] + "=" + p[r] * q[s]); // p[r]*q[s]값
																			// 출력
			}
		}
		for (int t = 0; t <= 10; t++) {
			if (t == 10) { // ㅅ==10이면 continue; 다음 구문실행하지않고넘어감
				continue;
			}
			System.out.println(t);
		}
		int u = 1;
		if (1 != u) { // 1!=u가 false이므로 else값 실행
			System.out.println("Iftest");
		} else {
			System.out.println("IfelsetestOK");
		}
		if (u == 2) {
			System.out.println("IfelseifTestOK1");
		} else if (2 != u) { // 2!= u가 true이므로 else if실행
			System.out.println("IfelseifTestOK2");
		} else {
			System.out.println("IfelseifTestOK3");
		}
		switch (u * 5) {
		case 1:
			System.out.println(u * 5);
			break;
		case 2:
			System.out.println(u * 5);
			break;
		case 3:
			System.out.println(u * 5);
			break;
		case 4:
			System.out.println(u * 5);
			break;
		case 5:
			System.out.println("case 5:SwitchtestOK"); // switch(u*5)값이 5이므로 case 5: 구문 실행
			break;
		default:
			System.out.println(u * 5);
			break;
		}
	}
}
