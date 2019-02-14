class You{
     public int acc_num;  /*try giving  private instead*/
     public int pwd;
    
    public void setData(){
        acc_num= 1234;
        pwd = 4321;
    }
    public void printData(){
    System.out.println(acc_num);
    System.out.println(pwd);
}
}

class Friend extends You{
    public void changeData(){
     
                acc_num= 1000;
        pwd = 4000;
    }
    @Override
    public void printData(){
    System.out.println(acc_num);
    System.out.println(pwd);
}
    
}
public class LaunchInheritanceProgms {
    public static void main(String[] args){
        Friend f = new Friend();
        f.printData();
        f.changeData();
    }
}
