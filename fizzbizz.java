import java.util.ArrayList;
import java.util.List;

public class fizzbizz {
    
}
class Solution {
    public List<String> fizzBuzz(int n) {
        List<String>ll=new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(i%3==0&&i%5==0){
                ll.add("FizzBuzz");
            }
            else if(i%5==0){
                ll.add("Buzz");
            }
            else if(i%3==0){
                ll.add("Fizz");
            }
            else{
                ll.add(i+"");
            }
        }
        return ll;
        
    }
}