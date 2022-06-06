class Solution {
    public int removeDuplicates(int[] nums) {
        int oin=0;
        int i=0;
        
        while(i<nums.length){
            int sind=i;
            
            while(i<nums.length-1&&nums[i]==nums[i+1]){
                i++;
                
            }
            int length=i-sind+1;
            int freq=Math.min(2,length);
            
            while(freq-->0){
                nums[oin]=nums[sind];
                oin++;
            }
            i++;
            
        }
        
        return oin;
        
    }
}