package Assessment;

public class findMax {

	public static void main(String[] args) {
		int a[][] = { { 2, 2, 8 }, { 7, -1, 3 }, { 5, 3, 0 } };
		System.out.println(getMaxOfMinColumn(a));
	}

	public static int getMaxOfMinColumn(int[][] a) {
		int minNum = a[0][0];
		int minColumnNum = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				if (minNum > a[i][j]) {
					minNum = a[i][j];
					minColumnNum = j;
				}
			}
		}
		
		System.out.println(minNum);
		System.out.println(minColumnNum);

		for (int k = 0; k < a[0].length; k++) {
			if (minNum < a[k][minColumnNum]) {
				minNum = a[k][minColumnNum];
			}
		}
		
		System.out.println(minNum);
		
		

		return minNum;
	}

}
