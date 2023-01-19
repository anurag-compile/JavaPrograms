package day068_POTD;
class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int[] pref = new int[nums.length];
        pref[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            pref[i] = pref[i - 1] + nums[i];
        }
        int[] m = new int[k];
        m[0] = 1;
        int ans = 0;
        for (int x : pref) {
            if (x < 0) {
                x = (x % k + k) % k;
            }
            m[x % k]++;
        }
        for (int x : m) {
            ans += x * (x - 1) / 2;
        }
        return ans;
    }
}
