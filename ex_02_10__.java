package example;

public class ex_02_10__ {
public static void main(String[] args) {
String arr[] = {"Hello","Example","Code"}; // 1차원배열
for (int i=0;i<3;i++){ // 1중 for문
System.out.println(arr[i]);
}
int arr2[][] = {{1,2,3},{4,5,6}}; // 2차원배열
for (int i=0;i<2;i++){ // 2중 for문
	for (int j=0;j<3;j++){
		System.out.println(arr2[i][j]);
}
}
}
}
