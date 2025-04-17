class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1 || numRows >= s.length()){
            return s;
        }

        int cycleLength = 2 * numRows - 2;
        StringBuilder[] rows = new StringBuilder[numRows];

        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }

        for (int i = 0; i < s.length(); i++) {
            int pos = i % cycleLength;
            int targetRow = pos < numRows ? pos : cycleLength - pos;
            rows[targetRow].append(s.charAt(i));
        }

        StringBuilder result = new StringBuilder();
        for (StringBuilder row : rows) {
            result.append(row);
        }

        return result.toString();
    }
}
