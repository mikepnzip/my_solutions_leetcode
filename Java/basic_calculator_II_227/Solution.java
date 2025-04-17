class Solution {
    public int calculate(String s) {
        if(s == null || s.isEmpty())
            return 0;

        int currNum = 0, lastNum = 0, result = 0;
        char operator = '+';

        for(int i = 0; i < s.length(); i++)
        {
            char currChar = s.charAt(i);
            if(Character.isDigit(currChar))
                currNum = (currNum * 10) + (currChar - '0');
            if(!Character.isDigit(currChar) && !Character.isWhitespace(currChar) || i == s.length() - 1)
            {
                if(operator == '+')
                {
                    result += lastNum;
                    lastNum = currNum;
                }else if(operator == '-')
                {
                    result += lastNum;
                    lastNum = -currNum;
                }else if(operator == '*')
                    lastNum = lastNum * currNum;
                else if(operator == '/')
                    lastNum = lastNum / currNum;

                operator = currChar;
                currNum = 0;
            }
        }
        result += lastNum;
        return result;
    }
}
