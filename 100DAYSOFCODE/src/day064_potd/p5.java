package day064_potd;
class Solution {
    long countSubstring(String S){
        int n = S.length();
        long ans = 0, minus = 0;
        int zero = n;
        int mp[] = new int[2 * n + 5];
        int cur=zero;
        for(int i = 0; i < n; i++){
            if(S.charAt(i) == '0')
                cur--;
            else
                cur++;
            if(cur <= zero){
                minus++;
            }
            mp[cur]++;

        }
        for(int i = 0; i < n; i++){
            ans += (n - i - minus) * 1l;
            if(S.charAt(i) == '1'){
                mp[zero+1]--;
                zero++;
                minus += mp[zero];
            }
            else{
                mp[zero-1]--;
                zero--;
                minus--;
                minus -= mp[zero+1];
            }
        }
        return ans;
    }
}