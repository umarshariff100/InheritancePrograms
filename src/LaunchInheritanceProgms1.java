
class You1 {

    private int acc_num;
    /*try giving  private instead of public*/
    private int pwd;

    /*try giving  private instead of public*/

    public void setData() {
        acc_num = 2222;
        pwd = 9999;
    }

    public void printData() {
        System.out.println(acc_num);
        System.out.println(pwd);
    }
}

class Friend1 extends You1 {

    public void changeData() {

        acc_num = 1111;
        pwd = 2222;
    }

    @Override
    public void printData() {
        System.out.println(acc_num);
        System.out.println(pwd);
    }

}

public class LaunchInheritanceProgms1 {

    public static void main(String[] args) {
        Friend1 f;
        f = new Friend1();
        f.changeData();
        f.printData();

    }
}
