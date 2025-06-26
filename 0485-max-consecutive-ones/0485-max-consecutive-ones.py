class Solution:
    def findMaxConsecutiveOnes(self, nums: List[int]) -> int:
        n=len(nums)
        cnt=0
        max1=0
        for i in range(n):
            if nums[i]==1:
                cnt+=1
            else:
                cnt=0
            max1=max(max1,cnt)
        return max1
            