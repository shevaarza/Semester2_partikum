import Latihan_java.mahasiswa;

public class mahasiswa_main {

    public static void main(String[] args) {

        mahasiswa[] dafMahasiswa = new mahasiswa[3];

        String[] daftar_nama = {"Sheva", "Bagas", "Ringga"};
        String[] daftar_nim = {"254107020173", "17234569", "2541080290"};
        String[] daftar_jurusan = {"Teknik Informatika", "Teknik Informatika", "Sistem Informasi"};
        double[] daftar_ipk = {3.45, 3.89, 3.70};

for(int i = 0; i < dafMahasiswa.length; i++){

    dafMahasiswa[i] = new mahasiswa();

    dafMahasiswa[i].nama = daftar_nama[i];
    dafMahasiswa[i].nim = daftar_nim[i];
    dafMahasiswa[i].jurusan = daftar_jurusan[i];
    dafMahasiswa[i].ipk = daftar_ipk[i];

    dafMahasiswa[i].printInfo();
}
    }
}