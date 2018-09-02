public class Calculatir {

    public int summ (int a, int b) {
        return a + b;
    }

    public int diff (int a, int b) {
        return a - b;
    }

    public double div (int a, int b) {
        return (double)a / b;
    }

    public int mul (int a, int b) {
        return a * b;
    }

    public double sqrt (double a) {
        return Math.sqrt(a);
    }

    public int abs (int a) {
        if (a >= 0) {
            return a;
        } else {
            return -a;
        }
    }

    public int pow (int a, int stepen) {
        for (int i = 0; i < stepen - 1; i++) {
            a *= a;
        }
        return a;
    }


    public int factorial (int a) {
        if (a <= 0) {
            return 1;
        }
        for (int i = a - 1; i > 0; i--) {
            a *= i;
        }
        return a;
    }
}
