package array;

public class PlusOne_66 {

    /*
    Given a non-empty array of decimal digits representing a non-negative integer, increment one to the integer.
    The digits are stored such that the most significant digit is at the head of the list, and each element in the array contains a single digit.
    You may assume the integer does not contain any leading zero, except the number 0 itself.

    Steps:
    1. loop from the end
    2. if element!=9 -> element++ return;
    3. else element=0;
    4. new int[] and int[0]=1 return

    */

    public static void main(String[] args) {
        for (int i : plusOne(new int[]{9, 9, 9})) {
            System.out.print(i);
        }
    }

    static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] resultArray = new int[digits.length + 1];
        resultArray[0] = 1;
        return resultArray;
    }
}