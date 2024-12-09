package weak;

public class weakClass {

    // weakMethod1
    public int weakMethod1(int a, int b) {
        int result = 0;
        if (a > 0) {
            result = 10 / (b - 2);  // Potential division by zero
        } else {
            result = a + b;
        }
        return result;
    }

    // weakMethod2
    public int weakMethod2(int x, int y) {
        int result = 0;
        if (x > y) {
            result = x + y;
        } else {
            result = 100 / (x - y);  // Potential division by zero
        }
        return result;
    }

    // weakMethod3
    public int weakMethod3(int p, int q) {
        int result = 0;
        if (p > 0 && q > 0) {
            if (p == q) {
                result = 50 / (p - q);  // Division by zero when p == q
            } else {
                result = p + q;
            }
        } else {
            result = p - q;
        }
        return result;
    }

    // weakMethod4
    public int weakMethod4(int m, int n) {
        int result = 0;
        if (m > 0) {
            if (n > 0) {
                result = m + n;
            } else {
                result = m - n;
            }
        } else {
            if (n != 0) {
                result = m / n;
            } else {
                result = 100 / n;  // Division by zero, but unreachable
            }
        }
        return result;
    }
}