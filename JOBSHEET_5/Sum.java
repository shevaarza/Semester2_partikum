package JOBSHEET_5;

public class Sum {
public int ele;
    public double[] profits;

    // Constructor untuk inisialisasi jumlah elemen
    public Sum(int element) {
        this.ele = element;
        this.profits = new double[element];
    }

    // Algoritma Brute Force (BF)
    public double totalBF() {
        double total = 0;
        for (int i = 0; i < ele; i++) {
            total += profits[i];
        }
        return total;
    }

    // Algoritma Divide and Conquer (DC)
    public double totalDC(double[] arr, int l, int r) {
        if (l == r) {
            return arr[l];
        } else if (l < r) {
            int mid = (l + r) / 2;
            double lsum = totalDC(arr, l, mid);
            double rsum = totalDC(arr, mid + 1, r);
            return lsum + rsum;
        }
        return 0;
    }
}

