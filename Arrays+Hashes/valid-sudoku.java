class Solution {
    public boolean isValidSudoku(char[][] board) {
        int n = 9;
        int[] row = new int[n];
        int[] col = new int[n];
        int[] sub = new int[n];
        Map<Integer, Set<Character>> rowMap = new HashMap<>();
        Map<Integer, Set<Character>> colMap = new HashMap<>();
        Map<Integer, Set<Character>> gridMap = new HashMap<>();
        Set<Character> rowHash = new HashSet<>();
        // Set<Character> colHash = new HashSet<>();

        for (int i = 0; i < n; i++) {
            int k = 0;
            for (int j = 0; j < n; j++) {
                if (board[i][j] == '.') continue;
                // row[i] = board[i][j];
                
                if (rowHash.contains(board[i][j])) {
                    return false;
                }
                rowHash.add(board[i][j]);

                if (rowMap.containsKey(board[i][j])) {
                    return false;
                }
                rowMap.put(i, rowMap.getOrDefault(i, new HashSet<>()).add(board[i][j]));
                System.out.println(board[i][j] + " : " + i);

                
                // col[j] = board[i][j];
                // k = (i / 3) * 3 + (j / 3);
                // sub[k] = board[i][j];
                // System.out.println(board[i][j] + " : " + k);
            }
            // System.out.println();
        }

        // for (int i = 0; i < n; i++) {
        //     System.out.println(row[i] + " : " + col[i] + " : " + sub[i]);
        // }

        return true;
    }
}