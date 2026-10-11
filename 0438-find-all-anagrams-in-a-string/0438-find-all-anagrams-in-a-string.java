class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int ns = s.length();
        int np = p.length();
        List<Integer> ans = new ArrayList<>();
        if (ns < np) return ans;
        int[] sCount = new int[26];
        int[] pCount = new int[26];
        for (int i = 0; i < np; i++) {
            sCount[s.charAt(i) - 'a'] += 1;
            pCount[p.charAt(i) - 'a'] += 1;
        }
        if (Arrays.equals(sCount, pCount)) {
            ans.add(0);
        }
        for (int i = 0; i < ns - np; i++) {
            sCount[s.charAt(i) - 'a'] -= 1;
            sCount[s.charAt(i + np) - 'a'] += 1;
            if (Arrays.equals(sCount, pCount)) {
                ans.add(i + 1);
            } 
        }
        return ans;
    }
}