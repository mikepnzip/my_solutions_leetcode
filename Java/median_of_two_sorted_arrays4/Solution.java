import java.util.Arrays;
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] nums = new int[nums1.length + nums2.length];
        double middle = 0;
        System.arraycopy(nums1, 0, nums, 0, nums1.length);
        System.arraycopy(nums2, 0, nums, nums1.length, nums2.length);
        Arrays.sort(nums);
        /*for(int i = 0; i<nums.length; i++){
            System.out.println(nums[i]);
        }*/
        int result = nums.length;
        if(result % 2 == 1)
        {
            return (double)nums[result / 2];
        }else
        {
            int mid1 = nums[result / 2 - 1];
            int mid2 = nums[result / 2];
            return ((double) mid1 + (double) mid2)/2.0;
        }

    }
}
