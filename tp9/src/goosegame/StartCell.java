package goosegame;

public class StartCell implements Cell{

    public StartCell(){
    }

    public boolean CanbeLeft(){
      return true;
    }

    public int getIndex(){
      return 0;
    }

    public Player getPlayer(){
      return null;
    }

    public boolean isBusy(){
      return true;
    }

    public void welcomeplayer(Player player){
    }

    public int handleMove(int x){
      return x;
    }

    public void leave(){
    }

    public boolean isJumpCell(){
      return false;
    }

    public String cellType(){
      return "(start)" ;
    }

    public int jump(int x){
      return 0;
    }
}
