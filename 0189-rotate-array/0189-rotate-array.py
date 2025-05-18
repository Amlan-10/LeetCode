class Solution:
    def rotate(self, nums: List[int], k: int) -> None:
        
        n=len(nums)
        k=k%n

        def reverse(start,end):
            while(start<=end):
                temp=nums[start]
                nums[start]=nums[end]
                nums[end]=temp
                start+=1
                end-=1
        reverse(0,n-k-1)
        reverse(n-k,n-1)
        reverse(0,n-1)