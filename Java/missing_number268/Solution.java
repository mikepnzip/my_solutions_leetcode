class Solution {
    public int missingNumber(int[] nums) {
        int arr = nums.length;
        for(int i = 0; i < nums.length; i++){
            arr += i - nums[i];
            System.out.println(arr);
        }
        return arr;
    }
}
