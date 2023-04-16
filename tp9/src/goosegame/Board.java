package goosegame;

abstract public class Board {

  /** the nmber of cell in this board */
  protected int nbOfCells;
  /** the list of cell in this board */
  protected Cell[] theCells;

  abstract protected void initBoard();


  /** 
   * @param i the index of cell
   * @return the cell passed from list to place i
   */
  public Cell getCell(int i){
    return this.theCells[i];
  }

  /**  Replace cell in place i by another
   * @param index
   * @param cell
  */
  public void setCell(int i,Cell c){
    this.theCells[i] = c;
  }

  /**
   * @return the number ofcell in this board
   */
  public int getNbOfCells(){
    return this.nbOfCells;
  }
}
