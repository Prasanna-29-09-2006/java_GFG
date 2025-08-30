// User function Template for Java

class Solution {
    public String reverseString(String s) {
        // code here.
        String newstr="";
        for(int i=s.length()-1;i>=0;i--){
            if((int)s.charAt(i)!=32){
                if(!(newstr.contains(String.valueOf(s.charAt(i))))){
                newstr=newstr+String.valueOf(s.charAt(i));
            }
            }
        }
        return newstr;
        
    }
}