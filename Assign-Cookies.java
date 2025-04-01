class Solution {
    public int findContentChildren(int[] g, int[] s) {
        //g ->child 
        //s ->cookie
        // Arrays.sort(g);
        // Arrays.sort(s);

        Thread a = new Thread(()-> Arrays.sort(g));
        Thread b = new Thread(()-> Arrays.sort(s));
        a.start();
        b.start();

        try {
            a.join();
            b.join();
        } catch (Exception e) {

        }
        int n= g.length;  //3  r
        int m= s.length;   //2  L
        int l=0;
        int r=0;

        while(l<m && r<n){
            if(s[l]>=g[r]){
                
                r=r+1;
            }
            l=l+1;
            
        }

        return r;

    }
}