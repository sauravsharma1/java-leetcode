class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        Set<String> visited=new HashSet<>();
        
        for(int i=0;i<9;i++){
            
            for(int j=0;j<9;j++){
                
                char number=board[i][j];
                
                if(number!='.'){
                    if(visited.contains(number+"R"+i)||visited.contains(number+"C"+j)||visited.contains(number+"B"+i/3+"_"+j/3)){
                        return false;
                    }
                    else{
                        visited.add(number+"R"+i);
                        visited.add(number+"C"+j);
                        visited.add(number+"B"+i/3+"_"+j/3);
                    }
                }
                
            }
            
        }
        return true;
        
    }
}