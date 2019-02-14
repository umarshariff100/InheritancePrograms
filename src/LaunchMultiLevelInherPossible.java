class Exmp11{
    int i;
     Exmp11(){
        i=100;
    }
}
class Exmp12 extends Exmp11{
    int j;
     Exmp12(){
        j=200;
    }
}
class Exmp13 extends Exmp12{
int k;
 Exmp13(){
    k= 300;
}    
public void Disp(){
 System.out.println(i+j+k);
    }
}

public class LaunchMultiLevelInherPossible {
 public static void main(String[] args){
     Exmp13 m;
     m = new Exmp13();
     m.Disp();
 }
}

