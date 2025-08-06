
class Solution {
    public String longest(List<String> arr) {
        // code here
        String longest1="";
        for(int i=0;i<arr.size();i++){
            if((arr.get(i)).length()>longest1.length())
                longest1=arr.get(i);
        }
        return longest1;
    }
}
