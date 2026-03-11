public class TicTacToe {
    private final int[][] board;
    private final int size;
    private int[] rowCounts;
    private int[] colCounts;
    private int diagCount;
    private int antiDiagCount;
    private int winner;
    public TicTacToe(final int size) {
        this.size = size;
        board = new int[size][size]; // Initialize a size x size game board
    }
    public int move(int row, int col, int player) throws IllegalArgumentException {
        if (row < 0 || row >= board.length || col < 0 || col >= board[0].length) {
            throw new IllegalArgumentException("Move is out of bounds");
        }
         if (player != 0 && player != 1) {
            throw new IllegalArgumentException("Invalid player number");
        } if (board[row][col] != 0) {
            throw new IllegalArgumentException("Cell is already occupied");
        }if rowCounts[row ] = abs(size) || colCounts[col] == abs(size) || diagCount == abs(size) || antiDiagCount == abs(size) {
            return player; // Return the player number if they win
        }
            player = player == 0 ? -1 : 1; // Convert player number to -1 or 1  
            board[row][col] = player;// Mark the cell with the player's number      
            rowCounts[row] += player; // Reset the count for this row
            colCounts[col] += player; // Reset the count for this column
            if (row ==size-col-1) {
                antiDiagCount += player; // Reset the count for this anti-diagonal
            }if (row == col) {
                diagCount += player; // Reset the count for this diagonal
            }
    if rowCounts[row ] = abs(size) || colCounts[col] == abs(size) || diagCount == abs(size) || antiDiagCount == abs(size) {
           winner = player; // Return the player number if they win
        }  
    }
    private getWinner() {
        return winner; // Return the current winner (0 if no winner yet)
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Tic Tac Toe!");
        // Initialize the game board and other necessary variables here
        // Implement the game logic, player turns, and win conditions
    }
}