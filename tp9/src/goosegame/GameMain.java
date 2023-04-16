package goosegame;

public class GameMain {

 public static void main(String[] args) {
   ClassicBoard board = new ClassicBoard(64);
   Game partie = new Game(board);
   Player player1 = new Player("Youva",board.getCell(0));
   Player player2 = new Player("Chacher",board.getCell(0));
   Player player3 = new Player("Frank",board.getCell(0));
   partie.addPlayer(player1);
   partie.addPlayer(player2);
   partie.addPlayer(player3);
   partie.play();
 }

}
