package day066_POTD;
import java.util.Arrays;
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] temp = new int[nums1.length + nums2.length];
        int x =0;
        for (int i = 0 ; i<temp.length ; i++){
            if (i < nums1.length)
                temp[i] = nums1[i];
            else
                temp[i] = nums2[x++];
        }
        Arrays.sort(temp);
        if (temp.length %2 ==0){
            int l = temp.length /2;
            return (temp[l]+temp[l-1])/2.00;
        }
        else {
            return temp[temp.length/2];
        }
    }
}
