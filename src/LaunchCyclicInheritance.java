class Demo1 extends Demo2{
    public void disp1(){
        System.out.println("Inside Disp1");
        
    }
}

class Demo2 extends Demo1{
    public void disp2(){
        System.out.println("Inside Disp2");
        
    }
}
public class LaunchCyclicInheritance {
    public static void main(String args[]){
        Demo2 d2;
        d2 = new Demo2();
        d2.disp1();
        d2.disp2();
    }
    
}
