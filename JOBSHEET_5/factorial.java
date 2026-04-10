package JOBSHEET_5;

public class factorial {

    int factorialBF(int n){
        int facto = 1;

        for(int i = 1; i <= n; i++){
            facto = facto * i;
        }

        return facto;
    }

    int factorialDC(int n){
        if(n == 0 || n == 1){
            return 1;
        } else {
            return n * factorialDC(n - 1);
        }
    }
}