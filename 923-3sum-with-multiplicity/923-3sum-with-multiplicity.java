class Solution {
    public int threeSumMulti(int[] arr, int target) {
        Map<Integer,Long> mp=new HashMap<>();
        
        for(int el:arr){
            long freq=mp.getOrDefault(el,0l);
            mp.put(el,freq+1l);
        }
        long ans=0;
        for(Integer el1:mp.keySet()){
            for(Integer el2:mp.keySet()){
                int el3=target-el1-el2;
                
                if(mp.containsKey(el3)){
                    long freq1=mp.get(el1);
                    long freq2=mp.get(el2);
                    long freq3=mp.get(el3);
                    
                    if(el1==el2&&el1==el3){
                        ans+=((freq1)*(freq1-1)*(freq1-2))/6;
                    }
                    else if(el1==el2 && el1!=el3){
                        ans+=((freq1)*(freq1-1))/2*freq3;
                    }
                    else if(el1<el2&&el2<el3){
                        ans+=((freq1*freq2*freq3));
                    }
                }
                ans=ans%1000000007;
            }
        }
        return (int)ans;
    }
}