import java.util.*;

class Solution {
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    
    public int[] solution(String[] maps) {
        int n = maps.length;
        int m = maps[0].length();
        int[][] board = new int[n][m];
        boolean[][] isVisited = new boolean[n][m];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (maps[i].charAt(j) != 'X') {
                    board[i][j] = maps[i].charAt(j) - '0';
                }
            }
        }
        
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (!isVisited[i][j] && board[i][j] > 0) {
                    int cnt = dfs(board, isVisited, i, j, n, m);
                    ans.add(cnt);
                }
            }
        }
        
        if (ans.isEmpty()) {
            ans.add(-1);
        }
        
        Collections.sort(ans);
        int[] answer = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            answer[i] = ans.get(i);
        }
        
        return answer;
    }
    
    static int dfs(int[][] board, boolean[][] isVisited, int x, int y, int n, int m) {
        isVisited[x][y] = true;
        int cnt = board[x][y];
        
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            
            if (nx < 0 || ny < 0 || nx >= n || ny >= m) {
                continue;
            }
            if (board[nx][ny] == 0 || isVisited[nx][ny]) {
                continue;
            }
            cnt += dfs(board, isVisited, nx, ny, n, m);
        }
        
        return cnt;
    }
}
