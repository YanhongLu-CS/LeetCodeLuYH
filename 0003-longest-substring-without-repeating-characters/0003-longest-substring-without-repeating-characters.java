class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        if (n <= 1) return n;
        int l = 0;
        int r = 0;
        int ans = 1;
        Set<Character> record = new HashSet<>();
        while (r < n) {
            if (!record.contains(s.charAt(r))) {
                record.add(s.charAt(r));
                r += 1;
                ans = Math.max(ans, r - l);
            }
            else {
                ans = Math.max(ans, r - l);
                record.remove(s.charAt(l));
                l += 1;
            }
        }
        return ans;
    }
}