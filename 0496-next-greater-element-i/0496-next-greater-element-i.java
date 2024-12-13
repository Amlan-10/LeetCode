class Solution {
    static int findIndex(int []a,int key){
        int n=a.length;
        int ans=-1;
        for(int i=0;i<n;i++){
            if(a[i]==key){
                ans=i;
            }
        }
        return ans;
    }
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int [] arr=new int[n];
        int [] ans=new int[m];
        Stack<Integer> st=new Stack<>();
        st.push(nums2[n-1]);
        arr[n-1]=-1;
        for(int i=n-2;i>=0;i--){
            while(!st.isEmpty() && st.peek()<=nums2[i]){
                st.pop();
            }
            if(!st.isEmpty()){
                arr[i]=st.peek();
            }else{
                arr[i]=-1;
            }
            st.push(nums2[i]);
        }
        for(int i=0;i<nums1.length;i++){
            int index=findIndex(nums2,nums1[i]);
            ans[i]=arr[index];
        }
        return ans;
    }
}