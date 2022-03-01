class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int ans[]=new int[2];
        
        ans[0]=findstart(nums,target);
        ans[1]=findend( nums, target);
        
        return ans;
        
    }
    
    public int findstart(int nums[],int target){
        int index=-1;
        
        int start=0,end=nums.length-1;
        
        while(start<=end){
            
            int mid=start+(end-start)/2;
            
            if(nums[mid]>=target){
                end=mid-1;
            }
            
            else{
            start=mid+1;
            }
            
            if(nums[mid]==target){
                index=mid;
            }
        
        }
        
        return index;
    } 
    
    public int findend(int nums[],int target){
        int index=-1;
        
        int start=0,end=nums.length-1;
        
        while(start<=end){
            
            int mid=start+(end-start)/2;
            
            if(nums[mid]<=target){
                start=mid+1;
            }
            
            else{
                end=mid-1;
            }
            
            if(nums[mid]==target){
                index=mid;
            }
            
        }
        
        return index;
    }
    
}