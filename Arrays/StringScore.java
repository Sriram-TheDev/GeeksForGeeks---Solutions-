class Solution {
    public int scoreOfString(String s) {

        char[] characters = s.toCharArray();
        int totalScore = 0;

        for (int i = 0; i < characters.length - 1; i++) {

            int difference = characters[i + 1] - characters[i];

            if (difference < 0) {
                difference = -difference;
            }

            totalScore = totalScore + difference;
        }

        return totalScore;
    }
}