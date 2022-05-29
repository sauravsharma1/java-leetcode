class Solution {
    public int[] gardenNoAdj(int n, int[][] paths) {
        
        
        Garden[] gardens=new Garden[n+1];
        
        for(int i=1;i<gardens.length;i++){
            gardens[i]=new Garden();
        }
        
        for(int[] path:paths){
            Garden garden1=gardens[path[0]];
            Garden garden2=gardens[path[1]];
            garden1.neighborGardens.add(garden2);
            garden2.neighborGardens.add(garden1);
        }
        
        for(int i=1;i<gardens.length;i++){
            gardens[i].flowertype();
        }
        
        int[] result=new int[n];
        
        for(int i=0;i<n;i++){
            result[i]=gardens[i+1].flower;
        }
        
        return result;
        
    }
    
    private static class Garden{
        
        private int[] flowerTypes=new int[]{1,2,3,4};
        
        private int flower;
        
        private List<Garden> neighborGardens;
        
        public Garden(){
            this.flower=-1;
            this.neighborGardens=new ArrayList<>();
        }
        
        public void flowertype(){
            
            Set<Integer> neighborflowers=new HashSet<>();
            
            for(Garden neighbor:neighborGardens){
                if(neighbor.flower!=-1){
                    neighborflowers.add(neighbor.flower);
                }
            }
            
            for(int i:flowerTypes){
                if(!neighborflowers.contains(i)){
                    flower=i;
                    break;
                }
            }
            
        }
        
    }
    
}