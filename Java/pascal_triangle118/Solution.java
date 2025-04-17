class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if(numRows == 0)
            return result;

        for(int i = 0; i < numRows; i++){
            List<Integer> newRow = new ArrayList<>();

            for(int j = 0; j <= i; j++){
                if(j == 0 || j == i){
                    newRow.add(1);
                }else{
                    List<Integer> prevRow = result.get(i - 1);
                    newRow.add(prevRow.get(j - 1) + prevRow.get(j));
                }
            }
            result.add(newRow);
        }
        return result;
    }
}
