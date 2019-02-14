
class Demo11 {

    int a;
    int b;

    public Demo11() {
        a = 10;
        b = 20;

    }

    public Demo11(int i, int j) {
        a = i;
        b = j;
    }

}

class Demo22 extends Demo11 {

    int c;
    int d;

    public Demo22() {
        c = 30;
        d = 40;
    }

    public Demo22(int m, int n) {
        c = m;
        d = n;
    }

    public void disp() {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}

public class LaunchInheritanceProgms2 {

    public static void main(String[] args) {
        Demo22 x;
        x = new Demo22();
        x.disp();

    }
}
