// User function Template for Java
class Solution {
    public int search(int k, ArrayList<Integer> arr) {
        // code here
        int i;
        boolean found=false;
        for(i=0;i<arr.size();i++){
            if(arr.get(i)==k){
                found=true;
                i++;
                break;
            }
                
        }
        if(found)
            return i;
        else
            return -1;
    }
}