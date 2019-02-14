
class Exmp1 {//DIAMOND SHAPE PROBLEM

    int i;

    public  Exmp1() {
        i = 10;
        
    }
}

class Exmp2 {

    int i;

    public  Exmp2() {
        i = 100;
        
    }
}

class Exmp3 extends Exmp1,Exmp2{
    public void Disp()
        {
     System.out.println(i);
    



    }
}


public class LaunchMultipleInherIssue {

    public static void main(String[] args) {
        Exmp3 m = new Exmp3();
        m.Disp();
    }
}
