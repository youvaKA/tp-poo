package displayer;

public class DisplayerMain {

   private static String msg = "AbcdEFGH";
   private static int nbTop = 5;


   private static void handleArgs(String[] args) {
      if (args.length > 0) {
         msg = args[0];
      }
      if (args.length > 1) {
	  try {
	      nbTop = Integer.parseInt(args[1]);
	  } catch(NumberFormatException e) {
	      System.out.println(" mauvais format, nb tops = " + DisplayerMain.nbTop);
	      }
      }

   }

    
   public static void main(String[] args) {

      System.out.println("\n*********************************\n");
      System.out.println("DisplayerController(5)");
      System.out.println("\n*********************************\n");
      DisplayerMain.handleArgs(args);
      DisplayerController c = new DisplayerController(new LedDisplayer(5));
      c.tryIt(msg, nbTop);

      System.out.println("\n*********************************\n");
      System.out.println("DisplayerWithLatency(5,3)");
      System.out.println("\n*********************************\n");
      c.changeDisplayer(new DisplayerWithLatency(5, 3));
      c.tryIt(msg, nbTop);
      
      System.out.println("\n*********************************\n");
      System.out.println("SpeedDisplayer(5,3,2)");
      System.out.println("\n*********************************\n");
      c.changeDisplayer(new SpeedDisplayer(5, 3, 2));
      c.tryIt(msg, nbTop);
      
      System.out.println("\n*********************************\n");
      System.out.println("LeftRightDisplayer(5)");
      System.out.println("\n*********************************\n");
      c.changeDisplayer(new LeftRightDisplayer(5));
      c.tryIt(msg, nbTop);

   }

}
