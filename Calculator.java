import java.util.Scanner;

public class Calculator {
    static double add(double array[]){
        double ans = 0;
     for (int i = 0; i < array.length; i++){
         ans += array[i];
     }
     return ans;
    }

    static double avg(double array[]){
        return add(array) / array.length;   
    }

    static double PrintThenScan(Scanner scan, String prompt){
        System.out.println(prompt);
        return scan.nextDouble();
    }
    

    public static void main(String...args) {
        Scanner scan = new Scanner(System.in);
        double array[] = new double[10];
        for (int i = 0; i < array.length; i++){
            array[i] = PrintThenScan(scan,"Gimme a number:");
        }
        System.out.println("Your sum is:" + add(array));
        System.out.println("Your average is:" + avg(array));
    }

    public static void calculate(String...args){
        
    }
}

