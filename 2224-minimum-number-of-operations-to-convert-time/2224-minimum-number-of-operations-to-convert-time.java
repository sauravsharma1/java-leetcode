class Solution {
    public int convertTime(String current, String correct) {
        
        int minutescurrent=getMinutes(current);
        
        int minutescorrect=getMinutes(correct);
        
        int diff=minutescorrect-minutescurrent;
        
        int count=0;
        
        if(diff>0){
            
            int denominations[]=new int[]{60,15,5,1};
            
            for(int denomination:denominations){
                
                if(diff%denomination==0){
                    count+=diff/denomination;
                    break;
                }
                
                else{
                    count+=diff/denomination;
                    diff=diff%denomination;
                }
                
            }
            
        }
        
        return count;
        
    }
    
    private int getMinutes(String timestamp){
        String[] time=timestamp.split(":");
        
        int hours=Integer.parseInt(time[0]);
        int minutes=Integer.parseInt(time[1]);
        
        return hours*60+minutes;
        
    }
    
}