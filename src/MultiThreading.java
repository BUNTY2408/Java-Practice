

class Thread1 extends Thread
{
    @Override
    public void run()
    {
        System.out.println("Thread1 Running");
    }
}

class Thread2 extends Thread
{
    @Override
    public void run()
    {
        System.out.println("Thread2 Running");
    }
}


public class MultiThreading {

    public static void main(String[] args)
    {
        Thread1 t1=new Thread1();
        Thread2 t2=new Thread2();

        t1.start();
        t2.start();
    }

}
