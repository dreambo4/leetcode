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
        HashMap<Integer, ArrayList<Integer>> table = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            ArrayList<Integer> list;
            if(!table.containsKey(num)) {
                list = new ArrayList<>();
            } else {
                list = table.get(num);
            }
            list.add(i);
            table.put(num, list);
        }

        for (Map.Entry<Integer, ArrayList<Integer>> entry : table.entrySet()) {
            int firstNum = entry.getKey();
            int secondNum = target - firstNum;

            if (!table.containsKey(secondNum)) continue;
            
            if (secondNum == firstNum) {
                return new int[]{entry.getValue().get(0), entry.getValue().get(1)};
            } else {
                return new int[]{entry.getValue().get(0), table.get(secondNum).get(0)};
            }
        }
    
        return new int[]{};
    }
}
// @lc code=end

