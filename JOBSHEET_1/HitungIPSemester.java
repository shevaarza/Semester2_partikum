import java.util.Scanner;

public class HitungIPSemester {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("===== PROGRAM HITUNG IP SEMESTER =====");
        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMatkul = input.nextInt();
        input.nextLine();

        if (jumlahMatkul <= 0) {
            System.out.println("Jumlah mata kuliah tidak valid.");
          
        }

        String[] namaMatkul = new String[jumlahMatkul];
        int[] sks = new int[jumlahMatkul];
        String[] nilaiHuruf = new String[jumlahMatkul];
        double[] nilaiSetara = new double[jumlahMatkul];

        double totalBobot = 0;
        int totalSKS = 0;

        for (int i = 0; i < jumlahMatkul; i++) {
            System.out.println("\nMata Kuliah ke-" + (i + 1));

            System.out.print("Nama Mata Kuliah : ");
            namaMatkul[i] = input.nextLine();

            System.out.print("Jumlah SKS       : ");
            sks[i] = input.nextInt();
            input.nextLine();

            System.out.print("Nilai Huruf (A/B+/B/C+/C/D/E): ");
            nilaiHuruf[i] = input.nextLine().toUpperCase();

            nilaiSetara[i] = konversiNilai(nilaiHuruf[i]);

            totalBobot += nilaiSetara[i] * sks[i];
            totalSKS += sks[i];
        }

        double ipSemester = (totalSKS != 0) ? totalBobot / totalSKS : 0;

        tampilkanHasil(namaMatkul, sks, nilaiHuruf, nilaiSetara, totalSKS, ipSemester);

        input.close();
    }

   
    public static double konversiNilai(String huruf) {
        switch (huruf) {
            case "A":  return 4.0;
            case "B+": return 3.5;
            case "B":  return 3.0;
            case "C+": return 2.5;
            case "C":  return 2.0;
            case "D":  return 1.0;
            case "E":  return 0.0;
            default:
                System.out.println("Nilai huruf tidak valid, dianggap 0.");
                return 0.0;
        }
    }

    // Method menampilkan hasil
    public static void tampilkanHasil(String[] nama, int[] sks, 
                                       String[] huruf, double[] setara, 
                                       int totalSKS, double ip) {

        System.out.println("\n==========================================================");
        System.out.printf("%-20s %-5s %-10s %-10s\n", 
                          "Mata Kuliah", "SKS", "Nilai", "Setara");
        System.out.println("----------------------------------------------------------");

        for (int i = 0; i < nama.length; i++) {
            System.out.printf("%-20s %-5d %-10s %-10.1f\n",
                              nama[i], sks[i], huruf[i], setara[i]);
        }

        System.out.println("----------------------------------------------------------");
        System.out.printf("Total SKS   : %d\n", totalSKS);
        System.out.printf("IP Semester : %.2f\n", ip);
        System.out.println("==========================================================");
    }
}