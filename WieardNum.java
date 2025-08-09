import java.util.ArrayList;

public class WieardNum {

    public static void main(String[] args) {
        int n=40;
        ArrayList<Integer> li=new ArrayList<>();
        li.add(1);
        int sum=1;
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                li.add(i);
                sum+=i;
            System.out.println(sum);

            }

        }
        
        if(sum>n){
            int diff=n-sum;
            boolean bb=li.contains(diff);
            if(bb){
                System.out.println("exist1");
                return;
            }

            for(int i=0;li.get(i)<=diff;i++){
                int a=diff;
                for(int j=i;li.get(j)<diff;j++){
                    diff-=li.get(j);
                    if(a==0){
                        System.out.println("exist2");
                        return;
                    }
                }
            }
            System.out.println("not exist");

            
        }
        else{
            
             System.out.println("exist3");
                        return;
        }
    }
}