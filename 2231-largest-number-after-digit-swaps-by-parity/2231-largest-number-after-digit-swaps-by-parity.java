class Solution {
    public int largestInteger(int num) {
        PriorityQueue<Integer> oddpq=new PriorityQueue<>((a,b)->(b-a));
        
        PriorityQueue<Integer> evenpq=new PriorityQueue<>((a,b)->(b-a));
        
        String str=num+"";
        
        for(char c:str.toCharArray()){
            int el=c-'0';
            
            if(el%2==0){
                evenpq.offer(el);
            }
            
            else{
                oddpq.offer(el);
            }
            
        }
        
        String ans="";
        
        for(char c:str.toCharArray()){
            
            int el=c-'0';
            
            if(el%2==0){
                ans+=(evenpq.poll()+"");
            }
            else{
                ans+=(oddpq.poll()+"");
            }
            
        }
        
        return Integer.parseInt(ans);
        
    }
}