import java.util.Hashtable;

class Solution {
    public int subarraySum(int[] nums, int k) {
        Hashtable<Integer, Integer> arr = new Hashtable<>();
        arr.put(0,1);
        int[] prefix_nums = new int[nums.length];
        int count = 0;
        prefix_nums[0] = nums[0];

        for(int i = 1; i < nums.length; i++){
            prefix_nums[i] = (prefix_nums[i - 1] + nums[i]);
        }

        for(int i = 0; i < prefix_nums.length; i++){
            if(arr.containsKey(prefix_nums[i] - k)){
                count += arr.get(prefix_nums[i] - k);
            }

            if(arr.containsKey(prefix_nums[i])){
                arr.put(prefix_nums[i], arr.get(prefix_nums[i]) + 1);
            }else{
                arr.put(prefix_nums[i], 1);
            }
        }
        return count;
    }
}
