class Solution {
    public int findJudge(int n, int[][] trust) {
        
        if(trust.length==0&&n>1){
            return -1;
        }
        
        if(trust.length==0){
            return 1;
        }
        
        Map<Integer,Integer> map=new HashMap<>();
        
        Set<Integer> set=new HashSet<>();
        
        for(int[] t:trust){
            
            set.add(t[0]);
            
            map.putIfAbsent(t[1],0);
            
            map.put(t[1],map.get(t[1])+1);
            
            
            
        }
        
       for(Integer key:map.keySet()){
           if(map.get(key)==n-1&&set.contains(key)==false){
               return key;
           }
       }
        
        return -1;
        
    }
}