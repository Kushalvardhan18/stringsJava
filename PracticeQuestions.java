import java.util.Arrays;
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
    public static boolean isAnagram(char[] str1, char[] str2){
        int n1= str1.length;
        int n2= str2.length;
        if(n1 != n2){
            return false;
        }
        Arrays.sort(str1);
        Arrays.sort(str2);
        for(int i =0;i<n1;i++){
            if(str1[i] != str2[i]){
                return false;
            }
        }
        return true;
    }
    public static void countWords(String[] sentences){
        int maxNum =0;
        for(String sentence :sentences){
            String [] words = sentence.split(",");
            maxNum = Math.max(maxNum, words.length);
        }
        System.out.println(maxNum);

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        System.out.println(lowerCaseVowels(a));
        String [] sentences = {"i","am a","very","talented","person"};
        countWords(sentences);
        char[] str1 = {'c','a','r','e'};
        char[] str2 = {'r','a','c','e'};
        System.out.println(isAnagram(str1,str2));
    }
}
