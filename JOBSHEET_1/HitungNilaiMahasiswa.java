import java.util.Scanner;

public class HitungNilaiMahasiswa {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

       
        System.out.print("Masukkan nilai Tugas: ");
        double tugas = input.nextDouble();

        System.out.print("Masukkan nilai Quiz: ");
        double quiz = input.nextDouble();

        System.out.print("Masukkan nilai UTS: ");
        double uts = input.nextDouble();

        System.out.print("Masukkan nilai UAS: ");
        double uas = input.nextDouble();

        // Validasi nilai
        if (tugas >= 0 && tugas <= 100 &&
            quiz >= 0 && quiz <= 100 &&
            uts >= 0 && uts <= 100 &&
            uas >= 0 && uas <= 100) {

         
            double nilaiAkhir = (tugas * 0.2) + 
                                (quiz * 0.2) + 
                                (uts * 0.3) + 
                                (uas * 0.3);

            String huruf = "";
            double setara = 0;
            String kualifikasi = "";
            String status = "";

         
if (nilaiAkhir >= 81) {
    huruf = "A";
    setara = 4.0;
    kualifikasi = "Sangat Baik";
} 
else if (nilaiAkhir >= 74) {
    huruf = "B+";
    setara = 3.5;
    kualifikasi = "Lebih dari Baik";
} 
else if (nilaiAkhir >= 66) {
    huruf = "B";
    setara = 3.0;
    kualifikasi = "Baik";
} 
else if (nilaiAkhir >= 61) {
    huruf = "C+";
    setara = 2.5;
    kualifikasi = "Lebih dari Cukup";
} 
else if (nilaiAkhir >= 51) {
    huruf = "C";
    setara = 2.0;
    kualifikasi = "Cukup";
} 
else if (nilaiAkhir >= 40) {
    huruf = "D";
    setara = 1.0;
    kualifikasi = "Kurang";
} 
else {
    huruf = "E";
    setara = 0.0;
    kualifikasi = "Gagal";
}

            
            if (huruf.equals("D") || huruf.equals("E")) {
                status = "NOT PASS";
            } else {
                status = "PASS";
            }

      
            System.out.println("----- HASIL -----");
            System.out.println("Nilai Akhir  : " + nilaiAkhir);
            System.out.println("Nilai Huruf  : " + huruf);
            System.out.println("Nilai Setara : " + setara);
            System.out.println("Kualifikasi  : " + kualifikasi);
            System.out.println("Status       : " + status);

        } else {
            System.out.println("Invalid value");
        }

        input.close();
    }
}