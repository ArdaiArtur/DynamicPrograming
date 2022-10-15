import java.util.ArrayList;
import java.util.Collections;


public class LIS {
    public static int di(int[]nums)
    {
        if(nums == null || nums.length == 0) return 0;
        
        int n = nums.length;
        ArrayList<Integer> al = new ArrayList<>();
        
        al.add(nums[0]);
        for(int i = 1; i < n; i++){
            if(nums[i] > al.get(al.size() - 1))
                al.add(nums[i]);
            else {
                int index = Collections.binarySearch(al,nums[i]);
                if(index < 0){
                    index = Math.abs(index)-1;
                }
                al.set(index,nums[i]);
            }
        }
      
        return al.size();
    }

    }

