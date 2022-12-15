package activitythirteen;

public class Encapsulation {

    public static class packaged {
        private int x;
        private int y;
        private int z;
        private int a;

        public packaged(int x, int y, int z, int a) {
            System.out.println(add(x, y, z, a));
            System.out.println(subtract(x, y, z, a));
            System.out.println(multiply(x, y, z, a));
            System.out.println(firstDivByLast(x, y, z, a));
        }

    public int add(int x, int y, int z, int a){
        int adds = x + y + z + a;

        return adds;
    }
    public int subtract(int x, int y, int z, int a){
        int subs = x - y - z - a;

        return subs;
    }
    public int multiply(int x, int y, int z, int a){
        int multi = x * y * z * a;
        return multi;
    }
    public double firstDivByLast(int x, int y, int z, int a){
        double divy = (double) (x+y)/(z+a);
        return divy;
    }
    }

}
