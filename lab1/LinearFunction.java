public class LinearFunction extends Function
{
    private double m, b;
    
    public LinearFunction(double m, double b){
        this.m = m;
        this.b = b;
    }
    
    public double imageOf(double x){
        return (m * x) + b;
    }
    
    public double root(){
        return -b/m;
    }
    
    public String toString(){
        return "y = " + m + "x + " + b;
    }
}
