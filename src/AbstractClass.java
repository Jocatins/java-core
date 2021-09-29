abstract class Human{
    public abstract void eat(); // when you have abstract class, then u must abstract method


    public void sleep(){

    }
}
class Man extends Human{ // Concrete class
    public void eat(){

    }
}

public class AbstractClass {
    public static void main(String []args){
       Human human = new Man();
    }
}
