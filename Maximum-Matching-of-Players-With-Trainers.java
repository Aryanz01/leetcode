class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Thread a = new Thread(()-> Arrays.sort(players));
        Thread b = new Thread(()-> Arrays.sort(trainers));
        a.start();
        b.start();

        try {
            a.join();
            b.join();
        } catch (Exception e) {

        }
        int n= players.length;  //3  r
        int m= trainers.length;   //2  L
        int l=0;
        int r=0;

        while(l<m && r<n){
            if(trainers[l]>=players[r]){
                
                r=r+1;
            }
            l=l+1;
            
        }

        return r;
    }
}