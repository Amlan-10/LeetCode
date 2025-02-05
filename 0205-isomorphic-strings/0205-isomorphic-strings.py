class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if len(s)!=len(t):
            return False
        map={}
        mapped_values=set()

        for i in range(len(s)):
            ch1=s[i]
            ch2=t[i]
            if ch1 in map:
                if map[ch1]!=ch2:
                    return False
            else:
                if ch2 in mapped_values:
                    return False
                else:
                    map[ch1]=ch2
                    mapped_values.add(ch2)

        return True