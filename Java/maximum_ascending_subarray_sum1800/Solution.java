class Solution {
    public int maxAscendingSum(int[] nums) {
        int curr = nums[0];
        int arr = nums[0];
        for(int i = 1; i < nums.length; i++)
        {
            if(nums[i] > nums[i-1])
            {
                curr+=nums[i];
            }else
            {
                arr = Math.max(curr, arr);
                curr = nums[i];
            }
        }

        return Math.max(curr, arr);
    }
}
