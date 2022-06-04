class Solution {
      public List<List<String>> solveNQueens(int n) {
        char[][] board=new char[n][n];
        
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                board[i][j]='.';
        
        List<List<String>> res=new ArrayList<List<String>>();
        
        int leftrow[]=new int[n];
        
        int upperdiagonal[]=new int[2*n-1];
        
        int lowerdiagonal[]=new int[2*n-1];
        
        solve(0,board,res,leftrow,lowerdiagonal,upperdiagonal);
        
        return res;
        
    }
    
    public void solve(int col,char[][] board,List<List<String>> res,int leftrow[],int lowerdiagonal[],int[] upperdiagonal){
        if(col==board.length){
            res.add(construct(board));
            return;
        }
        
        for(int row=0;row<board.length;row++){
            
            if(leftrow[row]==0&&lowerdiagonal[row+col]==0&&upperdiagonal[board.length-1+col-row]==0){
                
                board[row][col]='Q';
                
                leftrow[row]=1;
                
                lowerdiagonal[row+col]=1;
                
                upperdiagonal[board.length-1+col-row]=1;
                
                solve(col+1,board,res,leftrow,lowerdiagonal,upperdiagonal);
                
                board[row][col]='.';
                
                leftrow[row]=0;
                
                lowerdiagonal[row+col]=0;
                
                upperdiagonal[board.length-1+col-row]=0;
                
            }
            
        }
        
    }
    
    private List<String> construct(char[][] board){
        List<String> res=new LinkedList<>();
        
        for(int i=0;i<board.length;i++){
            String s=new String(board[i]);
            res.add(s);
        }
        
        return res;
    }
    
}