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
}