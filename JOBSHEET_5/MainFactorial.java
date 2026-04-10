package JOBSHEET_5;
import java.util.Scanner;

public class MainFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("------------- Program Factorial ----------------");
        System.out.print("Input Number : ");
        int number = scanner.nextInt();

        factorial fk = new factorial();

        System.out.println("The factorial of " + number + " using BF : " + fk.factorialBF(number));
        System.out.println("The factorial of " + number + " using DC : " + fk.factorialDC(number));

        scanner.close();
    }
}