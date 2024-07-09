import java.util.Scanner;

public class PracticeQuestions {
    public static int lowerCaseVowels(String a){
        int count =0;
        for(int i =0;i<a.length();i++){
            if(a.charAt(i) == 'a' ||a.charAt(i) == 'e' ||a.charAt(i) == 'i' ||a.charAt(i) == 'o' ||a.charAt(i) == 'u' ){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        System.out.println(lowerCaseVowels(a));
    }
}
