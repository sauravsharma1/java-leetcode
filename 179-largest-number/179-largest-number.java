class Solution {
    public String largestNumber(int[] nums) {
        
        if(nums.length==0){
            return "";
        }
        
        String[] num=new String[nums.length];
        
        for(int i=0;i<num.length;i++){
            num[i]=String.valueOf(nums[i]);
        }
        
        Arrays.sort(num,(s1,s2)->(s2+s1).compareTo(s1+s2));
        
        if(num[0].charAt(0)=='0'){
            return "0";
        }
        
        StringBuilder sb=new StringBuilder();
        
        for(String str:num){
            sb.append(str);
        }
        
        return sb.toString();
        
    }
}