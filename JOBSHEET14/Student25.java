public class Student25 {
    String nim, nama, classNama;
    double ipk;

    public Student25() {

    }

    public Student25(String nim, String nama, String classNama, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.classNama = classNama;
        this.ipk = ipk;
    }

    void print() {
        System.out.println(nim + " - " + nama + " - " + classNama + " - " + ipk);
    }
}