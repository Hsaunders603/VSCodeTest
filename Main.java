import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your grade ");
        int m=sc.nextInt(); //my grade ex: 80
        int n =sc.nextInt(); //the full grade ex:120
        int x=m*100/n;
        System.out.println(x<50?"fail":"pass");
//the print operator can perform the ternary operaton here but some how it doesn't run
    }
}
