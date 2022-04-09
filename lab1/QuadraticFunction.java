public class QuadraticFunction extends Function
{
    private double a, b, c;
    
    public QuadraticFunction(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public double imageOf(double x){
        return (a * x * x) + (b * x) + c;
    }
    
    public double root(){
        return (-b + Math.sqrt((b * b) - (4 * a * c))) / (2 * a);
    }
    
    public String toString(){
        return "y = " + a + "x^2 + " + b + "x + " + c;
    }
}
