public class bl {
   public static void main(String[] args) {
     Solution ss=new Solution();
    int a[]={1,2};
    int b[]={3};
    double d=ss.findMedianSortedArrays(a,b);
   }

    
}
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    double d=0;
        int a[]=new int[nums1.length+nums2.length];
        int i;
        for(i=0;i<nums1.length;i++){
            a[i]=nums1[i];

        }
        for(int j=0;j<nums2.length;j++){
            a[i]=nums2[j];
            i++;
        }
         int min;
         int temp;
         for(int j=0;j<a.length;j++){
            min=j;
            for(i=j+1;i<a.length;i++){
                if(a[min]>a[i]){
                    min=i;
                }
            }
            temp=a[j];
            a[j]=a[min];
            a[min]=temp;

        }
        int total=a.length;
        if(total%2!=0){
            System.out.println(String.format("%.5f",(double)a[(total/2)]));
        }
        else{
            double t=(double)(a[total/2]+a[(total/2)-1])/2;
            System.out.println(String.format("%.5f",t));

        }
        return d;
    }
}