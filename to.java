/**
 * to
 */
public class to {

    public static int  fi(int n,int[] a)
    {   int result=0;
        if(a[n]!=0) return a[n];
        if(n==1||n==2)
        result=1;

        result =fi(n-1,a)+fi(n-2, a);
        a[n]=result;
        return result;
    }

    public static int fii(int n)
    {
        if(n==1||n==2) return 1;
        int[] a=new int[n+1]; 
        a[1]=1;
        a[2]=1;
        for (int i = 3; i < a.length; i++) {
            a[i]=a[i-1]+a[i-2];
        }
        return a[n];
    }
}