class Solution:
    def swap(self,nums:List[int],l:int,r=int)->None:
        nums[l],nums[r]=nums[r],nums[l]
    def moveZeroes(self, nums: List[int]) -> None:
        n=len(nums)
        l=0
        for r in range(n):
            if nums[r]!=0:
                self.swap(nums,l,r)
                l+=1
        
        