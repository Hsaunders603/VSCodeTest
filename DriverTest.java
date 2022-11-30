
import java.util.Scanner;


public class DriverTest {

    static boolean isDouble(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double age;
        System.out.println("Please input how many times you would like to run this:");
        int repeats = scan.nextInt();
        for(int people = repeats; people > 0; people --){

            System.out.print("Please input your age: ");
                
            String StrAge = scan.next();
            boolean checker = isDouble(StrAge); 
            if (checker){
                age = Double.parseDouble(StrAge);
            }
           else{
               age = 0;
           }

            System.out.println();
            System.out.print("Please input your name: ");
            String name = scan.next();

                
            if (age >= 16){
                    System.out.println(name+ ", you have been able to drive for "+(age-16)+" years.");
                }
            else if (age >= 15.5) {
                    System.out.println(name + " , you can learn how to drive!");
                }
            else if (age <= 0){
                    System.out.println("Please retry the program, and enter a valid number for your age.");
            }
            else {
                    double years = 15.5 - age;
                    System.out.println(name + ", you can start learning how to drive in " + years + " years.");
                    //break;
                }
       }
       System.out.println("Thank you for using our driving age calculator.");
       scan.close();
    }
}

