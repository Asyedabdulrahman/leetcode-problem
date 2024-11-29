#include <vector>
#include <climits>

class Solution {
public:
    int calculateMinimumHP(vector<vector<int>>& d) {
        int n = d.size();
        int m = d[0].size();

        vector<vector<int>> dp(n, vector<int>(m, 0));

        return helper(d, n, m, 0, 0, dp);
    }

    int helper(vector<vector<int>>& d, int n, int m, int row, int col, vector<vector<int>>& dp) {
        // base condition 1
        if (row == n - 1 && col == m - 1) {
            return max(1, 1 - d[row][col]);
        }

        // base condition 2
        if (row >= n || col >= m) {
            return INT_MAX;
        }

        if (dp[row][col] != 0) {
            return dp[row][col];
        }

        int right = helper(d, n, m, row, col + 1, dp);
        int down = helper(d, n, m, row + 1, col, dp);

        // Calculate the minimum health needed at the current position
        dp[row][col] = min(right, down) - d[row][col];

        // Ensure the minimum health is at least 1
        dp[row][col] = max(1, dp[row][col]);

        return dp[row][col];
    }
};