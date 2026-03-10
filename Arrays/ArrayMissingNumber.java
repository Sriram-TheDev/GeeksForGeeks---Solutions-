class Solution {
    int missingNum(int arr[]) {

        int size = arr.length + 1;   

        int expectedSum = size * (size + 1) / 2;
        int actualSum = 0;

        for (int i = 0; i < arr.length; i++) {
            actualSum = actualSum + arr[i];
        }

        int missingNumber = expectedSum - actualSum;

        return missingNumber;
    }
}