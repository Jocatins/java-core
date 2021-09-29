public class ExceptDemo {
    public static void main(String[] args) {
        int x = 9;
        int y = 10;
        try{
            int z = x/y;
            if (z == 0)
                throw new SphinxException("sphinx error");
        }
        catch(SphinxException ex){
            System.err.println("Error " + ex.getMessage());
        }

    }
}
