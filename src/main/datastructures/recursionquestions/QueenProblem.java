package recursionquestions;

public class QueenProblem {
	
	public static void main(String[] args) {
		int i=5;
		int j=5;
		int[][] board= new int[i][j];
		boolean plaed=placeTheQueen(board,0,0);
		System.out.println("queen placed on board>> "+ plaed);
		printSolution(board);
	}

	private static void printSolution(int[][] board) {
		
		for(int i=0;i<board.length;i++) {
			for(int j=0;j<board.length;j++) {
				System.out.print(board[i][j]+" ");
			}
			System.out.println(" ");
		}
	}

	private static boolean placeTheQueen(int[][] board, int row, int column) {
		
		if(row==board.length) {
			return true;
		}
		
		for(int j=column;j<board.length;j++ ) {
			if(canQueenBePlcaed(row, j,board.length, board)) {
				board[row][j]=1;
				row++;
				if(placeTheQueen(board, row, column)) {
					return true;
				}
				else {
					board[--row][j]=0;
				}
			}
		}
		return false;
	}

	private static boolean canQueenBePlcaed(int row, int column, int length, int[][] board) {
		
		//check the column 
		int c=column;
		int r=row;
		while(r>=0) {
			if(board[r--][c]==1) {
				return false;
			}
		}
		
		//check the right diagonal
		c=column;
		r=row;
		while(r >=0 && c <=board.length-1) {
				if(board[r--][c++]==1) {
					return false;
				}
		}
		
		//check the left diagonal
			r=row;
			c=column;
		while(r >=0 && c >=0) {
			if(board[r--][c--]==1) {
				return false;
			}
		}
		return true;
	}

}
