public class rangeAddition {
    public static void main(String[] args) {
        int a[][]={{2,2},{3,3}};
        new Solution().maxCount(3,3 ,a);
    }
    
}
// class Solution {
//     public int maxCount(int m, int n, int[][] ops) {
//         int a[][]=new int[m][n];
//         int max=0;
//         int count=0;

//         for(int a2[]:ops){
//             int i=a2[0];
//             int j=a2[1];
//             for(int q=0;q<i;q++){
//                 for(int w=0;w<j;w++){
//                     a[q][w]+=1;
//                     max=Math.max(a[q][w],max);
//                 }
//             }
//         }

//         for(int a1[]: a){
//             for(int j: a1){
//                if(j==max){
//                 count++;

//                }
//             }
//         }
//         System.out.println(count);
//         return 0;
//     }

//}
class Solution {
    public int maxCount(int m, int n, int[][] ops) {
        int minA = m;  // effective rows covered by all ops [web:9]
        int minB = n;  // effective cols covered by all ops [web:9]
        for (int[] op : ops) {
            minA = Math.min(minA, op[0]); // take min ai across ops [web:6]
            minB = Math.min(minB, op[1]); // take min bi across ops [web:6]
        }
        return minA * minB; // number of max-valued cells [web:12]
    }
}
