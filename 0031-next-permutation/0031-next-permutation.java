class Solution {
    static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    public void nextPermutation(int[] a) {
        int n=a.length;
        int index = -1;
        for (int i = n - 2; i >= 0; i--) {
            if (a[i] < a[i + 1]) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            List<Integer> ans = new ArrayList<>();
            for (int num : a) {
                ans.add(num);
            }
            Collections.reverse(ans);
            for (int i = 0; i < ans.size(); i++)
            a[i] = ans.get(i);
        }
        else{

        for (int i = n - 1; i > index; i--) {
            if (a[i] > a[index]) {
                swap(a, i, index);
                break;
            }
        }

        List<Integer> ans = new ArrayList<>();
        for (int num : a) {
            ans.add(num);
        }
        List<Integer> sublist = ans.subList(index + 1, n);
        Collections.reverse(sublist);
        for (int i = 0; i < ans.size(); i++)
            a[i] = ans.get(i);
    }
}
}