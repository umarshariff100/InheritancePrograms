

class Demo1111{
int a;
int b;
public Demo1111(){
    a= 10;
    b= 20;
    
}
public Demo1111(int i, int j){
    a=i;
    b=j;        
}
}


class Demo2222 extends Demo1111{
    int c;
    int d;
    
    public Demo2222(){
        c=30;
        d=40;
    }
    public Demo2222(int m, int n){
        super(m,n);   //need to write this line.
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

public class LaunchInheritancePrgms4 {

   
    public static void main(String[] args)
    {
        Demo2222 x;
        x = new Demo2222(99, 199);
        x.disp();
        
    }
}


    