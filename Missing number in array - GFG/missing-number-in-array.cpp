//{ Driver Code Starts
// Initial template for C++

#include <bits/stdc++.h>
using namespace std;




// } Driver Code Ends
// User function template for C++

class Solution{
  public:
    int missingNumber(vector<int>& array, int n) {
        vector<bool> present(n + 1, false);  // Initialize a boolean array to mark numbers as present
    
    for (int i = 0; i < n- 1; i++) {
        present[array[i]] = true;  // Mark each element in the array as present
    }

    for (int i = 1; i <= n; i++) {
        if (!present[i]) {
            return i;  // Find the first number not marked as present
        }
    }

    return -1;
    }
};

//{ Driver Code Starts.

int main() {
    int t;
    cin >> t;
    while (t--) {
        int n;
        cin >> n;

        vector<int> array(n - 1);
        for (int i = 0; i < n - 1; ++i) cin >> array[i];
        Solution obj;
        cout << obj.missingNumber(array, n) << "\n";
    }
    return 0;
}
// } Driver Code Ends