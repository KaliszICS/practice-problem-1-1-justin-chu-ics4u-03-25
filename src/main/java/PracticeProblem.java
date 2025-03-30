public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static int sum2D(int[][] arrayarray) {
		int sum = 0;

		for (int row = 0; row < arrayarray.length; row++) {
			for (int column = 0; column < arrayarray[row].length; column++) {
				sum += arrayarray[row][column];
			}
		}

		return sum;
	}

	public static int sumRow(int[][] twodeearray, int rownumber) {
		int rowsum = 0;

		for (int column = 0; column < twodeearray[rownumber].length; column++) {
			rowsum += twodeearray[rownumber][column];
		}

		return rowsum;
	}

	public static int sumColumn(int[][] arraying, int columnnumber) {
		int sum = 0;

		for (int row = 0; row < arraying.length; row++) {
			sum += arraying[row][columnnumber];
		}

		return sum;
	}

	public static void q4() {
		//Write question 4 code here
	}

	public static void q5() {
		//Write question 5 code here
	}

}

//why is the autotest failing even though all tests are passed