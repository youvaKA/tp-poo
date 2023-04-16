package displayer;


/**
 * 
 */

public class LedDisplayer {

   /**
     TODO
   */

    private int currentIdx;
    private int width;
    private String screen;
    private String message;


   public LedDisplayer(int width) {
       this.width = width;

   }
   
   /** get the (full) message of this displayer
    * @return the (full) message of this displayer
    */
   public String getMessage( ) {
       return this.message;
   }
   
  /**set the message 
  * @return void 
  */
   
   public void setMessage(String message) {      
       this.message = message;
       this.currentIdx = -1;
       StringBuffer sb = new StringBuffer();

       for (int i=0 ; i<this.width; i++){
           sb.append(" ");
       }
       this.screen = sb.toString();
   }


   public int getScreenWidth() {
       return this.width;
   }
   /**  shift message by one character  */
   public void shift() {
    this.currentIdx = (this.currentIdx +1)%this.message.length();
    this.screen = this.screen.substring(1) + this.message.charAt(this.currentIdx);
   }

   /** return the text that appears on the screen ,
   ∗it  is always composed of getScreenWidth() characters
   ∗@return the text that appears on the screen */
   
   public String textOnScreen() {
       return this.screen;
   }
}
