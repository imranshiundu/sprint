package sprint;

public class GCDRecursive {
    public int gcd(int a, int b) {
        if (a == 0 && b == 0) {
            return 0;
        }
        a = Math.abs(a);
        b = Math.abs(b);
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
