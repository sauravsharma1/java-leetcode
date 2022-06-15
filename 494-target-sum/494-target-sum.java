class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        Map<String,Integer> map=new HashMap<>();
        
        return find(nums.length-1,target,nums,map);
        
    }
    
    private int find(int n,int sum,int[] nums,Map<String,Integer> map){
        
        if(n==-1&&sum==0){
            return 1;
        }
        
        if(n<=-1){
            return 0;
        }
        
        if(map.containsKey(n+" "+sum)){
            return map.get(n+" "+sum);
        }
        
        int pickpos=find(n-1,sum-nums[n],nums,map);
        int pickneg=find(n-1,sum+nums[n],nums,map);
        
        map.put(n+" "+sum,pickpos+pickneg);
        
        return pickpos+pickneg;
        
    }
    
}