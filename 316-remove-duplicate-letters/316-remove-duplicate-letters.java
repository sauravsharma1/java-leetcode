class Solution {
    public String removeDuplicateLetters(String s) {
        int n=s.length();
        
        boolean visited[]=new boolean[26];
        
        int lastIndex[]=new int[26];
        
        for(int i=0;i<n;i++){
            lastIndex[s.charAt(i)-'a']=i;
        }
        
        Stack<Integer> st=new Stack<>();
        
        for(int i=0;i<n;i++){
            int c=s.charAt(i)-'a';
            if(visited[c]) continue;
            
            visited[c]=true;
            
            while(!st.isEmpty()&&c<st.peek()&&lastIndex[st.peek()]>i){
                visited[st.pop()]=false;
            }
            st.push(c);
        }
        
        StringBuilder ans=new StringBuilder();
        
        for(int l:st){
            ans.append((char)(l+'a'));
        }
        return ans.toString();
    }
}