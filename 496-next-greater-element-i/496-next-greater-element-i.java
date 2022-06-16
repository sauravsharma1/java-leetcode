class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        int[] ngr=ngelement(nums2);
        
        int[] ans=new int[nums1.length];
        
        HashMap<Integer,Integer> map=new HashMap<>();
        
        for(int i=0;i<nums2.length;i++){
            map.put(nums2[i],ngr[i]);
        }
        
        for(int i=0;i<nums1.length;i++){
            ans[i]=map.get(nums1[i]);
        }
        
        return ans;
        
        
    }
    
    public static int[] ngelement(int nums[]){
        
        Stack<Integer> st=new Stack<>();
        
        int[] nge=new int[nums.length];
        
        for(int i=nums.length-1;i>=0;i--){
            
            
            
            while(st.size()>0&&st.peek()<nums[i]){
                st.pop();
            }
            
            nge[i]=st.size()>0?st.peek():-1;
            
            st.push(nums[i]);
            
        }
        
        return nge;
        
    }
    
}