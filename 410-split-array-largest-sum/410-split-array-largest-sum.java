class Solution {
    public int splitArray(int[] nums, int m) {
        int maxNo=0;
        long total=0;
        
        for(int el:nums){
            maxNo=Math.max(el,maxNo);
            total+=el;
        }
        
        long low=maxNo;
        
        long high=total;
        
        while(low<high){
            
            long mid=(low)+(high-low)/2;
            
            if(validDivision(mid,nums,m)){
                high=mid;
            }
            
            else{
                low=mid+1;
            }
            
            
        }
        
        return (int)low;
        
    }
    
    public boolean validDivision(long mid,int nums[],int m){
        
        int subsetscount=1;
        
        long totalsum=0;
        
        for(int num:nums){
            totalsum+=num;
            
            if(totalsum>mid){
                totalsum=0;
                totalsum+=num;
                
                subsetscount++;
                
                if(subsetscount>m){
                    return false;
                }
                
            }
            
        }
        return true;
    }
    
}