package JOBSHEET_5;

public class power {

 public int baseNumber;
    public int exponent;

    public power(int base, int exp) {
        this.baseNumber = base;
        this.exponent = exp;
    }

    public int powerBF(int a, int n) {
        int result = 1;
        for (int i = 0; i < n; i++) {
            result *= a;
        }
        return result;
    }

    public int powerDC(int a, int n) {
        if (n == 0) return 1;
        if (n == 1) return a;

        int temp = powerDC(a, n / 2);
        if (n % 2 == 0) {
            return temp * temp;
        } else {
            return temp * temp * a;
        }
    }
}
