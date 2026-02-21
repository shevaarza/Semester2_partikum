import java.util.Scanner;

public class JadwalKuliah {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("===== PROGRAM MANAJEMEN JADWAL KULIAH =====");
        System.out.print("Masukkan jumlah jadwal kuliah: ");
        int n = input.nextInt();
        input.nextLine();

        String[][] schedule = new String[n][4];

        inputSchedule(schedule, input);
        displayAll(schedule);

        System.out.print("\nMasukkan hari yang ingin dicari: ");
        String day = input.nextLine();
        displayByDay(schedule, day);

        System.out.print("\nMasukkan nama mata kuliah yang ingin dicari: ");
        String course = input.nextLine();
        displayByCourse(schedule, course);

        input.close();
    }

    // a. Input lecture schedule data
    public static void inputSchedule(String[][] schedule, Scanner input) {
        for (int i = 0; i < schedule.length; i++) {
            System.out.println("\nJadwal ke-" + (i + 1));

            System.out.print("Nama Mata Kuliah : ");
            schedule[i][0] = input.nextLine();

            System.out.print("Ruangan          : ");
            schedule[i][1] = input.nextLine();

            System.out.print("Hari             : ");
            schedule[i][2] = input.nextLine();

            System.out.print("Jam              : ");
            schedule[i][3] = input.nextLine();
        }
    }

    // b. Display entire lecture schedule
    public static void displayAll(String[][] schedule) {
        System.out.println("\n================= SEMUA JADWAL =================");
        System.out.printf("%-20s %-20s %-15s %-15s\n",
                "Course Name", "Room", "Day", "Time");
        System.out.println("---------------------------------------------------------------");

        for (int i = 0; i < schedule.length; i++) {
            System.out.printf("%-20s %-20s %-15s %-15s\n",
                    schedule[i][0],
                    schedule[i][1],
                    schedule[i][2],
                    schedule[i][3]);
        }
    }

    // c. Display lecture schedules based on specific days
    public static void displayByDay(String[][] schedule, String day) {
        System.out.println("\nJadwal pada hari " + day + ":");

        boolean found = false;

        for (int i = 0; i < schedule.length; i++) {
            if (schedule[i][2].equalsIgnoreCase(day)) {
                System.out.printf("%-20s %-20s %-15s\n",
                        schedule[i][0],
                        schedule[i][1],
                        schedule[i][3]);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Tidak ada jadwal pada hari tersebut.");
        }
    }

    // d. Display lecture schedule by course name
    public static void displayByCourse(String[][] schedule, String course) {
        System.out.println("\nJadwal untuk mata kuliah " + course + ":");

        boolean found = false;

        for (int i = 0; i < schedule.length; i++) {
            if (schedule[i][0].equalsIgnoreCase(course)) {
                System.out.printf("Ruangan: %s | Hari: %s | Jam: %s\n",
                        schedule[i][1],
                        schedule[i][2],
                        schedule[i][3]);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Mata kuliah tidak ditemukan.");
        }
    }
}