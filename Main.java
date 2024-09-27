public class Main 
{ 
    public static void main (String [] args)
    {
        Feeder f = new Feeder ();
        //System.out.println(f.currentFood);
         System.out.println(f.getcurrentFood());
         Feeder g=new Feeder(500);
         System.out.println(g.getcurrentFood());
        Feeder a=new Feeder (1000);
        a.simulateOneDay(22);
        System.out.println(a.getcurrentFood());
         Feeder b=new Feeder(100);
         b.simulateOneDay(5);
         System.out.println(b);
         Feeder d=new Feeder (2400);
         d.simulateManyDays(10,4);
         System.out.println(d);
         Feeder e= new Feeder(250);
         e.simulateManyDays(10,5);
         System.out.println(e);
         Feeder w= new Feeder (0);
         w.simulateManyDays(5, 10);
         System.out.println(w);
    }
        
}