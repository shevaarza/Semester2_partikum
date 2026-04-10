package JOBSHEET_5;
import java.util.Scanner;

public class MainPower {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int elemen = input.nextInt();

        
        power[] png = new power[elemen];

        for (int i = 0; i < elemen; i++) {
            System.out.print("Input base number for " + (i + 1) + "th element: ");
            int basis = input.nextInt();

            System.out.print("Input exponent for " + (i + 1) + "th element: ");
            int exp = input.nextInt();

            png[i] = new power(basis, exp);
        }

        
        System.out.println("=======================================");
        System.out.println("power RESULT USING BRUTE FORCE:");
        for (power p : png) {
            System.out.println(p.baseNumber + "^" + p.exponent + " : " + p.powerBF(p.baseNumber, p.exponent));
        }

        // Output Divide and Conquer
        System.out.println("---------------------------------------");
        System.out.println("power RESULT USING DIVIDE AND CONQUER:");
        for (power p : png) {
            System.out.println(p.baseNumber + "^" + p.exponent + " : " + p.powerDC(p.baseNumber, p.exponent));
        }

        System.out.println("=======================================");

        input.close();
    }
}