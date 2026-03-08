package JOBSHEET3;
import java.util.Scanner;

public class MatakuliahDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of courses: ");
        int n = sc.nextInt();
        sc.nextLine();

        Matakuliah[] arrayMK = new Matakuliah[n];

        for(int i = 0; i < n; i++){

            arrayMK[i] = new Matakuliah();
            System.out.println("-------------------------------------");
            System.out.println("Course Data " + (i+1));

            System.out.print("Course Code : ");
            String code = sc.nextLine();

            System.out.print("Course Name : ");
            String name = sc.nextLine();

            System.out.print("SKS : ");
            int sks = sc.nextInt();
            sc.nextLine();

            System.out.print("jumlah jam : ");
            int jumlahJam = sc.nextInt();
            sc.nextLine();

            arrayMK[i].addData(code, name, sks, jumlahJam);
        }

        System.out.println("\nCourse Information");

        for(int i = 0; i < n; i++){
            arrayMK[i].printInfo();
            System.out.println("----------------------");
        }

    }
}