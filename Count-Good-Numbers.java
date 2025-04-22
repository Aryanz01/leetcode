class Solution {
    static final int mod = 1_000_000_007;
    public int countGoodNumbers(long n) {
        
        long evenpos = (n+1)/2;
        long oddpos = n/2;
        long evencnt = modpower(5, evenpos);
        long oddcnt = modpower(4, oddpos);

        return (int)((evencnt * oddcnt) % mod);
    }
    private long modpower(long base, long exp){
            long result =1;
            base =base % mod;

            while(exp > 0){
                if((exp & 1 )==1){  //condition for odd
                   result  = (result * base) % mod;
                }
                base = (base*base)% mod;
                exp >>= 1;
            }

            return result;


        }
}