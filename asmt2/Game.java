// class representing game state and workflow

public class Game
{
    private char[][] board;
    private final int boardSize;
    private APlayer[] players;
    private final char SYMBOL_BLANK = ' ';
    private final char SYMBOL_CPU = 'O';
    private final char SYMBOL_HUMAN = 'X';

    /**
     * Constructor for objects of class Game
     */
    public Game(int boardSize)
    {
        this.boardSize = boardSize;
    }
    
    public int getBoardSize(){
        return boardSize;
    }
    
    // Resets the game state for anew round
    protected void resetGame(){
    
    }
    
    // Validates a potential move
    public char isValidMove(Move move){
        if((move.row() < 0) || (move.row() >= boardSize)){
            return 'R';
        }
        else if((move.col() < 0) || (move.col() >= boardSize)){
            return 'C';
        }
        else if(board[move.row()][move.col()] != ' '){
            return 'O';
        }
        else {
            return 'V';
        }
    }
    
    // Executes the move passed as an argument
    protected boolean executeMove(Move move, char symbol){
        if(isValidMove(move) == 'V'){
            board[move.row()][move.col()] = symbol;
            return true;
        }
        else{
            return false;
        }
    }
    
    // Returns current game state as a character
    public char getGameStatus(){
        char winningSymbol;
        
        // check rows for a win
        for(int i=0; i<boardSize; i++){
            winningSymbol = board[i][0];
            for(int j=1; j<boardSize; j++){
                if(board[i][j] != winningSymbol){
                    break;
                }
                if(j == (boardSize-1)){
                    return winningSymbol;
                }
            }
            
        }
        
        // check columns for a win
        for(int i=0; i<boardSize; i++){
            winningSymbol = board[0][i];
            for(int j=1; j<boardSize; j++){
                if(board[j][i] != winningSymbol){
                    break;
                }
                if(j == (boardSize-1)){
                    return winningSymbol;
                }
            }
            
        }
        
        // check one diagonal for a win
        winningSymbol = board[0][0];
        for(int j=1; j<boardSize; j++){
            if(board[j][j] != winningSymbol){
                break;
            }
            if(j == (boardSize-1)){
                return winningSymbol;
            }
        }
        
        // check the other diagonal for a win
        winningSymbol = board[0][boardSize-1];
        for(int j=1; j<boardSize; j++){
            if(board[j][boardSize-1-j] != winningSymbol){
                break;
            }
            if(j == (boardSize-1)){
                return winningSymbol;
            }
        }
        
        // check if the game is over and tied, or still going
        for(int i=0; i<boardSize; i++){
            for(int j=1; j<boardSize; j++){
                if(board[i][j] == SYMBOL_BLANK){
                    return '?';
                }
            }
        }
        
        return 'T';
        
    }
    
    public String toString(){
        String result = "   ";
        char nextRow = 'A';
        
        // Print column labels
        for(int col=1; col <= boardSize; col++){
            result += " " + col + "  ";
        }
        
        result += "\n";
        
        for(int row=0; row < boardSize; row++){
            // print row label
            result += " " + nextRow + " ";
            nextRow++;
            
            // print contents of each row
            for(int col=0; col < boardSize; col++){
                result += " " + board[row][col] + " ";
                if(col != (boardSize-1)){
                    result += "|";
                }
            }
            
            result += "\n";
            
            if(row != (boardSize-1)){
                for(int col=0; col < boardSize; col++){
                    result += "---";
                    if(col != (boardSize-1)){
                        result += "|";
                    }
                }
            }
        }
     
        return result;
    }

    public char playSingleGame(){
        
    }
    
    public static void main(String[] args){
        
    }
    
}
