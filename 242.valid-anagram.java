/*
 * @lc app=leetcode id=242 lang=java
 *"
 * [242] Valid Anagram
 */

// @lc code=start
class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        for (int i = 0; i < s.length(); i++) {
            String c = s.substring(i, i+1);
            if (!t.contains(c)) {
                return false;
            }
            t = t.replaceFirst(c, "");
        }

        return true;
    }
}
// @lc code=end

