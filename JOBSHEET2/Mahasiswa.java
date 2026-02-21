public class Mahasiswa {
    String nama = "Unknown";
    String nim = "-";
    String kelas = "-";
    double ipk = 0.0;

  public Mahasiswa(){}
   
     void tampilkan_informasi(){
        System.out.println("Nama:" + nama);
        System.out.println("NIM:" + nim);
        System.out.println("IPK:" + ipk);
        System.out.println("kelas:" + kelas);
    }

    void ubahKelas(String kelasBaru){
        kelas = kelasBaru;
    }
    void updateIPK(double update_ipk){
        if(update_ipk >= 0 && update_ipk <= 4.0){
            ipk = update_ipk;
        }else{
            System.out.println("invalid GPA ");
        }
    }

    String nilai_kerja(){

      
        if(ipk >= 3.5){
            return "Kinerja sangat baik";
        }else if ( ipk >= 3.0){
            return "Kinerja baik";
        }else if (ipk >= 2.0){
            return "kinerja cukup ";
        }else {
            return "Kinerja kurang";
        }
    }

    public Mahasiswa(String nama , String nim , double ipk , String kelas){
       this.nama = nama;
       this.nim = nim;
       this.ipk = ipk;
       this.kelas = kelas;
    }

    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa();

        mahasiswa1.nama = "Muhammad Ali Farhan";
        mahasiswa1.nim = "2241720171";
        mahasiswa1.kelas= "SI 2J";
        mahasiswa1.ipk = 3.55;

        mahasiswa1.tampilkan_informasi();
        mahasiswa1.ubahKelas("SI 2K");
        mahasiswa1.updateIPK(3.6);
        mahasiswa1.tampilkan_informasi();

    Mahasiswa mhsSheva = new Mahasiswa(
    "Sheva Arzadina Hizbullah Kurniawan",
    "254107020173",
    3.95,
    "TI 1I"
);
    mhsSheva.updateIPK(3.99);
    mhsSheva.tampilkan_informasi();
    

   
}

}


// 1.	Name two characteristics of a class or object! 
// 2.	Pay attention to the Mahasiswa class in Practicum 1, how many attributes do the Student class have? Mention what the attributes are! 
// 3.	How many methods does the class have? Mention what the methods are! 
// 4.	Pay attention to  the method updateIpk contained in  the Mahasiswa class. Modify the content of the method so that the GPA entered is valid, namely first checking whether the GPA entered is in the range of 0.0 to 4.0 (0.0 <= GPA <= 4.0). If the GPA is not in that range, the message is issued: "GPA is invalid. Must be between 0.0 and 4.0". 
// 5.	Explain how  the nilaiKinerja() method  works in evaluating student performance, what criteria are used to determine the performance value, and what is returned by the nilaiKinerja()  method? 
