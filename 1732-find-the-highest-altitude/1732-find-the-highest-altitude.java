class Solution {
    public int largestAltitude(int[] gain) {
        int num = 0;
        int max = 0;
        for(int i = 0; i<gain.length;i++){
            num += gain[i];
            if(max<num){
                max = num;
            }
        }
        return max;
        
    }
}