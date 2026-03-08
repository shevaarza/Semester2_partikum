package JOBSHEET3;

import java.util.Scanner;

public class DosenDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input number of lecturers: ");
        int n = sc.nextInt();
        sc.nextLine();

        Dosen[] arrayOfDosen = new Dosen[n];

        for (int i = 0; i < n; i++) {

            System.out.println("\nLecturer Data " + (i + 1));

            System.out.print("Code : ");
            String code = sc.nextLine();

            System.out.print("Name : ");
            String name = sc.nextLine();

            System.out.print("Gender (true=Male, false=Female): ");
            boolean gender = sc.nextBoolean();

            System.out.print("Age : ");
            int age = sc.nextInt();
            sc.nextLine();

            arrayOfDosen[i] = new Dosen(code, name, gender, age);
        }

        DataDosen data = new DataDosen();

        data.dataAllDosen(arrayOfDosen);
        data.numberOfLecturersPerGender(arrayOfDosen);
        data.AverageAgeOfLecturersPerGender(arrayOfDosen);
        data.infoDosenPalingTua(arrayOfDosen);
        data.infoDosenMostYoungest(arrayOfDosen);

    }
}