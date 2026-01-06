import java.util.*;
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length+nums2.length;
        int[] a=new int[n];
        Double d;
        for(int i=0;i<nums1.length;i++){
            a[i]=nums1[i];
        }
        int k=nums1.length;
        for(int i=0;i<nums2.length;i++){
            a[k]=nums2[i];
            k++;
        }
        Arrays.sort(a);
        if(n%2!=0){
             d=(double)a[n/2];
        }
        else{
             d=((double)a[n/2]+a[n/2-1])/2;
        }
        return d;
    }
}