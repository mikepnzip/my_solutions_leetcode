class Solution {
    public void reverseString(char[] s) {
        char[] l = new char[s.length];
        for(int i = 0; i < s.length; i++){
            l[i] = s[s.length - i - 1];
        }
        for(int i = 0; i < s.length; i++){
            s[i] = l[i];
        }
    }
}
