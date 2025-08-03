class Solution {
    public ArrayList<Integer> maxAdj(int[] arr) {
        ArrayList<Integer> obj=new ArrayList<Integer>();
        if((arr.length)==1)
            obj.add(arr[0]);
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]<arr[i])
                obj.add(arr[i]);
            else
                obj.add(arr[i-1]);
        }
        return obj;
        
    }
};