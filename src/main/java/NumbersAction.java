public class NumbersAction {
    public int sum(int n) {
        int result = 0;
        for(int i = 1; i <= n; i ++)
            result += i;
        return result;
    }

    public int factorial(int f) {
        if(f <= 1) {
            return 1;
        } else {
            return f * factorial(f - 1);
        }
    }

    public double gProgression(int a, int r, int n){
        double sum = 0;
        if (n == 1){
            return a;
        } else if (r < 0) {
            sum = (a * (Math.pow(r, n) - 1)) / (r - 1);
        } else if (r > 0) {
            sum = (a * (1 - Math.pow(r, n))) / (1 - r);
        }
        return sum;
    }
}
