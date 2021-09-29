@FunctionalInterface
interface Abc{
    void show();
}

public class Lambda {
    public static void main(String []args){
        Abc obj = () -> System.out.println("Override the initial");
        obj.show();


    }
}
