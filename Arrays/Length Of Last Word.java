class Solution {
    public int lengthOfLastWord(String s) {

        //simple way:
       /* String s_arr[]=s.split(" ");
        return s_arr[s_arr.length-1].length();*/

        //optimal way:
        int pos = 0;
        int len = s.length() - 1;

        for(int i = len; i >= 0; i--){
            if(s.charAt(i) == ' ' && pos == 0){
                continue;     
            }
            if(s.charAt(i) != ' '){
                pos++;        
            }else{
                break;        
            }
        }
        return pos;
    }
}
