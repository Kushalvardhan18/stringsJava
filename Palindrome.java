public class Palindrome {
    public static boolean isPalindrome(String str){
//        for(int i =0;i<str.length()/2;i++) {
//            int n = str.length();
//            if (str.charAt(i) != str.charAt(n - 1 - i)) {
//               return true;
//            }
//        }
//        return false;
        StringBuilder sb = new StringBuilder();
        for(int i = str.length()-1;i>=0;i--){
            int n = str.length();
            sb.append(str.charAt(i));
        }
        String strNew = sb.toString();

        if(strNew.equals(str)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String str = "Kushal";
        System.out.println( isPalindrome(str));
    }
}
