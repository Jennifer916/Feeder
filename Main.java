public class Main 
{ 
    public static void main (String [] args)
    {
        Feeder f = new Feeder ();
         System.out.println("f");
         //System.out.println(f.currentFood);
         System.out.println(f.getcurrentFood());
         Feeder g=new Feeder(500);
         int random = (int) (Math.random() * 40 + 10); 
         System.out.println(random);
         System.out.println(Math.random() < 0.05);
    }
}