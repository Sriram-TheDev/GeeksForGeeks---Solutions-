import java.util.*;

class Solution {

    static ArrayList<Integer> subarraySum(int[] numbers, int target) {

        ArrayList<Integer> result = new ArrayList<>();

        for (int start = 0; start < numbers.length; start++) {

            int currentSum = 0;

            for (int end = start; end < numbers.length; end++) {

                currentSum = currentSum + numbers[end];

                if (currentSum == target) {
                    result.add(start + 1);  
                    result.add(end + 1);   
                    return result;
                }
            }
        }

        result.add(-1);
        return result;
    }
}