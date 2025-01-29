//class Counter
//{
//   private int c=0;
//   public synchronized void inc()
//   {
//       c++;
//   }
//   public synchronized int get()
//   {
//       return c;
//   }
//}



class Balance
{
    private int balance=1000;
    public synchronized void deposit(int amount)
    {
        balance+=amount;
        System.out.println("Deposited :" + amount +"--->" + "Balance :"+ balance);
    }
    public synchronized void withdrawal(int amount)
    {
        if(balance>=amount)
        {
            balance-=amount;
            System.out.println("Withdrawal :" + amount +"--->" + "Balance :"+ balance);
        }
        else {
            System.out.println("The amount is not allowed to withdraw");
        }
    }
    public int get()
    {
        return balance;
    }
}

public class Main {
    public static void main(String[] args) {

        //Counter c=new Counter();

        Balance b=new Balance();

        Thread t1 =new Thread(()->
                {
        for (int i = 0;i < 3;i++)
        {
            b.deposit(200);
            try
            {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
                });
        Thread t2=new Thread(()->
                {
                        for(int i=0;i<3;i++)
                        {
                           b.withdrawal(100);
                           try
                           {
                               Thread.sleep(100);
                           } catch (InterruptedException e) {
                               throw new RuntimeException(e);
                           }
                        }
                }
        );

        t1.start();
        t2.start();

        try
        {
            t1.join();
            t2.join();
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }

        System.out.println("Final Balance is "+b.get());
    }
}