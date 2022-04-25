import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> table = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int firstNum = nums[i];
            int secondNum = target - firstNum;

            if(!table.containsKey(secondNum)) {
                table.put(firstNum, i);
            } else {
                return new int[]{i, table.get(secondNum)};
            }
        }

        return new int[]{};
    }
}
// @lc code=end

