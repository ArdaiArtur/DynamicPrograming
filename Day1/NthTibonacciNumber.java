package Day1;

public class NthTibonacciNumber {
    public int tribonacci(int n) {
        if(n==1||n==2) return 1;
        int t0=0,t1=1,t2=1;
        int ans=1;
        for (int i = 2; i < n; i++) {
            ans=t0+t1+t2;
            t0=t1;
            t1=t2;
            t2=ans;
        }
        return ans;

    }
}
