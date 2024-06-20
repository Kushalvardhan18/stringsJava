import java.util.*;
public class StringsInJava {
    public static void main(String[] args){
//        Strings are Immutable :---------->

        String str ="abcd";
        System.out.println(str);
        String str2 = new String("xyz");
        System.out.println(str2 );

        Scanner sc = new Scanner(System.in);
        String  name = sc.nextLine();
        System.out.println(name);

        String fullName = "Kushal Vardhan";
        System.out.println(fullName.length());


        //Concatenation :--------->
        String firstName ="Kushal";
        String lastName = "Vardhan";
        String Name = firstName+lastName;
        System.out.println(Name);

        
        System.out.println(fullName.charAt(1));
    }
}
