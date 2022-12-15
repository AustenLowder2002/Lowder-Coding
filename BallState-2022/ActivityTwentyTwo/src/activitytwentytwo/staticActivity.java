package activitytwentytwo;

public class staticActivity {
    int a;
    int b;
    int c;
    static int x;

    public staticActivity(int z) {
        a  = 1;
        b = 2;
        c = 3;
        x = 0;
        for(int i=0; i<z; i++) {
            ++x;
            willReturn(x);
        }
    }

    public static int willReturn(int x) {
        System.out.println(x);
        return x;
    }
}