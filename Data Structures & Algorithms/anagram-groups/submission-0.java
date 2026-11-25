class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap();
        for(String s : strs){
            char[] charArray = s.toCharArray();
            int[] count = new int[26];
            for(char c : charArray){
                count[c-'a']++;
            }
            StringBuilder sb = new StringBuilder();
            for(int i : count){
                sb.append('#');
                sb.append(i);
            }
            if(!map.containsKey(sb.toString()))
              map.put(sb.toString(),new ArrayList());

            map.get(sb.toString()).add(s);
        }

        return new ArrayList(map.values());
        
    }
}
