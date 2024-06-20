public class ShortestRoute {
    public static float shortcut(String direction) {
        float x = 0, y = 0;
        for (int i = 0; i < direction.length(); i++) {
            char ch = direction.charAt(i);
            switch (ch) {
                case 'W':
                    x--;
                    break;
                case 'E':
                    x++;
                    break;
                case 'N':
                    y++;
                    break;
                case 'S':
                    y--;
                    break;
            }
        }
        System.out.println(x);
        System.out.println(y);
        float sDistance = ((x * x) + (y * y));
        return (float) Math.sqrt(sDistance);
    }

    public static void subString(String str, int si, int ei) {
        //subString :---------->
//        starting index,ending index(non-inclusive)
        String substr = "";
        for (int i = si; i < ei; i++) {
            substr += str.charAt(i);
        }
        System.out.println(substr);
    }

    public static void main(String[] args) {
        String direction = "WNEENESENNN";
        shortcut(direction);

        subString("kushal",0,5);


    }
}
