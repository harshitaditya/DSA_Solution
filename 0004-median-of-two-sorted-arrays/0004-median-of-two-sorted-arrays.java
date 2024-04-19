class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int size1=nums1.length;
        int size2=nums2.length;
        int arr[]=new int[size1+size2];
        int k=0;
       int m=0;
        for(int i=0;i<size1+size2;i++){
             if(k<size1 && m<size2){
                 if(nums1[k]<nums2[m]){
                arr[i]=nums1[k];
                k++;
            }
            else{
                arr[i]=nums2[m];
                m++;
            }
            }
            else if(k<size1){
                arr[i]=nums1[k];
                k++;
            }
            else if(m<size2){
                arr[i]=nums2[m];
                m++;
            }
            
            
        }
        double ans=0.0;
        if((size1+size2)%2==0){
            ans=(double)(arr[(size1+size2)/2]+arr[((size1+size2)/2)-1])/2;
        }
        else{
            ans=(double)(arr[(size1+size2)/2]);
        }

        return ans;
    }
}