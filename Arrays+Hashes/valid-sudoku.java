class Solution {
    public boolean isValidSudoku(char[][] board) {
        int n = 9;
        // int[] row = new int[n];
        // int[] col = new int[n];
        // int[] sub = new int[n];
        Map<Integer, Set<Character>> rowMap = new HashMap<>();
        Map<Integer, Set<Character>> colMap = new HashMap<>();
        Map<Integer, Set<Character>> gridMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == '.') continue;

                rowMap.putIfAbsent(i, new HashSet<>());
                if (rowMap.get(i).contains(board[i][j])) {
                    return false;
                }
                rowMap.get(i).add(board[i][j]);

                colMap.putIfAbsent(j, new HashSet<>());
                if (colMap.get(j).contains(board[i][j])) {
                    return false;
                }
                colMap.get(j).add(board[i][j]);

                
            }
        }

        // for (Character c : rowHash) {
        //     System.out.println(rowMap);
        // }
        
        System.out.println(rowMap + "\n" + colMap);

        return true;
    }
}