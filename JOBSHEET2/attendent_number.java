public class attendent_number {
    String nama;
    String nim;
    String kelas;
    double ipk;
   
     void tampilkan_informasi(){
        System.out.println("Nama:" + nama);
        System.out.println("NIM:" + nim);
        System.out.println("kelas:" + kelas);
        System.out.println("IPK:" + ipk);
    }

    void ubahKelas(String kelasBaru){
        kelas = kelasBaru;
    }
    void updateIPK(double update_ipk){
        if(update_ipk >= 0 && update_ipk <= 4.0){
            System.out.println("update succes");
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

    public static void main(String[] args) {
        attendent_number mahasiswa1 = new attendent_number();

        mahasiswa1.nama = "Sheva Arzadina Hizbullah Kurniawan";
        mahasiswa1.nim = "254107020173";
        mahasiswa1.kelas= "TI i1";
        mahasiswa1.ipk = 3.95;

        mahasiswa1.tampilkan_informasi();
        mahasiswa1.ubahKelas("SI 2K");
        mahasiswa1.updateIPK(3.96);
        mahasiswa1.tampilkan_informasi();
        
    }
   
}


// 1.	Name two characteristics of a class or object! 
// 2.	Pay attention to the Mahasiswa class in Practicum 1, how many attributes do the Student class have? Mention what the attributes are! 
// 3.	How many methods does the class have? Mention what the methods are! 
// 4.	Pay attention to  the method updateIpk contained in  the Mahasiswa class. Modify the content of the method so that the GPA entered is valid, namely first checking whether the GPA entered is in the range of 0.0 to 4.0 (0.0 <= GPA <= 4.0). If the GPA is not in that range, the message is issued: "GPA is invalid. Must be between 0.0 and 4.0". 
// 5.	Explain how  the nilaiKinerja() method  works in evaluating student performance, what criteria are used to determine the performance value, and what is returned by the nilaiKinerja()  method? 
