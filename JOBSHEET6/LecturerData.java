public class LecturerData {
    Lecturer[] lecturerData = new Lecturer[10];
    int idx = 0;

    public void add(Lecturer dsn) {
        if (idx < lecturerData.length) {
            lecturerData[idx] = dsn;
            idx++;
            System.out.println("Data added successfully!");
        } else {
            System.out.println("Array is full!");
        }
    }

    public void print() {
        if (idx == 0) {
            System.out.println("No data available.");
            return;
        }
        System.out.println("------------------------------------------------------------");
        System.out.printf("| %-10s | %-20s | %-10s | %-5s |\n", "ID", "Name", "Gender", "Age");
        System.out.println("------------------------------------------------------------");
        for (int i = 0; i < idx; i++) {
            lecturerData[i].print();
        }
        System.out.println("------------------------------------------------------------");
    }

    // Bubble Sort: Youngest to Oldest
    public void sortingASC() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (lecturerData[j].age > lecturerData[j + 1].age) {
                    Lecturer temp = lecturerData[j];
                    lecturerData[j] = lecturerData[j + 1];
                    lecturerData[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted Ascending (Youngest to Oldest) using Bubble Sort.");
    }

    // Selection Sort: Oldest to Youngest
    public void sortingDSC() {
        for (int i = 0; i < idx - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < idx; j++) {
                if (lecturerData[j].age > lecturerData[maxIdx].age) {
                    maxIdx = j;
                }
            }
            Lecturer temp = lecturerData[maxIdx];
            lecturerData[maxIdx] = lecturerData[i];
            lecturerData[i] = temp;
        }
        System.out.println("Sorted Descending (Oldest to Youngest) using Selection Sort.");
    }
}