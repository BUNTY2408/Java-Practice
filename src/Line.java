class Point
{
    synchronized public void getPoint()
    {
        for(int i=0;i<3;i++) {
            System.out.println("Printing : "+i);
            try
            {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class Train extends Thread
{
    Point p;
    Train(Point p)
    {
        this.p=p;
    }
    @Override
    public void run()
    {
        p.getPoint();
    }
}

public class Line {
    public static void main(String[] args)
    {
      Point p=new Point();
      Train t1=new Train(p);
      Train t2=new Train(p);

      t1.start();
      t2.start();

    }
}
