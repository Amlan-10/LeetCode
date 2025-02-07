class Solution:
    def maxDepth(self, s: str) -> int:
        open=0
        max_val=float('-inf')
        for c in s:
            if c=='(':
                open+=1
            elif c==')':
                open-=1
            max_val=max(max_val,open)
        return max_val