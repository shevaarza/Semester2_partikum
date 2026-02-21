public class RoyalGarden {

    // Konstanta
    static final int BATAS_SANGAT_BAIK = 1500000;

    static int[][] stokBunga = {
        {10, 5, 15, 7},
        {6, 11, 9, 12},
        {2, 10, 10, 5},
        {5, 7, 12, 9}
    };

    // Nama bunga
    static String[] namaBunga = {
        "Aglonema", "Yam", "Alocasia", "Rose"
    };

    // Harga bunga (urut sesuai kolom stok)
    static int[] hargaBunga = {
        75000, 50000, 60000, 10000
    };

    public static void main(String[] args) {
        tampilkanHeader();
        tampilkanPendapatanDanStatus();
        tampilkanFooter();
    }

    // Menampilkan header
    public static void tampilkanHeader() {
        System.out.println("==================================================");
        System.out.println("      LAPORAN PENDAPATAN CABANG ROYAL GARDEN     ");
        System.out.println("==================================================");
    }

    // Menampilkan footer
    public static void tampilkanFooter() {
        System.out.println("==================================================");
    }

    // Menghitung total pendapatan 1 cabang
    public static int hitungPendapatan(int[] stokCabang) {
        int total = 0;
        for (int i = 0; i < stokCabang.length; i++) {
            total += stokCabang[i] * hargaBunga[i];
        }
        return total;
    }

    // Menentukan status cabang
    public static String tentukanStatus(int totalIncome) {
        return (totalIncome > BATAS_SANGAT_BAIK) 
                ? "Very Good" 
                : "Need Evaluation";
    }

    // Menampilkan laporan tiap cabang
    public static void tampilkanPendapatanDanStatus() {
        for (int i = 0; i < stokBunga.length; i++) {

            int totalIncome = hitungPendapatan(stokBunga[i]);
            String status = tentukanStatus(totalIncome);

            System.out.printf("RoyalGarden %d | Pendapatan: IDR %,d | Status: %s\n",
                    (i + 1), totalIncome, status);
        }
    }
}