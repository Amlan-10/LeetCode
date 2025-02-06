class Solution(object):
    def removeOuterParentheses(self, s):
        stack=[]
        res=[]
        for char in s:
            if char=='(':
                if stack:
                    res.append(char)
                stack.append(char)
            else:
                stack.pop()
                if stack:
                    res.append(char)
            
        return ''.join(res)
