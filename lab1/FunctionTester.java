public class FunctionTester
{
    public static void getRootAndConfirm(Function f){
        double fRoot = f.root();
        System.out.println("Function " + f.toString() + " has root "
        + fRoot + ". f(" + fRoot + ") = " + f.imageOf(fRoot));
    }
    
    public static void main(String[] args){
        double m = 1;
        double b = 6;
        Function f1 = new LinearFunction(m, b);
        getRootAndConfirm(f1);
        
        double a = 1;
        double qb = 4;
        double c = 4;
        Function f2 = new QuadraticFunction(a, qb, c);
        getRootAndConfirm(f2);
    }
}
