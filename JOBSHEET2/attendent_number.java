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
        ipk = update_ipk;
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
   
}


