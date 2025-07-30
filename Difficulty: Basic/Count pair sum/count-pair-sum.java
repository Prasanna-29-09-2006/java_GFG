// User function Template for Java

class Solution {

    // function to count all pairs
    // from both the sorted arrays
    // whose sum is equal to a given
    // value
    static int countPairs(int arr1[], int arr2[], int x) {
        // code here.
        int count=0;
        int i,j;
        for(i=0;i<arr1.length;i++){
            for(j=0;j<arr2.length;j++){
                if((arr1[i]+arr2[j])==x)
                    count++;
            }
        }
        return count;
        
    }
}