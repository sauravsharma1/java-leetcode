class Solution {
    public int orangesRotting(int[][] grid) {
        
        if(grid.length==0){
            return 0;
        }
        int count_oranges=0;
        
        Queue<int[]> queue=new LinkedList<>();
        
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                
                if(grid[i][j]==2){
                    queue.offer(new int[]{i,j});    
                }
                if(grid[i][j]!=0){
                    count_oranges++;
                }
                
                
            }
        }
        
        if(count_oranges==0){
            return 0;
        }
        
        int[] dx={1,-1,0,0};
        int[] dy={0,0,1,-1};
        
        int countmin=0,count=0;
        
        while(!queue.isEmpty()){
            int size=queue.size();
            count+=size;
            for(int i=0;i<size;i++){
                int[] orange=queue.poll();
                
                for(int j=0;j<4;j++){
                    
                    int newx=orange[0]+dx[j];
                    int newy=orange[1]+dy[j];
                    
                    if(newx<0||newy<0||newx>=grid.length||newy>=grid[0].length||grid[newx][newy]==0||grid[newx][newy]==2){
                        continue;
                    }
                    
                    grid[newx][newy]=2;
                    
                    queue.offer(new int[]{newx,newy});
                    
                    
                    
                }
                
            }
            
            if(queue.size()!=0){
                countmin++;
            }
            
            
            
        }
        return count==count_oranges?countmin:-1;
    }
}