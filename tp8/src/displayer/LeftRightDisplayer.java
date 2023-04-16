package displayer;

public class LeftRightDisplayer extends LedDisplayer{

  public LeftRightDisplayer(int width) {
    super(width);
  }

  public void shift() {
    this.currentIdx = (this.currentIdx +1)%this.message.length();
    this.screen = this.message.charAt(this.currentIdx) + this.screen.substring(0,this.width-1);
   }
}
