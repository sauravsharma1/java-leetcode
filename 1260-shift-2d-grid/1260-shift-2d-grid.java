class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int row=grid.length;
        int col=grid[0].length;
        
        int temp[][]=new int[row][col];
        
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                
                int index1D=((i*col)+j+k)%(row*col);
                
                int tempRowIndex=index1D/col;
                int tempColIndex=index1D%col;
                
                temp[tempRowIndex][tempColIndex]=grid[i][j];
                
            }
        }
        
        List<List<Integer>> result=new ArrayList<List<Integer>>();
        
        for(int i=0;i<row;i++){
            List<Integer> list=new ArrayList<>();
            
            for(int j=0;j<col;j++){
                
                list.add(temp[i][j]);
                
            }
            
            result.add(list);
            
        }
        
        return result;
        
    }
}