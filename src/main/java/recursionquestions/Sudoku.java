package recursionquestions;


public class Sudoku {

	// N is the size of the 2D matrix N*N
	static int N = 9;

	/* Takes a partially filled-in grid and attempts
	to assign values to all unassigned locations in
	such a way to meet the requirements for
	Sudoku solution (non-duplication across rows,
	columns, and boxes) */
	static boolean solveSudoku(int grid[][], int row,
							int col)
	{
		
		//base condition 
		if(row==8 && col==9) {
			return true;
		}
		
		if(col==9) {
			row++;
			col=0;
		//	solveSudoku(grid, row, 0);
		}
		
		if(grid[row][col]!=0) {
			return solveSudoku(grid, row, col+1);
		}
		for(int i=1;i<=9;i++) {
			if(isSafe(grid, row, col, i)) {
				grid[row][col]=i;
				if(solveSudoku(grid, row, col+1)) {
					return true;
				}
				
			}
			grid[row][col]=0;
		}
		return false;
	}

	/* A utility function to print grid */
	static void print(int[][] grid)
	{
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++)
				System.out.print(grid[i][j] + " ");
			System.out.println();
		}
	}

	// Check whether it will be legal
	// to assign num to the
	// given row, col
	static boolean isSafe(int[][] grid, int row, int col,
						int num)
	{

		// Check if we find the same num
		// in the similar row , we
		// return false
		for (int x = 0; x <= 8; x++)
			if (grid[row][x] == num)
				return false;

		// Check if we find the same num
		// in the similar column ,
		// we return false
		for (int x = 0; x <= 8; x++)
			if (grid[x][col] == num)
				return false;

		// Check if we find the same num
		// in the particular 3*3
		// matrix, we return false
		int startRow = row - row % 3, startCol
									= col - col % 3;
		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 3; j++)
				if (grid[i + startRow][j + startCol] == num)
					return false;

		return true;
	}

	// Driver Code
	public static void main(String[] args)
	{
		int grid[][] = { { 3, 0, 6, 5, 0, 8, 4, 0, 0 },
						{ 5, 2, 0, 0, 0, 0, 0, 0, 0 },
						{ 0, 8, 7, 0, 0, 0, 0, 3, 1 },
						{ 0, 0, 3, 0, 1, 0, 0, 8, 0 },
						{ 9, 0, 0, 8, 6, 3, 0, 0, 5 },
						{ 0, 5, 0, 0, 9, 0, 6, 0, 0 },
						{ 1, 3, 0, 0, 0, 0, 2, 5, 0 },
						{ 0, 0, 0, 0, 0, 0, 0, 7, 4 },
						{ 0, 0, 5, 2, 0, 6, 3, 0, 0 } };

		if (solveSudoku(grid, 0, 0))
			print(grid);
		else
			System.out.println("No Solution exists");
	}
	// This is code is contributed by Pradeep Mondal P
}
