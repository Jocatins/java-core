public class ExceptionDemo {
    public static void main(String[] args) {

        try{
            int a[] = new int[5];
            a[3] = 4;
            int i = 9;
            int k = 0;
            int j = i/k;
            System.out.println("output is " + j);
        }
        catch(Exception ex){
            System.err.println("Exception err " + ex);
        }
        finally{
            System.out.println("end of code execution");
        }
    }
}
