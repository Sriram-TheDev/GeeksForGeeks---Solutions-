class Solution {
    public int getSecondLargest(int[] arr) {
        if(arr.length < 2){
            return -1;
        }

        int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }

        for(int i = 0; i < arr.length; i++){
            if(arr[i] != largest && arr[i] > secondLargest){
                secondLargest = arr[i];
            }
        }

        if(secondLargest == Integer.MIN_VALUE){
            return -1;
        }

        return secondLargest;
    }
}