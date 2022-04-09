import java.util.Scanner;

public class SimpleCalc
{
    public static void printEquation(double arg1, double arg2, char operator, double result){
        System.out.println(arg1 + " " + operator + " " + arg2 + " = " + result);
    }
    
    public static void main(String[] args){
        // Scanner to read input
        Scanner s = new Scanner(System.in);
        // two arguments and result
        double arg1, arg2, result;
        // operator
        char operator;
        // invalid operator entered?
        boolean invalidOperator = false;
        
        // welcome message
        System.out.println("SimpleCalc v0.1 alpha by Benjamin Prud'homme");
        
        // prompt for and read arg1 for the first calculation
        System.out.print("Enter arg #1 (0 to exit): ");
        arg1 = s.nextDouble();
        
        // as long as arg1 is not zero, continue with the program
        while(arg1 != 0.0){
            // prompt for and read operator
            System.out.print("Enter operator: ");
            operator = s.next().charAt(0);
            
            // prompt for and read arg2 for the current calculation
            System.out.print("Enter arg #2: ");
            arg2 = s.nextDouble();
            
            // print result or error message
            switch(operator){
                case '+':
                    result = arg1 + arg2;
                    break;
                case '-':
                    result = arg1 - arg2;
                    break;
                case '*':
                    result = arg1 * arg2;
                    break;
                case '/':
                    result = arg1 / arg2;
                    break;
                case '%':
                    result = arg1 % arg2;
                    break;
                default:
                    result = 0;
                    invalidOperator = true;
                    System.out.println("Invalid operator " + operator +
                    ": only +, -, *, /, and % are supported");
            }
            
            if(invalidOperator){
                invalidOperator = false;
            }
            else {
                printEquation(arg1, arg2, operator, result);
            }
            
            // print new lines
            System.out.print("----------------------------------\n\n");
            
            // prompt for and read arg1 for the next calculation
            System.out.print("Enter arg #1 (0 to exit): ");
            arg1 = s.nextDouble();
        }
        
        // goodbye message
        System.out.println("Goodbye");
    }
}
