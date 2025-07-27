// User function Template for Java

class Solution {
    // Function to search a given integer in a matrix.
    public boolean searchMatrix(int[][] mat, int x) {
        // code here
        boolean find=false;
        outerloop:
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                if(mat[i][j]==x){
                    find=true;
                    break outerloop;
                }
                    
            }
        }
        if(find)
            return true;
        else
            return false;
    }
}
