public class excelSheet {
    
}

class Solution {
    public String convertToTitle(int columnNumber) {
       char arr[]={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
       String s="";
       int count=0;
       
       while(columnNumber>0){
        columnNumber--;
        int rem=columnNumber%26;
        s+=arr[rem];
        columnNumber/=26;


       }
       return new StringBuffer(s)
                .reverse()
                .toString();
        
    }
}
//  if(columnNumber<=26){
//                     if(count!=0){
//                         s=arr[count-1]+"";
//                     }

//             s=s+arr[columnNumber-1];
//             break;
//         }
//         else{
//             columnNumber-=26;
//             count++;

//         }