class Solution {
    public int calPoints(String[] ops) {
        Integer topel=null;
        Integer secondtop=null;
        
        Stack<Integer> st=new Stack<Integer>();
        
        for(String op:ops){
            
            switch(op.toCharArray()[0]){
                    
                case 'C':
                    st.pop();
                    break;
                case 'D':
                    topel=st.peek();
                    st.push(2*topel);
                    break;
                case '+':
                    topel=st.pop();
                    secondtop=st.peek();
                    st.push(topel);
                    st.push(topel+secondtop);
                    break;
                default:
                    st.push(Integer.parseInt(op));
                    break;
                
            }
            
        }
        
        int ans=0;
        
        while(!st.isEmpty()){
            ans=ans+st.pop();
        }
        return ans;
        
    }
}