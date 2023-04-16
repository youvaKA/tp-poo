package goosegame;
import java.util.*;

public class Game {

  protected Collection<Player> thePlayers;
  protected Board board;
  protected Player winner;

  public Game(Board board){
    this.board = board;
    this.thePlayers = new ArrayList<Player>();
    this.winner = null;
  }

  public Collection<Player> getAllPlayer(){
    return this.thePlayers;
  }

  public void addPlayer(Player player){
    this.thePlayers.add(player);
  }

  public void switche(Player player1, Player player2){
    Cell c1 = player1.getCell();
    Cell c2 = player2.getCell();
    player1.setCell(c2);
    player2.setCell(c1);
  }


  public void movePlayer(Player p){
    int de = p.twoDiceThrow();

    Cell position = this.board.getCell(p.getCell().getIndex());
    int nbPosition = p.getCell().getIndex();
    int nbNextPosition = p.getCell().getIndex()+ de;

    if(nbNextPosition == this.board.getNbOfCells()){ // Sur la derniere case
      this.winner = p;
      position.leave();
      p.setCell(this.board.getCell(position.handleMove(de)));
      this.board.getCell(nbNextPosition).welcomeplayer(p);

      System.out.println(p.toString() + " is in cell " + nbPosition + ", " + p.toString() +" throws "+ de +" and reaches cell " + nbNextPosition );
      System.out.println(p.toString() + " has won ");
      System.out.println("----------------------------GAME OVER----------------------------");
    }

    else if (nbNextPosition > this.board.getNbOfCells()) { // Case depassée
      int nb = (this.board.getNbOfCells()-(de - (this.board.getNbOfCells()-nbPosition)));
      position.leave();
      Cell dest = this.board.getCell(nb);
      if (dest.isBusy()){
        Player monsieur = dest.getPlayer();
        this.switche(p,monsieur);
        position.welcomeplayer(monsieur);
        System.out.println(p.toString() + " is in cell " + nbPosition + ", " + p.toString() +" throws "+ de + "  "+ p.toString() + " went beyond finish line and is now in cell " + p.getCell().getIndex() + " cell is busy , " + monsieur.toString() + " is sent to cell " + nbPosition + dest.cellType());
        dest.welcomeplayer(p);
      }
      else if (dest.isJumpCell()) {
          if (dest.jump(de)>this.board.getNbOfCells()){
            Cell dest2 = this.board.getCell(this.board.getNbOfCells()-(de - (this.board.getNbOfCells()-dest.getIndex())));
            p.setCell(dest2);
            System.out.println(p.toString() + " is in cell " + nbPosition + ", " + p.toString() +" throws "+ de + "  "+ p.toString() + " went beyond finish line went back and hit the special cell "+ dest.cellType() + " " + dest.getIndex() + " went behind the finish line again " + " and is now in cell " + p.getCell().getIndex() + dest2.cellType());
            dest2.welcomeplayer(p);
          }
          else if (dest.jump(de)==this.board.getNbOfCells()){
            this.winner = p;
            Cell dest2 = this.board.getCell(this.board.getNbOfCells());
            p.setCell(dest2);
            this.board.getCell(nbNextPosition).welcomeplayer(p);

            System.out.println(p.toString() + " is in cell " + nbPosition + ", " + p.toString() +" throws "+ de +" went behind the finish line came back and bounced on cell" + dest.getIndex() + dest.cellType() +" and arrived on the finished line");
            System.out.println(p.toString() + " has won ");
            System.out.println("----------------------------GAME OVER----------------------------");
          }
          else {
            Cell dest2 = this.board.getCell(dest.jump(de));
            p.setCell(dest2);
            System.out.println(p.toString() + " is in cell " + nbPosition + ", " + p.toString() +" throws "+ de + "  "+ p.toString() + " went beyond finish line went back and hit the special cell "+ dest.cellType() + " " + dest.getIndex() + " and is now in cell " + p.getCell().getIndex() + dest2.cellType());
            dest2.welcomeplayer(p);
          }

      }
      else {
        p.setCell(dest);
        System.out.println(p.toString() + " is in cell " + nbPosition + ", " + p.toString() +" throws "+ de + "  "+ p.toString() + " went beyond finish line and is now in cell " + p.getCell().getIndex() + dest.cellType());
        dest.welcomeplayer(p);
      }
    }

    else { // si pas sur la derniere case ou derriere
      position.leave();
      Cell dest = this.board.getCell(nbNextPosition);
      if (dest.isBusy()){
        Player monsieur = dest.getPlayer();
        this.switche(p,monsieur);
        position.welcomeplayer(monsieur);

        System.out.println(p.toString() + " is in cell " + nbPosition + ", " + p.toString() +" throws "+ de +" and reaches cell " + nbNextPosition + " cell is busy , " + monsieur.toString() + " is sent to cell " + nbPosition + dest.cellType());
        dest.welcomeplayer(p);
      }
      else if (dest.isJumpCell()) {
        if (dest.jump(de)>this.board.getNbOfCells()){
          Cell dest2 = this.board.getCell(this.board.getNbOfCells()-(de - (this.board.getNbOfCells()-dest.getIndex())));
          p.setCell(dest2);
          System.out.println(p.toString() + " is in cell " + nbPosition + ", " + p.toString() +" throws "+ de + "  "+ p.toString() + " reached and hit the special cell "+ dest.cellType() + " " + dest.getIndex() + " went behind the finish line and is now in cell " + p.getCell().getIndex() + dest2.cellType());
          dest2.welcomeplayer(p);
        }
        else if (dest.jump(de)==this.board.getNbOfCells()){
          this.winner = p;
          Cell dest2 = this.board.getCell(this.board.getNbOfCells());
          p.setCell(dest2);
          this.board.getCell(nbNextPosition).welcomeplayer(p);

          System.out.println(p.toString() + " is in cell " + nbPosition + ", " + p.toString() +" throws "+ de +" bounced on cell" + dest.getIndex() + dest.cellType() +" and arrived on the finished line");
          System.out.println(p.toString() + " has won ");
          System.out.println("----------------------------GAME OVER----------------------------");
        }
        else {
          Cell dest2 = this.board.getCell(dest.jump(de));
          p.setCell(dest2);
          System.out.println(p.toString() + " is in cell " + nbPosition + ", " + p.toString() +" throws "+ de + "  "+ p.toString() + " reached and hit the special cell "+ dest.cellType() + " " + dest.getIndex() + " and is now in cell " + p.getCell().getIndex() + dest2.cellType());
          dest2.welcomeplayer(p);
        }
      }
      else {
        p.setCell(this.board.getCell(position.handleMove(de)));

        System.out.println(p.toString() + " is in cell " + nbPosition + ", " + p.toString() +" throws "+ de +" and reaches cell " + nbNextPosition + dest.cellType());
        dest.welcomeplayer(p);
      }
    }
  }

  public void playTurn(Player p){
    if(p.getCell().CanbeLeft()){
      this.movePlayer(p);
    }
    else{
      System.out.println(p.toString() + p.getCell().toString());
    }
  }

  public void play(){

    Iterator<Player> plo = this.thePlayers.iterator();
    Player pla = plo.next();
    System.out.println("----------------------------START----------------------------");

    while(this.winner==null){

      this.playTurn(pla);

      if (plo.hasNext()) // Vérifie qu'il y a toujours des joueurs
        pla = plo.next();
      else {
        plo = this.thePlayers.iterator();
        pla = plo.next();
    }
    }
  }
}

//System.out.println(p.toString() + " is in cell " + nbPosition + ", " + p.toString() +" throws "+ de + "  "+ p.toString() + " and reaches the special cell "+ dest.cellType() + " " + dest.getIndex() + " and is now in cell " + p.getCell().getIndex() + dest2.cellType());
