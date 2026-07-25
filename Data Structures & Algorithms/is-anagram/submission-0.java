class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        HashMap<Character, Integer> hash = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(hash.containsKey(ch)){
                hash.put(ch, hash.get(ch) +1);
            }
            else{
                hash.put(ch, 1);
            }
        }
        
        for(char ch: t.toCharArray()){
            if(!hash.containsKey(ch)){
                return false;
            }
            hash.put(ch, hash.get(ch) - 1);

            if(hash.get(ch) == 0) hash.remove(ch);
        }

        if(hash.isEmpty()){
            return true;
        }

        return false;
    }
}
