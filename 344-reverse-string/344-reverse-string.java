class Solution {
    public void reverseString(char[] s) {
        int k=s.length-1;
        int p=k/2;
        
        for(int i=0;i<=p;i++){
            char d=s[i];
            s[i]=s[k];
            s[k--]=d;
        }
        
    }
}