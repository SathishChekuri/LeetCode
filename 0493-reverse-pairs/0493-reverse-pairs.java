class Solution {
    public int reversePairs(int[] nums) {
        return mergeSort(nums,0,nums.length-1);
    }
    int mergeSort(int [] arr,int i,int j){
        if(i>=j) return 0;
            int m=(i+j)/2;
            int c=0;
            c+=mergeSort(arr,i,m);
            c+=mergeSort(arr,m+1,j);
            c+=cnt(arr,i,m,j);
            merge(arr,i,m,j);
            return c;        
    }
    void merge(int [] arr,int i,int m,int j){
        int l=i;
        int [] a=new int[j-i+1];
        int ind=0,k=m+1;
        while(i<=m&&k<=j){
            if(arr[i]<arr[k]){
                a[ind++]=arr[i++];
            }
            else a[ind++]=arr[k++];
        }
        while(i<=m){
            a[ind++]=arr[i++];
        }
        while(k<=j){
            a[ind++]=arr[k++];
        }
        for(int x=0;x<a.length;x++){
            arr[l+x]=a[x];
        }
    }
    int cnt(int [] arr,int i,int m,int j){
        int c=0,k=m+1;
        while(i<=m){
            while(k<=j&&(long)arr[i]>(long)arr[k]*2) k++;
            c+=k-m-1;
            i++;
        }
        return c;
    }
}