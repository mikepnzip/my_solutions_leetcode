class Solution {
    public int compress(char[] chars) {
        if (chars.length == 1) {
            return 1;
        }

        int write = 0;
        int i = 0;

        while(i < chars.length){
            int count = 0;
            char current = chars[i];

            while(i < chars.length && current == chars[i]){
                count++;
                i++;
            }
            chars[write] = current;
            write++;

            if(count > 1){
                String countStr = String.valueOf(count);
                for(char c : countStr.toCharArray()){
                    chars[write] = c;
                    write++;
                }
            }
        }
        return write;
    }
}
