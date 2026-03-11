class Solution {
    public int appendCharacters(String s, String t) {
        int t_pos = 0;
        for(int i = 0; i < s.length() && t_pos < t.length(); i++){
            if(s.charAt(i) == t.charAt(t_pos)){
                t_pos++;
            }
        }
        return t.length() - t_pos;
    }
}
