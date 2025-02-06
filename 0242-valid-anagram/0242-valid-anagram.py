class Solution:
    def isAnagram(self, str1, str2):
        if len(str1) != len(str2):
            return False

        freq = [0] * 26
        for char in str1:
            freq[ord(char) - ord('a')] += 1
        for char in str2:
            freq[ord(char) - ord('a')] -= 1

        for i in range(26):
            if freq[i]!=0:
                return False
        return True