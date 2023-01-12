class Solution {
    long minimizeSum(int N, int arr[]) {
        // code here
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

        for(int i=0; i<N; i++){
            pq.offer(arr[i]);
        }

        int res = 0;

        while(pq.size() >= 2){
            int p1 = pq.poll();
            int p2 = pq.poll();

            int val = p1+p2;
            res += val;
            pq.offer(val);

        }

        return (long)res;
    }
}