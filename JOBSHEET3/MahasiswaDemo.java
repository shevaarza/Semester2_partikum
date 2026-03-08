package JOBSHEET3;

public class MahasiswaDemo {

    public static void main(String[] args) {

        Mahasiswa[] arrayOfMahasiswa = new Mahasiswa[3];

        arrayOfMahasiswa[0] = new Mahasiswa();
        arrayOfMahasiswa[0].nim = "244107060033";
        arrayOfMahasiswa[0].nama = "AGNES TITANIS KINANTI";
        arrayOfMahasiswa[0].kelas = "SIB-1E";
        arrayOfMahasiswa[0].ipk = 3.80f;

        arrayOfMahasiswa[1] = new Mahasiswa();
        arrayOfMahasiswa[1].nim = "254107020172";
        arrayOfMahasiswa[1].nama = "Destama Kurniawan";
        arrayOfMahasiswa[1].kelas = "TI 1I";
        arrayOfMahasiswa[1].ipk = 3.50f;

        arrayOfMahasiswa[2] = new Mahasiswa();
        arrayOfMahasiswa[2].nim = "254107020170";
        arrayOfMahasiswa[2].nama = "Nafi Muhammad Sumbul";
        arrayOfMahasiswa[2].kelas = "TI 1I";
        arrayOfMahasiswa[2].ipk = 3.90f;

        // Display data using loop
        for (int i = 0; i < arrayOfMahasiswa.length; i++) {
            arrayOfMahasiswa[i].printInfo();
        }
    }
}