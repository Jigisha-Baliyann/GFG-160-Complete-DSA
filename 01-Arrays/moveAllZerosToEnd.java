// Brute Force Approach

class Solution {
    void pushZerosToEnd(int[] arr) {
        // code class Solution {
   
        int n = arr.length;
        ArrayList<Integer> list = new ArrayList<>();
        int count = 0;
        for (int i=0; i<n; i++) {
            if (arr[i] !=0 ) list.add(arr[i]);
            else count++;
        }
        for (int i=0; i<count; i++) {
            list.add(0);
        }
        for (int i=0; i<n; i++) {
            arr[i] = list.get(i);
        }
    
    }
}
