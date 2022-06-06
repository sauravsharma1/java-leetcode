class Solution {
    int[][] memo;
    public int minimumTotal(List<List<Integer>> triangle) {
        int size=triangle.get(triangle.size()-1).size();
        memo=new int[size][size];
        for(int[] m:memo){
            Arrays.fill(m,Integer.MAX_VALUE);
        }
        
        return minsum(triangle,0,0,size);
        
    }
    
    private int minsum(List<List<Integer>> triangle,int i,int j,int size){
        
        if(i>=size||j>=size){
            return 0;
        }
        
        if(memo[i][j]!=Integer.MAX_VALUE){
            return memo[i][j];
        }
        
        int down=triangle.get(i).get(j)+minsum(triangle,i+1,j,size);
        int diagonal=triangle.get(i).get(j) +minsum(triangle,i+1,j+1,size);
        
        return memo[i][j]=Math.min(down,diagonal);
        
    }
    
   
}