class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        Set<List<Integer>> res=new HashSet<>();
        
        combinationhelper(res,k,n,new HashSet<>());
        
        return new ArrayList<>(res);
        
    }
    
    private void combinationhelper(Set<List<Integer>> res,int k,int n,Set<Integer> curr){
        
        if(k==0){
            if(n==0){
                res.add(new ArrayList<>(curr));
                return;
            }
            else{
                return;
            }
        }
        
        if(k<0){
            return;
        }
        
        for(int i=1;i<=9;i++){
            if(!curr.contains(i)){
                curr.add(i);
                combinationhelper(res,k-1,n-i,curr);
                curr.remove(i);
                }
        }
        
    }
    
}