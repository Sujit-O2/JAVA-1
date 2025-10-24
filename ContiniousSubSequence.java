public class ContiniousSubSequence {
    
}
class Solution {
    public int findLengthOfLCIS(int[] nums) {
        if(nums.length==1){
            return 1;
        }
        int Maxcount =0;
        
        for(int i=0;i<nums.length-1;i++){
            int diff=nums[i+1]-nums[i];
            int count=1;
            for(int j=i;j<nums.length-1;j++){
                if(nums[j]<nums[j+1]){
                if(nums[j+1]-nums[j]==diff){
                    count++;
                }
                else
                break;
            }


            }
            Maxcount=Math.max(Maxcount,count);


        }
        return Maxcount;
        
    }
}
// class Solution {
//     public int findLengthOfLCIS(int[] nums) {
//         if (nums == null || nums.length == 0) return 0; // handle empty input [web:1][web:2]
//         int maxLen = 1; // at least one element forms length 1 [web:2][web:4]
//         int curLen = 1;
//         for (int i = 1; i < nums.length; i++) {
//             if (nums[i] > nums[i - 1]) {
//                 curLen++; // extend current increasing run [web:1][web:2]
//             } else {
//                 curLen = 1; // reset when not strictly increasing [web:2][web:3]
//             }
//             if (curLen > maxLen) maxLen = curLen; // track best [web:2][web:3]
//         }
//         return maxLen; // O(n) time, O(1) space [web:2][web:3]
//     }
// }
