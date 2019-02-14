
class Exmp1{
    int i;
    public Exmp1(){
        i =10;
    }
}
class Exmp2{
    int i;
    public Exmp2(){
        i=20;
    }
    class Exmp3 extends Exmp1,Exmp2{
    public void disp(){
        System.out.println(i);
    }
}
    
}
public class LaunchDiamondShapeProblem {
    public static void main(String srgs[]){
        Exmp3 m = new Exmp3();
        m.disp();
    }
}
