public class APlayer
{
    // instance variables - replace the example below with your own
    protected char symbol;
    protected Game game;

    /**
     * Constructor for objects of class APlayer
     */
    public APlayer(Game game, char symbol)
    {
        this.game = game;
        this.symbol = symbol;
    }
    
    public char getSymbol(){
        return symbol;
    }
    
    public Move pickMove(){
        
    }
}
