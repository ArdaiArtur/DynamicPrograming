from hashlib import new
import math
from typing import Counter


class Solutin(object):
    def deletAndEarn(self,nums):
        count=[0] * (max(nums) + 1)
        for num in nums:
            count[num]+=num
        next=0
        prev=0
        cur=0
        for i in range(len(count)):
             next=max(prev+count[i],cur)
             prev=cur
             cur=next
        return next        

