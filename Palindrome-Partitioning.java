class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        List<String> path = new ArrayList<>();
        int index=0;
        recurs(s, index, ans, path);
        return ans;

    }

    void recurs(String s, int index, List<List<String>> ans, List<String> path){
        if(s.length() == index){
            ans.add(new ArrayList<>(path));
            return;
        }

        for(int i= index; i< s.length() ; ++i){
            if(palindrome(s, index , i)){
                path.add(s.substring(index,i+1));
                recurs(s, i +1, ans, path);
                path.remove(path.size()-1);
            }
        }

    }

    boolean palindrome(String s, int start , int end){
        while(start<=end){
            if(s.charAt(start++)!=s.charAt(end--)){
                return false;
            }
        }
        return true;
    }
}