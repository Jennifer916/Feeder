public class Main 
{ 
    public static void main (String [] args)
    {
        Feeder f = new Feeder ();
         System.out.println("f");
         //System.out.println(f.currentFood);
         System.out.println(f.getcurrentFood());
         Feeder g=new Feeder(500);
         System.out.println(g.getcurrentFood());
         System.out.println(Math.random() < 0.05);
         g.simulateOneDay(12);
         System.out.println(g.getcurrentFood());
        Feeder a=new Feeder (1000);
        a.simulateOneDay(22);
        System.out.println(a.getcurrentFood());
         Feeder b=new Feeder(100);
         b.simulateOneDay(5);
         System.out.println(b.getcurrentFood());
         Feeder d=new Feeder (2400);
         d.simulateManyDays(10,4);
         System.out.println(d.getcurrentFood());
         Feeder e= new Feeder(250);
         e.simulateManyDays(10,5);
         System.out.println(e.getcurrentFood());
    }
        
}