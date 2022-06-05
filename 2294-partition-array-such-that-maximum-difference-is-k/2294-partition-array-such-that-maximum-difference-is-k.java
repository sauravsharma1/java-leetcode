class Solution {
    public int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);
        
        int n = nums.length;
        int i=1;
        int min=nums[0];
        int count=1;
        while(i<n){
            if(nums[i]-min>k){
                min=nums[i];
                count++;
            }
            i++;
        }
        
        return count;
    }
}