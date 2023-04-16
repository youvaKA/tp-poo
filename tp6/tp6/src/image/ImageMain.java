package image;
import image.color.GrayColor;
import image.util.ImageDisplayer;
import image.util.ImageLoader;

public class ImageMain {

    public static void main(String[] args) throws UnknownPixelException{
        
      if (args.length != 3)
          throw new UnknownPixelException("without parameter");
        
      ImageDisplayer displayer = new ImageDisplayer();
        
      Image image = new Image(200,150);
      image.fillRectangle(20, 30, 30, 50 , GrayColor.BLACK);
      GrayColor gris128 = new GrayColor(128);
      image.fillRectangle(50, 100, 40, 40, gris128);
      GrayColor gris200 = new GrayColor(200);
      image.fillRectangle(90, 20, 70, 50, gris200);
      displayer.display(image, "Rectangle",0, 300);



      String imagePath = args[0];
      int threshold = Integer.parseInt(args[1]);
      int nbGrayLevels = Integer.parseInt(args[2]);
      Image img = ImageLoader.loadPGM(imagePath);
      displayer.display(img, "img",0, 0);
      displayer.display(img.edges(threshold), "img edges",500, 0);
      displayer.display(img.decreaseNbGrayLevels(nbGrayLevels), "img graylevel",1000,0);



  }
}
