import java.util.Arrays;

class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        char[] firstWord = s.toCharArray();
        char[] secondWord = t.toCharArray();

        Arrays.sort(firstWord);
        Arrays.sort(secondWord);

        if (Arrays.equals(firstWord, secondWord)) {
            return true;
        }

        return false;
    }
}