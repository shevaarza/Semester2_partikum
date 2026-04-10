import java.util.Scanner;

import Latihan_java.mahasiswa;
public class NilaiMahasiswaMain {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    NilaiMahasiswa[] NilaiMahasiswa = new NilaiMahasiswa[3];
    for(int i = 0 ; i < NilaiMahasiswa.length ; i++){
        NilaiMahasiswa[i] = new NilaiMahasiswa();
        System.out.println("------------- Input Nilai Mahasiswa -----------------------");
        System.out.print("Input Name :");
        String names = scanner.nextLine();
        System.out.print("Input NIM :");
        String nim = scanner.nextLine();
        System.out.print("Input Value of Assigment :");
        double assg = scanner.nextDouble();
        System.out.print("Input Value of UTS :");
        double uts = scanner.nextDouble();
        System.out.print("Input Value of USA :");
        double uas = scanner.nextDouble();
        scanner.nextLine();

        NilaiMahasiswa[i].nama = names;
        NilaiMahasiswa[i].nim = nim;
        NilaiMahasiswa[i].nilaiTugas = assg;
        NilaiMahasiswa[i].nilaiUTS = uts;
        NilaiMahasiswa[i].nilaiUAS = uas;

        NilaiMahasiswa[i].hitungNilaiAkhir();
        NilaiMahasiswa[i].TentukanGrade();


    }
    System.out.println("----------------------------------------");
    System.out.println();
    System.out.println();           
    for (int i = 0 ; i < NilaiMahasiswa.length ; i++){
        NilaiMahasiswa[i].displayAll();
    }

    }
}
