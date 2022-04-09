
public class Matrix
{
    int[][] m;
    int nrows, ncols;

    public Matrix(int rows, int cols)
    {
        this.nrows = rows;
        this.ncols = cols;
        m = new int[nrows][ncols];
        
        for(int i=0; i<nrows; i++){
            for(int j=0; j<ncols; j++){
                m[i][j] = (int) (Math.random() * 10);
            }
        }
    }
    
    public boolean add(Matrix b){
        if((nrows != b.nrows) || (ncols != b.ncols)){
            return false;
        }
        else {
            for(int i=0; i<nrows; i++){
                for(int j=0; j<ncols; j++){
                    m[i][j] += b.m[i][j];
                }
            }
            return true;
        }
    }
    
    public boolean subtract(Matrix b){
        if((nrows != b.nrows) || (ncols != b.ncols)){
            return false;
        }
        else {
            for(int i=0; i<nrows; i++){
                for(int j=0; j<ncols; j++){
                    m[i][j] -= b.m[i][j];
                }
            }
            return true;
        }
    }

    public String toString(){
        String result = "";
        for(int i=0; i<nrows; i++){
            result += "[";
            for(int j=0; j<ncols; j++){
                result += m[i][j];
                if(j<(ncols - 1))
                    result += ", ";
            }
            result += "]\n";
        }
        
        return result;
    }
    
    public static void main(String[] args){
        int rows = Integer.parseInt(args[0]);
        int cols = Integer.parseInt(args[1]);
        
        System.out.println("CMPU 102 Lab #3 by Benjamin Prud'homme");
        
        Matrix a = new Matrix(rows, cols);
        Matrix b = new Matrix(rows, cols);
        
        System.out.println("Random matrix a:\n" + a);
        System.out.println("Random matrix b:\n"+ b);
        
        a.add(b);
        
        System.out.println("a+b =\n" + a);
        
        a.subtract(b);
        
        System.out.println("(a+b)-b =\n" + a);
        
    }
}
