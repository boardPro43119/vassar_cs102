public class Move
{
    private int row;
    private int col;

    /**
     * Constructor for objects of class Move
     */
    public Move(int row, int col)
    {
        this.row = row;
        this.col = col;
    }
    
    public int row(){
        return row;
    }
    
    public int col(){
        return col;
    }
}
