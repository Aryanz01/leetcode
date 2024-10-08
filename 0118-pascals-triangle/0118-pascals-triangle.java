import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        
        // Base case: the first row is always [1].
        if (numRows == 0) {
            return triangle;
        }
        
        // Add the first row.
        triangle.add(new ArrayList<>());
        triangle.get(0).add(1);
        
        // Generate the remaining rows
        for (int i = 1; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            List<Integer> prevRow = triangle.get(i - 1);
            
            // The first element is always 1.
            row.add(1);
            
            // Each element is the sum of the two elements directly above it.
            for (int j = 1; j < i; j++) {
                row.add(prevRow.get(j - 1) + prevRow.get(j));
            }
            
            // The last element is always 1.
            row.add(1);
            
            // Add the row to the triangle.
            triangle.add(row);
        }
        
        return triangle;
    }
}
