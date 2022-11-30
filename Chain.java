import java.util.Scanner;
import java.util.function.DoubleUnaryOperator;

public class Chain {

    public static DoubleUnaryOperator chain(DoubleUnaryOperator a, DoubleUnaryOperator b){
        DoubleUnaryOperator blah = (double x) -> {
            double result = a.applyAsDouble(x);
            return b.applyAsDouble(result);
        };
        return blah;

    }
    public static void main(String[] args){
        DoubleUnaryOperator a = (double x) -> x * 2;
        DoubleUnaryOperator b = (double x) -> -x; 
        DoubleUnaryOperator both = chain(a,b);

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number");
        double numberToDoTheThingyTo = scan.nextDouble();
        System.out.println(a.applyAsDouble(numberToDoTheThingyTo));
        System.out.println(both.applyAsDouble(numberToDoTheThingyTo));

        



        scan.close();


        
    }
    
}
