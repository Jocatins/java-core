interface IWriter {
    void write();
    // In interface, you cannot declare a public method only abstract methods

}
class Pens implements IWriter{
    public void write(){
        System.out.println("pen writer");
    }
}
class Pencils implements IWriter {
    public void write(){
        System.out.println("pencil writer");
    }
}
class Kits {
    public void doSomething(Writer p){
        p.write();
    }
}
public class Interface {
    public static void main(String []args){
        Kit k = new Kit();
        Writer p = new Pen();
        Writer pc = new Pencil();

        k.doSomething(p);
        k.doSomething(pc);
    }
}

