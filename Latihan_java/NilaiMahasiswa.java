public class NilaiMahasiswa {

    String nama;
    String nim;
    double nilaiTugas;
    double nilaiUTS;
    double nilaiUAS;

    double hitungNilaiAkhir(){
        return (nilaiTugas * 0.3) + (nilaiUTS * 0.3) + (nilaiUAS * 0.4);
    }

    String TentukanGrade(){
        double hasilGrade = hitungNilaiAkhir();
        if(hasilGrade >= 85){
            return "A";
        }else if (hasilGrade >= 75){
            return "B";
        }else if (hasilGrade >= 65){
            return "C";
        }else if(hasilGrade >= 55){
            return "D";
        }else{
            return "E";
        }   
    }

    public void displayAll(){
        System.out.println("Nama   :" + nama);
        System.out.println("NIM    :" + nim);
        System.out.println("Nilai rata rata :" + hitungNilaiAkhir());
        System.out.println("TentukanGrade  :" + TentukanGrade());
        System.out.println("--------------------------------------");
    }
}


// Case: Sistem Data Nilai Mahasiswa

// Buatlah program Java untuk menyimpan data nilai mahasiswa.

// Setiap mahasiswa memiliki:

// Nama

// NIM

// Nilai Tugas

// Nilai UTS

// Nilai UAS

// Program harus bisa:

// 1️⃣ Membuat class Mahasiswa
// 2️⃣ Membuat method untuk menghitung nilai akhir

// Rumus nilai akhir:

// Nilai Akhir = (Tugas * 30%) + (UTS * 30%) + (UAS * 40%)

// 3️⃣ Menentukan grade mahasiswa

// Nilai Akhir	Grade
// ≥ 85	A
// ≥ 75	B
// ≥ 65	C
// ≥ 50	D
// < 50	E

// 4️⃣ Simpan 3 mahasiswa dalam array object

// 5️⃣ Tampilkan:

// Nama
// NIM
// Nilai Akhir
// Grade
// Contoh Output
// Nama : Sheva
// NIM  : 254107020173
// Nilai Akhir : 88.5
// Grade : A
// ---------------------

// Nama : Bagas
// NIM  : 17234569
// Nilai Akhir : 76.0
// Grade : B
// ---------------------