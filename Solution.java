class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		for (int g : gifts) {
			pq.add(g);
		}
		while (k > 0) {
			int max = pq.poll();
			pq.add((int) Math.sqrt(max));
			k--;
		}
		long ans = 0;
		while (!pq.isEmpty()) {
			ans += pq.poll();
		}
		return ans;
    }
}
