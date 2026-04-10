public class SearchStudent {

    Student[] liststd;
    int idx;

    public SearchStudent(int size) {
        liststd = new Student[size];
    }

    public void add(Student std) {
        if (idx < liststd.length) {
            liststd[idx] = std;
            idx++;
        }
    }

    public void display() {
        for (int i = 0; i < idx; i++) {
            liststd[i].display();
            System.out.println("----------------------");
        }
    }

    public int findSeqSearch(String search) {
        for (int i = 0; i < idx; i++) {
            if (liststd[i].id.equals(search)) {
                return i;
            }
        }
        return -1;
    }

    public void showPosition(String x, int pos) {
        if (pos != -1) {
            System.out.println("Data found at index " + pos);
        } else {
            System.out.println("Data not found");
        }
    }

    public void showData(int pos) {
        if (pos != -1) {
            liststd[pos].display();
        }
    }

    // SORT
    public void sortByNIM() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (liststd[j].id.compareTo(liststd[j + 1].id) > 0) {
                    Student temp = liststd[j];
                    liststd[j] = liststd[j + 1];
                    liststd[j + 1] = temp;
                }
            }
        }
    }

    // BINARY SEARCH
    public int FindBinarySearch(String cari, int left, int right) {
        if (right >= left) {
            int mid = (left + right) / 2;

            if (liststd[mid].id.equals(cari)) {
                return mid;
            } else if (liststd[mid].id.compareTo(cari) > 0) {
                return FindBinarySearch(cari, left, mid - 1);
            } else {
                return FindBinarySearch(cari, mid + 1, right);
            }
        }
        return -1;
    }
}