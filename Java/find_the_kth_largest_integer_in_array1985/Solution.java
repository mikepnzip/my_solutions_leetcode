import java.math.BigInteger;
import java.util.Arrays;

class Solution {
    public String kthLargestNumber(String[] nums, int k) {
        BigInteger[] bigIntegerArray = new BigInteger[nums.length];
        for (int i = 0; i < nums.length; i++) 
        {
            bigIntegerArray[i] = new BigInteger(nums[i]);
        }
        Arrays.sort(bigIntegerArray);
        /*for(int i = 0; i < intArray.length; i++)
        {
            System.out.println(intArray[i]);
        }
        System.out.println("ARR " + intArray[intArray.length-k]);*/
        return bigIntegerArray[bigIntegerArray.length - k].toString();
    }
}
