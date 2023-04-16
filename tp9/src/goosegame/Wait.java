package goosegame;

public class Wait extends BaseCell{

    private int waitTime;
    private final int waitTimeduration;

    public Wait(int ind,int wait){
      super(ind);
      this.waitTimeduration = wait;
      this.waitTime = wait;
    }


    /**
   * The player can be left the cell, 
   * @return true if the player can leave the cell, when the waittime is at 0
   */
    public boolean CanbeLeft(){
      return this.waitTime==0;
    }


    /**
   * @return true if the cell can be jump
   */
    public boolean isJumpCell(){
      return this.isJumpCell;
    }

    
    /**
     * @param index of the cell 
     * @return index of this cell
     */
    public int jump(int x){
      return this.index;
    }

        /**
   * @return Returns the index of the cell, the place in the board
   */
    public int getIndex(){
      return this.index;
    }


     /**
   * @return the player on this cell
   */
    public Player getPlayer(){
      return this.player;
    }

        /** Check if the cell is occupied
   * @return true if the cell is occupied
   */
    public boolean isBusy(){
      return this.getPlayer()!=null;
    }

        /** Welcomes a player on the cell */
    public void welcomeplayer(Player player2){
      this.player = player2;
      this.waitTime = this.waitTimeduration;
  }


    /** The player  leave the cell */
    public void leave(){
      this.player = null;
    }

        /**
   * @return the index of the player's next cell
   */
    public int handleMove(int x){
      return this.getIndex() + x;
    }

     /**
   * @return the type of the cell, a wait Cell
   */
    public String cellType(){
      return "(wait)" ;
    }

    public String toString(){
      this.waitTime = this.waitTime -1;
      return " couldn't play this turn and is wainting for " + this.waitTime + " more turn , in cell " + this.index ;
    }
}
