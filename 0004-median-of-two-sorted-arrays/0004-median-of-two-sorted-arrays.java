class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int[] a = new int[m + n];
        int k = 0, i = 0, j = 0;
        while (i < n && j < m) {
            if (nums1[i] <= nums2[j]) {
                a[k] = nums1[i];
                i++;
                k++;
            } else {
                a[k] = nums2[j];
                j++;
                k++;
            }
        }
        while (i < n) {
            a[k++] = nums1[i++];
        }
        while (j < m) {
            a[k++] = nums2[j++];
        }
        int mid = (m + n) / 2;
        if ((m + n) % 2 != 0) {
            return (double) a[mid];
        } else {
            return (double) (a[mid] + a[mid - 1]) / 2;
        }
    }
}