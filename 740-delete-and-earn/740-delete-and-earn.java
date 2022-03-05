class Solution {
    public int deleteAndEarn(int[] nums) {
        
        int count[]=new int[10001];
        int inc=0;
        int exc=0;
        for(int val:nums){
            count[val]++;
        }
        
        for(int i=0;i<=10000;i++){
            int ni=exc+(i*count[i]);
            int ne=Math.max(inc,exc);
            
            inc=ni;
            exc=ne;
            
        }
        
        return Math.max(inc,exc);
        
    }
}