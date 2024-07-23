public class StringBuilderInJava {
    public static void main(String[] args){


        StringBuilder sb = new StringBuilder("Hw");
        sb.toString();  // Should be an Object for converting to string.

        StringBuilder a = new StringBuilder("");
        for(char ch ='a';ch<='z';ch++){
            a.append(ch);
        }
        System.out.println(a);
    }
}
