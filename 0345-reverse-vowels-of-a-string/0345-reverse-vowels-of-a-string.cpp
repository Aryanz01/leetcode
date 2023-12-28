class Solution {
public:
    string reverseVowels(string s) {
        int n=s.length();
        int a=0;
        int e=n-1;

        while(a<e){

            while(a<e && !vowel(s[a])){
                a++;
            }

            while(a<e &&  !vowel(s[e])){
                e--;  
            }

            if(a<e){
                swap(s[a], s[e]);
                a++;
                e--;
            }

        }

        return s;

    }

        bool vowel(char c){
           return  c== 'a' ||c=='e' ||c=='i' ||c=='o' ||c=='u' || c=='A' ||c=='E' || c=='I' || c== 'O' || c=='U';
            

        }
    

};