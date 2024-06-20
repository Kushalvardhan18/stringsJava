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
        float sDistance = ((x*x) +(y*y));
       return (float)Math.sqrt(sDistance);
    }

    public static void main(String[] args) {
        String direction = "WNEENESENNN";
        shortcut(direction);
    }
}
