package easy;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement_169 {

    /*
    Given an array nums of size n, return the majority element.

    The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

    Example 1:

    Input: nums = [3,2,3]
    Output: 3
    Example 2:

    Input: nums = [2,2,1,1,1,2,2]
    Output: 2

    Constraints:

    n == nums.length
    1 <= n <= 5 * 104
    -231 <= nums[i] <= 231 - 1


    Follow-up: Could you solve the problem in linear time and in O(1) space?

    ___________________________

    Steps:
    1)create map
    2) if map.containsKey -> put+1, else put 1
    3) check if counter>counterMajor -> resultInt=element.
     */

    public static void main(String[] args) {
        int[] array = {2, 2, 1, 1, 1, 2, 1};
        System.out.println(majorityElement(array));
    }

    public static int majorityElement(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        Map<Integer, Integer> counterMap = new HashMap<>();
        int resultInt = 0;
        int counterMajor = 0;
        for (int i : nums) {
            if (counterMap.containsKey(i)) {
                counterMap.put(i, counterMap.get(i) + 1);
                if (counterMap.get(i) > counterMajor) {
                    counterMajor = counterMap.get(i);
                    resultInt = i;
                }
            } else {
                counterMap.put(i, 1);
            }
        }
        return resultInt;
    }
}
