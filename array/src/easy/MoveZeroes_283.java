package easy;

public class MoveZeroes_283 {

    /*
        Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

        Note that you must do this in-place without making a copy of the array.


        Example 1:

        Input: nums = [0,1,0,3,12]
        Output: [1,3,12,0,0]
        Example 2:

        Input: nums = [0]
        Output: [0]


        Constraints:

        1 <= nums.length <= 104
        -231 <= nums[i] <= 231 - 1

        _____________________________________

        Steps:
        1) go from array and put !=0 elements to left side
        2) right side full in 0
 */

    public static void main(String[] args) {
        int[] array = {1, 2, 0, 4, 0, 0};
        for (int i : moveZeroes(array)) {
            System.out.println(i);
        }
        ;
    }

    static int[] moveZeroes(int[] nums) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != 0) {
                nums[i++] = nums[j];
            }
        }
        for (; i < nums.length; i++) {
            nums[i] = 0;
        }
        return nums;
    }
}