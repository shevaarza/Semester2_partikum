package JOBSHEET3;
import java.util.Scanner;

// import JOBSHEET3.Student25;
public class Scanner_mahasiswa {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Student25[] ArrayOfMahasiswa = new Student25[3];

       
        String dummy;

for(int i=0; i < 3; i++) {
    ArrayOfMahasiswa[i] = new Student25();
    
    System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
    System.out.print("NIM    : ");
    ArrayOfMahasiswa[i].nim = scanner.nextLine();
    System.out.print("Nama   : ");
    ArrayOfMahasiswa[i].nama = scanner.nextLine();
    System.out.print("Kelas  : ");
    ArrayOfMahasiswa[i].kelas = scanner.nextLine();
    System.out.print("IPK    : ");
    dummy = scanner.nextLine();
    ArrayOfMahasiswa[i].ipk = Float.parseFloat(dummy);
    System.out.println("------------------------------------");
}

for(int i = 0; i < 3; i++) {
    System.out.println("Data Mahasiswa ke-" + (i + 1));
    System.out.println("NIM    : " + ArrayOfMahasiswa[i].nim);
    System.out.println("Nama   : " + ArrayOfMahasiswa[i].nama);
    System.out.println("Kelas  : " + ArrayOfMahasiswa[i].kelas);
    System.out.printf("IPK    : %.2f\n", ArrayOfMahasiswa[i].ipk);
    System.out.println("------------------------------------");
}
    }
}
