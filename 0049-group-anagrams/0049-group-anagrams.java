class Solution {
    static String generate(String s) {
        int[] arr = new int[26];
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
        }
        StringBuilder new_Word = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            int freq = arr[i];
            while (freq > 0) {
                new_Word.append((char) (i + 'a'));
                freq--;
            }
        }
        return new_Word.toString();
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        Map<String, List<String>> mp = new HashMap<>();
        
        for (String word : strs) {
            // String new_Word = generate(word);
            char []c=word.toCharArray();
            Arrays.sort(c);
            String new_Word=new String(c);
            if (!mp.containsKey(new_Word)) {
                mp.put(new_Word, new ArrayList<>());
            }
            mp.get(new_Word).add(word);
        }

        ans.addAll(mp.values());
        return ans;
    }
}