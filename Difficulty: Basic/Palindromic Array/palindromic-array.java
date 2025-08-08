/*Complete the Function below*/
class Solution {
    public static boolean isPalinArray(int[] arr) {
        // add code here.
        int count=0;
        for(int x:arr){
            String val=Integer.toString(x);
            if(val.equals(new StringBuilder(val).reverse().toString()))
                count++;
        }
        boolean res=(count==arr.length)?true:false;
        return res;
    }
}