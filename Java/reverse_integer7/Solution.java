class Solution {
    public int reverse(int x) {
        StringBuilder sb = new StringBuilder();
        sb.append(x);
        int num = 0;
        if(x == 0){
            return 0;
        }
        sb.reverse();
        if(sb.charAt(sb.length() - 1) == '0'){
            sb.deleteCharAt(sb.length() - 1);
        }
        if(x < 0){
            sb.insert(0, '-');
            sb.deleteCharAt(sb.length() - 1);
        }
        String s = sb.toString();
        try{
            num = Integer.parseInt(s);
        }catch(NumberFormatException e){
            return 0;
        }
        return num;
    }
}
