class Solution {
public:
    string mergeAlternately(string word1, string word2) {
      vector<char> v;
      stack<char> st;
      stack<char> st2;
      reverse(word1.begin(), word1.end());
      reverse(word2.begin(), word2.end());
      for(int i=0; i< word1.length(); i++) st.push(word1[i]);
      for(int i=0; i< word2.length(); i++) st2.push(word2[i]);

      while(!st.empty() || !st2.empty())
        {
            if(!st.empty())
            {
                v.push_back(st.top());
                st.pop();
            }
            if(!st2.empty())
            {
                v.push_back(st2.top());
                st2.pop();
            }
        }

    string s(v.begin(), v.end());
    return s;
    }
};