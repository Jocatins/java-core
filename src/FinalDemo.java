class A {
    final int DAY = 0; //constant
    public A(){

    }
    public final void show(){
        System.out.println("In A show");
    }
}
class B extends A {

}

public class FinalDemo {
    public static void main(String []args){
        A obj = new A();

    }
}
