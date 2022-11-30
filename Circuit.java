import java.util.function.DoubleSupplier;
import java.util.Scanner;
public class Circuit {
    
    public static void main(String...args){
        Scanner scan = new Scanner(System.in);
        // These two have the same result, sup1 is just shorter for single-line lambdas
        DoubleSupplier sup1 = () -> 42;
        DoubleSupplier sup2 = () -> {
            return 42;
        };
        // Get a reference (a handle) to the nextDouble function on the scan object
        DoubleSupplier nextDouble = scan::nextDouble;
        // Now call a supplier
        double x = nextDouble.getAsDouble();
        System.out.println(sup1.getAsDouble());
        System.out.println(sup2.getAsDouble());
        System.out.println(x);
            
        
        scan.close();
    }

}