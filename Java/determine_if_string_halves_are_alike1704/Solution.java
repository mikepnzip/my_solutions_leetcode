class Solution {
    public boolean halvesAreAlike(String s) {
        s = s.toLowerCase();
        String a = s.substring(0, s.length() / 2);
        String b = s.substring(s.length() / 2);
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};

        int aCount = 0;
        int bCount = 0;

        for (char c : a.toCharArray()) {
            for (char vowel : vowels) {
                if (c == vowel) {
                    aCount++;
                    break;
                }
            }
        }

        for (char c : b.toCharArray()) {
            for (char vowel : vowels) {
                if (c == vowel) {
                    bCount++;
                    break;
                }
            }
        }

        return aCount == bCount;
    }
}
