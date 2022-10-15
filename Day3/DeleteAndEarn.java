package Day3;



public class DeleteAndEarn {
    public int deleteAndEarn(int[] nums) {
       int[] count=new int [10001];
       for (int i : nums) {
        count[i]+=i;
       }
       int prev=0;
       int cur=0,next=0;
       for (int i = 0; i < count.length; i++) {
        next=Math.max(prev+count[i], cur);
        prev=cur;
        cur=next;
       }


        return next;
    }
}
