public class StringBuilderInJava {
    public static String upperCaseStr(String sc){
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(sc.charAt(0));
        sb.append(ch);
       for(int i =1;i<sc.length();i++){

           if(sc.charAt(i) ==' ' && i<sc.length()-1){
               sb.append(sc.charAt(i));
               i++;
               sb.append(Character.toUpperCase(sc.charAt(i)));

           }
           else{
               sb.append(sc.charAt(i));
           }
       }
       return sb.toString();
    }
    public static void main(String[] args){


        StringBuilder sb = new StringBuilder("Hw");
        sb.toString();  // Should be an Object for converting to string.

        StringBuilder a = new StringBuilder("");
        for(char ch ='a';ch<='z';ch++){
            a.append(ch);
        }
        System.out.println(a);
        System.out.println(a.length());

        String sc ="hi my name is kushal";
        System.out.println(upperCaseStr(sc));
    }
}
