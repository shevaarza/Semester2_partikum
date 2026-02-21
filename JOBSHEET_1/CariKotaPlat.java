import java.util.Scanner;

public class CariKotaPlat {

  
    static char[] CODE = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};

    
    static char[][] KOTA = {
        {'B','A','N','T','E','N'},
        {'J','A','K','A','R','T','A'},
        {'B','A','N','D','U','N','G'},
        {'C','I','R','E','B','O','N'},
        {'B','O','G','O','R'},
        {'P','E','K','A','L','O','N','G','A','N'},
        {'S','E','M','A','R','A','N','G'},
        {'S','U','R','A','B','A','Y','A'},
        {'M','A','L','A','N','G'},
        {'T','E','G','A','L'}
    };

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("===== PROGRAM PENCARI KOTA BERDASARKAN KODE PLAT =====");
        System.out.print("Masukkan kode plat: ");
        char inputPlat = input.next().toUpperCase().charAt(0);

        int index = cariIndexKode(inputPlat);

        tampilkanHasil(index);

        input.close();
    }

    
    public static int cariIndexKode(char plat) {
        for (int i = 0; i < CODE.length; i++) {
            if (CODE[i] == plat) {
                return i;
            }
        }
        return -1;
    }

    
    public static void tampilkanHasil(int index) {
        if (index != -1) {
            System.out.print("Kota: ");
            for (char huruf : KOTA[index]) {
                System.out.print(huruf);
            }
            System.out.println();
        } else {
            System.out.println("Kode plat tidak ditemukan.");
        }
    }
}