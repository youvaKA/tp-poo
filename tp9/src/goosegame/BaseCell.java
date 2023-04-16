package goosegame;

/** A cell in the "jeu de l'oie" */
public class BaseCell implements Cell{

  /** the index of the cell*/
  protected int index;
  /** The player on this cell*/
  protected Player player;
  /**  */
  protected boolean isJumpCell;

  public BaseCell(int ind){
    this.index = ind;
    this.player = null;
    this.isJumpCell = false;
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
   * @parm int 
   * @return the index of this cell
   */
  public int jump(int x){
    return this.index;
  }

  /**
   * @return the index of the player's next cell
   */
  public int handleMove(int x){
    return this.getIndex() + x;
  }

  /**
   * @return the type of the cell, a basic Cell
   */
  public String cellType(){
    return "" ;
  }

  public String toString(){
    return "";
  }

  /**
   * this cell is equals to another if they have same index, player, JumpCell
   * @see java.lang.Object#equals(java.lang.Object)
   */
  public boolean equals(Object o){
    if (!(o instanceof BaseCell))
        return false;
    else{
        BaseCell other = (BaseCell) o;
        return  this.index == other.index &&  this.player == other.player && this.isJumpCell == other.isJumpCell;
      }
  }

}
