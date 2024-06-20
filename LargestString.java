// Lexographical
// str1.compareTo(str2)
// if 0 : equals
// if <0 : negative : str1<str2
//if>0 : positive : str1>str2
public class LargestString {
    public static void largeStr(String []fruits){
        String largest = fruits[0];
       for (int i =0;i<fruits.length;i++){
           if(largest.compareToIgnoreCase(fruits[i])<0){
               largest = fruits[i];
           }
       }
        System.out.println(largest);

        }

    public static void main(String[] args){
    String fruits[] = {"apple","mango","banana"};
    largeStr(fruits);
    }
}

