/**
 * argss
 */
public class argss {

    public static void main(String[] args) {
        int sum =0;
        for(int i=0;i<args.length;i++){
            sum+=Integer.parseInt(args[i]);
            System.out.print(args[i]+"\n");
        }
        System.out.println(sum);
    }
}