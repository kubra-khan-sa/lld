public class TicTacToe {
    private final int[][] board;
    private final int size;
    public TicTacToe(final int size) {
        this.size = size;
        board = new int[size][size]; // Initialize a size x size game board
    }
    public int move(int row, int col, int player) throws IllegalArgumentException {
        if (row < 0 || row >= board.length || col < 0 || col >= board[0].length) {
            throw new IllegalArgumentException("Move is out of bounds");
        }
        else if (player != 0 && player != 1) {
            throw new IllegalArgumentException("Invalid player number");
        }else if (board[row][col] != 0) {
            throw new IllegalArgumentException("Cell is already occupied");
        }else {
            player = player == 0 ? -1 : 1; // Convert player number to -1 or 1  
            board[row][col] = player;// Mark the cell with the player's number
             boolean win = true; // Assume the move is a winning move until proven otherwise
             boolean winrow = windcol = windia = winanti = true;
             for (int i = 0; i < size; i++) {
                if (board[row][i] != player) {
                    winrow = false;
                }if (board[i][col] != player) {
                    windcol = false;
                }if (board[i][  size-1-i] != player) {
                    winanti = false
                }if (board[i][i] != player) {
                    windia = false;
                }
            }
            if (winrow || windcol || winanti || windia) {
                 return player; // Move successful and it's a winning move
            }

            return 0; // Move successful
        }
        return -100; // Move failed, cell is already occupied  
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Tic Tac Toe!");
        // Initialize the game board and other necessary variables here
        // Implement the game logic, player turns, and win conditions
    }
}