class Solution {
    public int[] countOddEven(int[] arr) {
        // Code here
        int odd_count=0,even_count=0;
        for(int e:arr){
            if(e%2==0)
                even_count++;
            else
                odd_count++;
        }
        int []obj={odd_count,even_count};
        return obj;
        
        
        
        
    }
}