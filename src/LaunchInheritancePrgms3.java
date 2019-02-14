

class Demo111{
int a;
int b;
public Demo111(){
    a= 10;
    b= 20;
    
}
public Demo111(int i, int j){
    
    a=i;
    b=j;        
}
}


class Demo222 extends Demo111{
    int c;
    int d;
    
    public Demo222(){
        c=30;
        d=40;
    }
    public Demo222(int m, int n){
        
        c=m;
        d=n;
    }
    public void disp(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}

public class LaunchInheritancePrgms3 {

   
    public static void main(String[] args)
    {
        Demo222 x;
        x = new Demo222(99, 199);
        x.disp();
        
    }
}


    

