package Collectionsjava.Deadlock;

public class DeadlockExample {
    public static void main(String[] args)
    {
        final String resource1="tom";
        final String resource2="jerry";
        Thread t1=new Thread()
        {
          public void run()
          {
              synchronized (resource1)
              {
                System.out.println("Hold by "+resource1);
                try
                {
                    Thread.sleep(150);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
                synchronized (resource2)
                {
                    System.out.println(resource2);
                }
              }
          }
        };
        Thread t2=new Thread()
        {
            public void run()
            {
                    synchronized (resource2)
                    {
                        System.out.println("Hold by "+resource2);
                        try
                        {
                            Thread.sleep(150);
                        } catch (Exception e) {
                            throw new RuntimeException(e);
                        }
                        synchronized (resource1)
                        {
                            System.out.println(resource1);
                        }
                    }
            }
        };
        t1.start();
        t2.start();
    }
}
