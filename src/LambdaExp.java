
public class LambdaExp {
    public static void main(String[] args)throws Exception {

        Thread t1 = new Thread(
                () ->
                {
                    for (int i = 1; i <= 5; i ++) {
                        System.out.println("Hi - " + + Thread.currentThread().getPriority());
                        try {Thread.sleep(1000);} catch(Exception e){}

                    }
                });
        Thread t2 = new Thread(
                () ->
                {
                    for (int i = 1; i <= 5; i ++) {
                        System.out.println("t2 Class - " + Thread.currentThread().getPriority());
                        try {Thread.sleep(1000);} catch(Exception e){}
                    }
                });
        Thread t3 = new Thread(
                () ->
                {
                    for (int i = 1; i <= 5; i ++) {
                        System.out.println("Sphinx thread - " + + Thread.currentThread().getPriority());
                        try {Thread.sleep(1000);} catch(Exception e){}
                    }
                });

        t1.start();
        try {Thread.sleep(10);} catch(Exception e){}
        t2.start();
        t3.start();

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.NORM_PRIORITY);

        t1.join();
        t2.join();
        t3.join();

        System.out.println("End of thread");

    }
}
