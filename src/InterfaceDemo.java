@FunctionalInterface
interface Demo {
    void code();
    default void play(){
        System.out.println("demo interface");
    }
}
interface MyDemo {
    default void play(){
        System.out.println("In MyDemo Interface");
    }
}
class DemoImpl implements Demo , MyDemo {
    @Override
    public void play(){
        MyDemo.super.play();
    }
    public void code(){
        System.out.println("In demo-imp class");
    }
}

public class InterfaceDemo {
    public static void main(String []args){
        Demo obj = new DemoImpl();
        obj.code();
        obj.play();
    }
}
