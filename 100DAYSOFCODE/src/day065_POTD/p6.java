package day065_POTD;
class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        int j = 0;
        while(true)
        {
            while(j < nums.length && nums[j] <= nums[i])
            {
                j++;
            }
            if(j < nums.length)
                nums[++i] = nums[j];
            else
                break;
        }
        return i+1;
    }
}
