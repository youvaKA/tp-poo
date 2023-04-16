
package goosegame;

public class ClassicBoard extends Board {

  public ClassicBoard(int ind){
    this.nbOfCells = ind-1;
    this.theCells = new Cell[ind];
    this.theCells[0] = new StartCell();
    this.initBoard();
  }
  
  public void initBoard(){
    for (int i=1; i <= this.nbOfCells;i++){
      this.theCells[i] = new BaseCell(i);
    }
    for (int j=9; j <= 54; j=j+9){
      this.theCells[j] = new Goose(j);
    }
    this.theCells[20] = new Trap(31);
    this.theCells[19] = new Trap(52);
    this.theCells[20] = new Wait(19,2);
    this.theCells[6] = new Jump(6,12);
    this.theCells[42] = new Jump(42,30);
    this.theCells[58] = new Jump(58,1);
  }


}
