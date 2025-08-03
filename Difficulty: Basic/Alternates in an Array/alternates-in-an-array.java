class Solution {
    // function to print alternate elements of an array
    public ArrayList<Integer> getAlternates(int arr[]) {
        ArrayList<Integer> obj=new ArrayList<Integer>();
        for(int i=0;i<arr.length;i++){
            if((i%2)==0)
                obj.add(arr[i]);
        }
        return obj;
        
    }
}