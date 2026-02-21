public class MataKuliah {
    
    
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

   
    public MataKuliah() {
        this.kodeMK = "-";
        this.nama = "Not Assigned";
        this.sks = 0;
        this.jumlahJam = 0;
    }

   
    public MataKuliah(String kodeMK, String nama, int sks, int jumlahJam) {
        this.kodeMK = kodeMK;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

   
    void displayInformasi() {
        System.out.println("===== COURSE INFORMATION =====");
        System.out.println("Course Code  : " + kodeMK);
        System.out.println("Course Name  : " + nama);
        System.out.println("Credits (SKS): " + sks);
        System.out.println("Total Hours  : " + jumlahJam);
        System.out.println("==============================\n");
    }

   
    void changeSKS(int newSKS) {
        if (newSKS > 0) {
            this.sks = newSKS;
            System.out.println("Credits successfully updated to: " + sks);
        } else {
            System.out.println("Invalid input! Credits must be greater than 0.");
        }
    }

    
    void addHours(int hours) {
        if (hours > 0) {
            this.jumlahJam += hours;
            System.out.println("Hours added successfully. Total hours now: " + jumlahJam);
        } else {
            System.out.println("Invalid input! Hours must be greater than 0.");
        }
    }

   
    void reduceHours(int hours) {
        if (hours > 0 && jumlahJam >= hours) {
            this.jumlahJam -= hours;
            System.out.println("Hours reduced successfully. Total hours now: " + jumlahJam);
        } else {
            System.out.println("Operation failed! Not enough hours available.");
        }
    }
}