
class Solution {
    // Function to find the smallest positive number missing from the array.
    public int missingNumber(int[] nums) {
        // Your code here
        int n = nums.length;
        Arrays.sort(nums);
        int i =1;
        while (i<= n+1) {
            if (!contains(nums,i)) return i;
            i++;
        }
        return i+1;
    }
    public static boolean contains(int[] arr, int num) {
        int res = Arrays.binarySearch(arr, num);
        if (res>=0) return true;
        else return false;
    }
}
