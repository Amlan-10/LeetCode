class Solution(object):
    def beautySum(self, s):
        n=len(s)
        total_beauty=0

        for i in range(n):
            freq=[0]*26
            for j in range(i,n):
                freq[ord(s[j])-ord('a')]+=1
                max_value = -(2**31)  
                min_value = (2**31)-1
                for k in range(26):
                    if freq[k]>0:
                        max_value=max(max_value,freq[k])
                        min_value=min(min_value,freq[k])
                total_beauty+=max_value-min_value

        return total_beauty