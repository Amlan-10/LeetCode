class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> map=new HashMap<>();
        PriorityQueue<Character> pq=new PriorityQueue<>((x,y) ->map.get(y)-map.get(x));
        
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        
        pq.addAll(map.keySet());
        StringBuilder result=new StringBuilder();
        while(!pq.isEmpty()){
            char current=pq.remove();
            for(int i=0;i<map.get(current);i++){
                result.append(current);
            }
        }
        return result.toString();
    }
}