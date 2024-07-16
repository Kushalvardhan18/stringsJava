public class StringsCompression{
    public static String stringAfterCompression(String sc){
        // "aaabbcccdd" = "a3b2c3d2"
        String newStr ="";

//        for(int i =0;i<sc.length();i++){
//            Integer count =1;
//            char c = sc.charAt(i);
//
//            while(i<sc.length()-1 && sc.charAt(i) == sc.charAt(i+1)){
//                count++;
//                i++;
//            }
//            newStr += sc.charAt(i);
//            if(count >1){
//                newStr +=count.toString();
//            }
//        }

        StringBuilder str = new StringBuilder(sc.length());
        for(int i =0;i<sc.length();i++){
            int count =1;
            char c = sc.charAt(i);
            while(i<sc.length()-1 && sc.charAt(i) == sc.charAt(i+1)){
                count++;
                i++;
            }
            str.append(c);
            if(count>1){
                str.append(count);
            }
        }
        return str.toString();
    }
    public static void main(String[] args){
       String sc ="aaabbcccdd";
        System.out.println( stringAfterCompression(sc));
    }
}