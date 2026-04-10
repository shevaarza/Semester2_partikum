package JOBSHEET_5;

import java.util.Scanner;

public class MainSum {
public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Langkah 4: Input jumlah elemen
        System.out.println("=========================================");
        System.out.print("Input element number: ");
        int element = input.nextInt();

        // Langkah 5: Instansiasi objek dan isi array
        Sum sm = new Sum(element);
        for (int i = 0; i < element; i++) {
            System.out.print("Masukkan keuntungan ke-" + (i + 1) + ": ");
            sm.profits[i] = input.nextDouble();
        }

        // Langkah 6: Pemanggilan method BF dan DC
        System.out.println("=========================================");
        System.out.println("Profit total using BF: " + sm.totalBF());
        // Menggunakan parameter (array, index_awal, index_akhir)
        System.out.println("Profit total using DC: " + sm.totalDC(sm.profits, 0, element - 1));
        System.out.println("=========================================");
        
        input.close();
    }
}
