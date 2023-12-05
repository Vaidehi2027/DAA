public class Daa_assignment6 {
    public static void main(String[] args){
        int n = 4;
        String[][] board = new String[n][n];
        nqueens(board,0);
    }
    public static void nqueens(String[][]board,int row){
        if(row == board.length){
            print2D(board);
            System.out.println();
            return;
        }
        for(int column=0;column< board[0].length;column++){
            if(issafe(board,row,column,4)){
                board[row][column] = "Q";
                nqueens(board,row+1);
                board[row][column] = null;
            }
        }
        
    }
    public static boolean issafe(String[][]board, int row, int column,int n){
        // vertically
        for(int i=0;i<row;i++){
            if(board[i][column] == "Q"){
                return false;
            }
        }
        // left diagonal
        int x = row;
        int y = column;
        while(x >= 0 && y >= 0){
            if(board[x][y] == "Q"){
                return false;
            }
            x --;
            y--;
        }
        // right diagonal
        x = row;
        y = column;
        while(x >= 0 && y < n){
            if(board[x][y] == "Q"){
                return false;
            }
            x--;
            y++;
        }
        return true;
    }
    public static void print2D(String[][] board){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                if(board[i][j] == null){
                    System.out.print(". ");
                }
                else{
                    System.out.print(board[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
