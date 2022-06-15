class Solution {
    
    static int[] par;
    
    public static int findpar(int u){
        
        if(par[u]==u){
            return u;
        }
        
        return par[u]=findpar(par[u]);
        
    }
    
    public int makeConnected(int n, int[][] connections) {
        
        if(connections.length<n-1){
            return -1;
        }
        
        par=new int[n];
        
        for(int i=0;i<n;i++){
            par[i]=i;
        }
        
        for(int[] connection:connections){
            int u=connection[0];
            int v=connection[1];
            
            int p1=findpar(u);
            int p2=findpar(v);
            
            if(p1!=p2){
                par[p2]=p1;
            }
            
            
            
        }
        
        int comp=0;
        
        for(int i=0;i<n;i++){
            if(par[i]==i){
                comp++;
            }
        }
        
        return comp-1;
        
    }
}