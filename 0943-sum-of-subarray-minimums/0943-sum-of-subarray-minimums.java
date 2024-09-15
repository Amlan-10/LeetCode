class Solution {
    static int[] getNSL(int[] a, int n) {
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && a[i] < a[st.peek()]) {
                st.pop();
            }
            if (st.isEmpty()) {
                ans[i] = -1;
            } else {
                ans[i] = st.peek();
            }
            st.push(i);
        }
        return ans;
    }

    static int[] getNSR(int[] a, int n) {
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && a[i] <= a[st.peek()]) {
                st.pop();
            }
            if (st.isEmpty()) {
                ans[i] = n;
            } else {
                ans[i] = st.peek();
            }
            st.push(i);
        }
        return ans;
    }

    public int sumSubarrayMins(int[] arr) {
        int n = arr.length;
        long sum = 0; // Change to long
        int[] NSL = getNSL(arr, n);
        int[] NSR = getNSR(arr, n);
        int M = 1000000007;

        for (int i = 0; i < n; i++) {
            int ls = i - NSL[i];
            int rs = NSR[i] - i;
            long totalways = (long) ls * rs * arr[i]; 
            sum = (sum + totalways) % M;
        }

        return (int) sum; 
    }
}
