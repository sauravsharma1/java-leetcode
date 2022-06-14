class Solution {
    public List<List<Integer>> getAncestors(int n, int[][] edges) {
        

        
        List<List<Integer>> ans=new ArrayList<>();
        
        
        
        List<List<Integer>> child=new ArrayList<>();
        
        for(int i=0;i<n;i++){
            ans.add(new ArrayList<>());
            child.add(new ArrayList<>());
        }
        
        if(edges.length==0){
            return ans;
        }
        
        for(int[] e:edges){
            child.get(e[0]).add(e[1]);
        }
        
        for(int i=0;i<n;i++){
            dfs(i,i,ans,child);
        }
        
        return ans;
        
    }
    
    
    private void dfs(int x,int curr,List<List<Integer>> ans,List<List<Integer>> child){
        
        for(int ch:child.get(curr)){
            if(ans.get(ch).size()==0||ans.get(ch).get(ans.get(ch).size()-1)!=x){
                ans.get(ch).add(x);
                dfs(x,ch,ans,child);
            }
        }
        
    }
    
}