package JOBSHEET3;
public class Matakuliah {

    String code;
    String name;
    int sks;
    int jumlahjam;

    Matakuliah(){}

    Matakuliah(String code, String name, int sks , int jumlahJam){
        this.code = code;
        this.name = name;
        this.sks = sks;
        this.jumlahjam = jumlahJam;
    }

    void addData(String code, String name, int sks , int jumlahJam){
        this.code = code;
        this.name = name;
        this.sks = sks;
        this.jumlahjam = jumlahJam;
    }

    void printInfo(){
        System.out.println("Course Code : " + code);
        System.out.println("Course Name : " + name);
        System.out.println("SKS         : " + sks);
        System.out.println("Jumlah Jam  : " + jumlahjam);
    }
}