class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        ArrayList<Integer> res = new ArrayList<>();
        
        int start = 0, sum = 0;

        for(int end = 0; end < arr.length; end++){
            sum += arr[end];

            while(sum > target && start <= end){
                sum -= arr[start];
                start++;
            }

            if(sum == target){
                res.add(start + 1);
                res.add(end + 1);
                return res;
            }
        }

        res.add(-1);
        return res;
    }
}