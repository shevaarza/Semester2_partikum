public class MataKuliahMain {

    public static void main(String[] args) {

        // Create first object using default constructor
        MataKuliah mk1 = new MataKuliah();
        mk1.kodeMK = "PRG1";
        mk1.nama = "Object Oriented Programming";
        mk1.sks = 3;
        mk1.jumlahJam = 6;

        // Create second object using parameterized constructor
        MataKuliah mk2 = new MataKuliah("MAT1", "Discrete Mathematics", 2, 4);

        // Display initial data
        System.out.println("===== COURSE DATA 1 =====");
        mk1.displayInformasi();

        System.out.println("===== COURSE DATA 2 =====");
        mk2.displayInformasi();

        // Testing updates on mk1
        System.out.println("===== UPDATING COURSE 1 =====");
        mk1.changeSKS(4);
        mk1.addHours(2);
        mk1.reduceHours(3);

        // Display updated data
        System.out.println("===== COURSE 1 AFTER UPDATE =====");
        mk1.displayInformasi();
    }
}