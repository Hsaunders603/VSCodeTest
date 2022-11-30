
import java.util.Scanner;



public class CalculatorTime {

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

    static double sub(double array[]){
        double ans = 0;
        for (int i = 0; i < array.length; i++){
            ans -= array[i];}
    return ans;
    }

    static double mlt(double array[]){
        double ans = 0;
        for (int i = 0; i < array.length; i++){
            ans *= array[i];}
    return ans;
    }

    static double div(double array[]){
        double ans = 0;
        for (int i = 0; i < array.length; i++){
            ans /= array[i];}
        return ans; }
    

    public static void main(String[] args) {
        double answer;
        int len = 10;
        int fullops = 0;

        Scanner scan = new Scanner(System.in);
        double[] pout = new double [len];

        for (int operationsDone = 0; operationsDone<len; operationsDone++){

        System.out.print("Please input your operation (+ - * /) or q to quit: ");
        String operation = scan.next();

        if (operation.equals("+")){
            System.out.println("How many numbers would you like to add?");
            int lenAdd = scan.nextInt();
            double addArray[] = new double[lenAdd];
            System.out.println("Please input your numbers:");
            for (int i = lenAdd; i > 0; i--){
                addArray[lenAdd-i] = scan.nextInt();
                System.out.println("You just entered:" + addArray[lenAdd-i]); // debugger
            }
             answer = add(addArray);
        }
        
        else if (operation.equals("-")){
            System.out.println("How many numbers would you like to subtract?");
            int lenSub = scan.nextInt();
            double subArray[] = new double[lenSub];
            System.out.println("Please input your numbers:");
            for (int i = lenSub; i > 0; i--){
                subArray[lenSub-i] = scan.nextInt();
                System.out.println("You just entered:" + subArray[lenSub-i]); // debugger
            }
             answer = sub(subArray);
        }

        else if (operation.equals("*") ){
            System.out.println("How many numbers would you like to multiply?");
            int lenMlt = scan.nextInt();
            double mltArray[] = new double[lenMlt];
            System.out.println("Please input your numbers:");
            for (int i = lenMlt; i > 0; i--){
                mltArray[lenMlt-i] = scan.nextInt();
                System.out.println("You just entered:" + mltArray[lenMlt-i]); // debugger
            }
             answer = mlt(mltArray);
        }

        else if (operation.equals("/")) {
            System.out.println("How many numbers would you like to divide?");
            int lenDiv = scan.nextInt();
            double divArray[] = new double[lenDiv];
            System.out.println("Please input your numbers:");
            for (int i = lenDiv; i > 0; i--){
                divArray[lenDiv-i] = scan.nextInt();
                System.out.println("You just entered:" + divArray[lenDiv-i]); // debugger
            }
             answer = div(divArray);
        }

        else if (operation.equals("q")) {
            break;
        }
        else{
            System.out.println("You are confusing me!");
             answer = 0;
        }
        System.out.println("Your answer is:" + answer);
        pout[operationsDone] = answer;
        fullops = operationsDone;

    }
    System.out.println("Here are your answers:");
    System.out.println("");
    int printouts = 0;
    for (int x = fullops+1; x > 0; x--){
        System.out.println(pout[printouts]);
        printouts++;
    }
        scan.close();
    }
}