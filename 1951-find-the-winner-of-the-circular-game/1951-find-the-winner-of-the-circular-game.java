import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int findTheWinner(int n, int k) {
        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            q.offer(i);
        }
        while (q.size() != 1) {
            int x = k;
            while (x > 1) {
                int r = q.poll();
                q.offer(r);
                x--;
            }
            q.poll();
        }
        return q.peek();
    }
}
