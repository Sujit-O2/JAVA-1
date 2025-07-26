class EncreaptToDecrypt{
    public static void main(String[] args) {
        String encryptedMessage="bye3 hel2o hi2";
        StringBuilder sb=new StringBuilder();
        int j=0;
        for(int i=0;i<encryptedMessage.length();i++){
            if(encryptedMessage.charAt(i)==' '){
                sb.insert(0,' ');
                j=0;
                }
                else
                {
                sb.insert(j,encryptedMessage.charAt(i));
                j++;
                }
                
            }
            for(int i=0;i<sb.length();i++){
            switch(sb.charAt(i)){
                case '2':
                sb.replace(i,i+1,sb.substring(i-1,i));
                break;
                case '3':
                sb.replace(i,i+1,sb.substring(i-1,i)+sb.substring(i-1,i));
                break;
                case '4':
                sb.replace(i,i+1,sb.substring(i-1,i)+sb.substring(i-1,i)+sb.substring(i-1,i));


                break;
                case '5':
                sb.replace(i,i+1,sb.substring(i-1,i)+sb.substring(i-1,i)+sb.substring(i-1,i)+sb.substring(i-1,i));

                break;
                case '6':
                sb.replace(i,i+1,sb.substring(i-1,i)+sb.substring(i-1,i)+sb.substring(i-1,i)+sb.substring(i-1,i)+sb.substring(i-1,i));

                break;
                case '7':
                sb.replace(i,i+1,sb.substring(i-1,i)+sb.substring(i-1,i)+sb.substring(i-1,i)+sb.substring(i-1,i)+sb.substring(i-1,i)+sb.substring(i-1,i));

                break;
                case '8':
                sb.replace(i,i+1,sb.substring(i-1,i)+sb.substring(i-1,i)+sb.substring(i-1,i)+sb.substring(i-1,i)+sb.substring(i-1,i)+sb.substring(i-1,i)+sb.substring(i-1,i));

                break;

                case '9':
                sb.replace(i,i+1,sb.substring(i-1,i)+sb.substring(i-1,i)+sb.substring(i-1,i)+sb.substring(i-1,i)+sb.substring(i-1,i)+sb.substring(i-1,i)+sb.substring(i-1,i)+sb.substring(i-1,i));

                break;
                default:
            }
            }
            System.out.println(sb);
    }

}