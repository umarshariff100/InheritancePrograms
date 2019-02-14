class Demo11111{
int a;
int b;
public Demo11111(){
    a= 10;
    b= 20;
    
}
public Demo11111(int i, int j){
    a=i;
    b=j;        
}
}


class Demo22222 extends Demo11111{
    int c;
    int d;
    
    public Demo22222(){
        c=30;
        d=40;
    }
    public Demo22222(int m, int n, int p, int q){
        super(m,n);
        c=p;
        d=q;
    }

   
    public void disp(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}

public class LaunchInheritancePrgms5 {

   
    public static void main(String[] args)
    {
        Demo22222 x;
        x = new Demo22222(99,199, 299, 399);
        x.disp();
        
    }
}


    

