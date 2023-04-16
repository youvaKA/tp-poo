package goosegame;

public interface Cell{

  public boolean CanbeLeft();

  public int getIndex();

  public Player getPlayer();

  public boolean isBusy();

  public void welcomeplayer(Player player);

  public int handleMove(int x);

  public boolean isJumpCell();

  public int jump(int x);

  public void leave();

  public String cellType();

}