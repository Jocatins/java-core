interface Static{
    int num = 9; // it becomes a constant
    void code();
    static void show(){
        System.out.println("static block");
    }
}
class DemoImp implements Static{
    public void code(){

    }
}
public class StaticDemo {
    public static void main(String []args){
        Static.show();
    }
}
