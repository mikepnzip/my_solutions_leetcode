class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);

        int ans = 1;

        for(int i : nums){
            if(i > 0 && i == ans){
                ans++;
            }else if(i > ans){
                return ans;
            }
        }
        return ans;
    }
}
