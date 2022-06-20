class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        
        List<int[]> ans=new LinkedList<>();
        
        int len=intervals.length;
        int i=0;
        while(i<len&&intervals[i][1]<newInterval[0]){
            ans.add(intervals[i]);
            i++;
        }
        
        while(i<len&&intervals[i][0]<=newInterval[1]){
            newInterval[0]=Math.min(intervals[i][0],newInterval[0]);
            
            newInterval[1]=Math.max(intervals[i][1],newInterval[1]);
            i++;
            
        }
        
        ans.add(newInterval);
        
        while(i<len){
            
            ans.add(intervals[i]);
            i++;
            
        }
        
        int[][] result=new int[ans.size()][2];
        int j=0;
        while(j<ans.size()){
            
            result[j]=ans.get(j);
            j++;
            
        }
        
        return result;
        
    }
}