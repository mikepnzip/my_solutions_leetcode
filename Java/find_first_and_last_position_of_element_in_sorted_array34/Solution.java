class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left = 0;
        int left1 = 0;
        int right = nums.length-1;
        int right1 = nums.length-1;
        int[] result = {-1, -1};

        while(left <= right)
        {
            int mid = left + (right - left)/2;
            if(nums[mid] == target)
            {
                result[0] = mid;
                right = mid - 1;
            }else if(nums[mid] < target)
            {
                left = mid + 1;
            }else
            {
                right = mid -1;
            }
        }

        while(left1 <= right1)
        {
            int mid1 = left1 + (right1 - left1)/2;
            if(nums[mid1] == target)
            {
                result[1] = mid1;
                left1 = mid1 + 1;
            }else if(nums[mid1] < target)
            {
                left1 = mid1 + 1;
            }else
            {
                right1 = mid1 -1;
            }
        }


        return result;
    }
}
