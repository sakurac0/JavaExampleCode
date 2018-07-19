package example;

public class _2_11MultimensionalArry {
public static void main(String[] args) {
	
	int arr2[][] = {{1,2,3},{4,5,6}}; // 2차원배열
	for (int i=0; i<2; i++){ // 2중 for문
		for(int j=0;j<3;j++){
			System.out.println("arr2["+i+"]["+j+"] = "+arr2[i][j]);
		}
	}
}
	
}
