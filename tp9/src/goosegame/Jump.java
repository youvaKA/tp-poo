package goosegame;

public class Jump extends BaseCell{

  /** the index of the cell */
    private int jump;

    public Jump(int ind,int jump){
      super(ind);
      this.isJumpCell = true;
      this.jump = jump;
    }

    /**
   * The player can be left the cell 
   * @return true if the player can leave the cell
   */
    public boolean CanbeLeft(){
      return true;
    }

    /**
   * @return true if the cell can be jump
   */
    public boolean isJumpCell(){
      return this.isJumpCell;
    }

    /**
     * @param index of the cell where the player teleports
     * @return the the index of the cell
     */
    public int jump(int x){
      return this.jump;
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
   * @return the type of the cell, a jump Cell
   */
    public String cellType(){
      return "(jump)" ;
    }

    public String toString(){
      return "(teleport)";
    }
}
