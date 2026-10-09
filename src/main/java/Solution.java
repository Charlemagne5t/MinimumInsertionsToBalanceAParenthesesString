class Solution {
    public int minInsertions(String s) {
        int c = 0;
        int res = 0;

        for (int i = 0; i < s.length(); i++) {
            char next = i == s.length() - 1 ? '*' : s.charAt(i + 1);
            char cur = s.charAt(i);
            if (cur == '(') {
                c += 2;
            } else {
                if (next == ')') {
                    i++;
                    c -= 2;
                    if (c < 0) {
                        res++;
                        c += 2;
                    }
                } else {
                    res++;
                    c -= 2;
                    if (c < 0) {
                        res++;
                        c += 2;
                    }
                }

            }
        }

        return res + c;
    }
}