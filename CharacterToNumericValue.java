public class CharacterToNumericValue {
public static void main(String[] args){
    String sc = "0000007777F4566";
    for(int i =0;i<sc.length();i++){
        if(Character.getNumericValue(sc.charAt(4))==0 ){
            System.out.println("Kushal");
        }
        else{
            System.out.println("Vardhan");
        }
    }
}
}