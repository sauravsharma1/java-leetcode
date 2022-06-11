class Solution {
    public long maximumImportance(int n, int[][] roads) {
        long ans=0;
        
        long[] edge=new long[n];
        
        for(int[] road:roads){
            edge[road[0]]++;
            edge[road[1]]++;
        }
        
        Arrays.sort(edge);
        
        for(int i=n-1;i>=0;i--){
            ans+= (long)edge[i]*(long)(i+1);
        }
        
        return ans;
        
    }
}