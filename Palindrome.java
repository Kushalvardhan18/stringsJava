public class Palindrome {
    public static void check(String[] str){
        int n = str.length;
        for(int i =0;i<n/2;i++){
            for(int j=n;j>0;j--){
                if(str[i] == str[j]){

                }
            }
        }
    }
    public static void main(String[] args){
        String [] str = {"racecar","noon","madam"};
        check(str);
    }
}
