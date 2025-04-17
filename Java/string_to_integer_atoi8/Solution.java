class Solution {
    public int myAtoi(String s) {
        if(s == null || s.length() == 0)
            return 0;
        int index = 0;
        int n = s.length();
        int sign = 1;
        long result = 0;

        while(index < n && s.charAt(index) == ' '){
            index++;
        }

        if(index >=n)
            return 0;
        if(s.charAt(index) == '+' || s.charAt(index) == '-'){
            sign = (s.charAt(index) == '-') ? -1 : 1;
            index++;
        }

        while(index < n && Character.isDigit(s.charAt(index))){
            result = result * 10 + (s.charAt(index) - '0');

            if(result > Integer.MAX_VALUE){
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            index++;
        }

        return (int) (sign * result);

    }
}
