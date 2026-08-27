class Solution {
    public int subtractProductAndSum(int n) {
        int sum =0;
        int prod = 1;
        if(n == 0){
            return 0;
        }
        while(n > 0){
            int d = n%10;
            prod *= d;
            sum += d;
            n/=10;
        }
        return prod - sum;
        
    }
}