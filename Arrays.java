import java.util.Scanner;
public class Arrays {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        double WeasleyAges[] = new double [7];
        //type name ([]=array) = new type  space
        //new allocates memory
        WeasleyAges[0] = 11;
        WeasleyAges[1] = 12;
        WeasleyAges[2] = 13;
        WeasleyAges[3] = 14;
        WeasleyAges[4] = 15;
        WeasleyAges[5] = 16;
        WeasleyAges[6] = 17;

        String WeasleyNames[] = new String[7];
        WeasleyNames[0] = "Ginny";
        WeasleyNames[1] = "Ron";
        WeasleyNames[2] = "Fred";
        WeasleyNames[3] = "George";
        WeasleyNames[4] = "Percy";
        WeasleyNames[5] = "Charlie";
        WeasleyNames[6] = "Bill";

        double input[] = new double[2];
        input[0] = scan.nextDouble();
        input[1] = scan.nextDouble();

        for (int i = 0; i < 7; i++) {
            System.out.println(WeasleyAges[i]);
            System.out.println(WeasleyNames[i]);

        }
        scan.close();
    }
}