abstract class Writer {
    public abstract void write();
}
class Pen extends Writer{
    public void write(){
        System.out.println("pen writer");
    }
}
class Pencil extends Writer {
    public void write(){
        System.out.println("pencil writer");
    }
}
class Kit {
    public void doSomething(Writer p){
        p.write();
    }
}
public class AbstractDemo {
    public static void main(String []args){
        Kit k = new Kit();
        Writer p = new Pen();
        Writer pc = new Pencil();

        k.doSomething(p);
        k.doSomething(pc);
    }
}
