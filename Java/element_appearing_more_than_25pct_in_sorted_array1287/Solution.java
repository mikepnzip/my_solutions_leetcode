class Solution {
    public int findSpecialInteger(int[] arr) {
        int n = arr.length;
        int quart = n / 4;

        for(int i = 0; i < n - quart; i++)
        {
            if(arr[i] == arr[i + quart])
            {
                return arr[i];
            }
        }
        return -1;
    }
}
