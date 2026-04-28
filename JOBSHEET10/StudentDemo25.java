import java.util.Scanner;

public class StudentDemo25 { // Ganti 22 dengan nomor absen Anda
    public static void main(String[] args) {
        // 16. Instansiasi objek stack dengan kapasitas 5
        StudentAssignmentStack25 stack = new StudentAssignmentStack25(5);
        
        // 17. Deklarasi Scanner dan variabel pilihan
        Scanner scan = new Scanner(System.in);
        int choice;

        // 18. Menu menggunakan do-while loop
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Mengumpulkan Tugas");
            System.out.println("2. Menilai Tugas");
            System.out.println("3. Melihat Tugas Teratas");
            System.out.println("4. Melihat Daftar Tugas");
            System.out.print("Pilih: ");
            choice = scan.nextInt();
            scan.nextLine(); // Membersihkan buffer newline

            switch (choice) {
                case 1:
                    System.out.print("Nama : ");
                    String nama = scan.nextLine();
                    System.out.print("NIM  : ");
                    String nim = scan.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = scan.nextLine();

                    Student25 mhs = new Student25(nim, nama, kelas);
                    stack.push(mhs);
                    System.out.printf("Tugas %s berhasil dikumpulkan\n", mhs.name);
                    break;

                case 2:
                    Student25 dinilai = stack.pop();
                    if (dinilai != null) {
                        System.out.println("Menilai tugas dari " + dinilai.name);
                        System.out.print("Masukkan nilai (0-100): ");
                        int nilai = scan.nextInt();
                        dinilai.grading(nilai);
                        System.out.printf("Nilai Tugas %s adalah %d\n", dinilai.name, nilai);
                    }
                    break;

                case 3:
                    Student25 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Tugas terakhir dikumpulkan oleh " + lihat.name);
                    }
                    break;

                case 4:
                    System.out.println("Daftar semua tugas:");
                    System.out.println("NIM\tNama\tKelas");
                    stack.print();
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (choice >= 1 && choice <= 4);

        scan.close();
    }
}