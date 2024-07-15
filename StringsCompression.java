public class StringsCompression{
    public static String stringAfterCompression(String sc){
        // "aaabbcccdd" = "a3b2c3d2"
        String newStr ="";

        for(int i =0;i<sc.length();i++){
            Integer count =1;
            char c = sc.charAt(i);

            while(i<sc.length()-1 && sc.charAt(i) == sc.charAt(i+1)){
                count++;
                i++;
            }
            newStr += sc.charAt(i);
            if(count >1){
                newStr +=count.toString();
            }
        }
        return newStr;
    }
    public static void main(String[] args){
       String sc ="aaabbcccdd";
        System.out.println( stringAfterCompression(sc));
    }
}