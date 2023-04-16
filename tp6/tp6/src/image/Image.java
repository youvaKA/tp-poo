package image;
import image.color.*;
public class Image implements ImageInterface{
    
    private Pixel[][] pixels;
    private int height;
    private int width;
    
    /** Constructor
     * @param width width
     * @param height  height
     */
    public Image(int width, int height){
        this.height = height;
        this.width = width;
        this.pixels= new Pixel[width][height];
        for (int i = 0;i<width;i++){
            for (int j = 0;j<height;j++){
                this.pixels[i][j] = new Pixel(GrayColor.WHITE);
            }
        }
    }
    /** return picture's width
     * @return picture's width
     */
    public int getWidth(){
        return this.width;
    }

    /** return picture's height
     * @return picture's height
     */
    public int getHeight(){
        return this.height;
    }
    /** this method change pixel's color on(x,y)
     * @param x coordinate horizontal
     * @param y coordinate vertical
     * @param color GrayColor type
     */
    public void changeColorPixel(int x, int y, GrayColor color){
        if (x > pixels.length || y > pixels[x].length)
            throw new UnknownPixelException("coordonnees n'exite pas");
        this.pixels[x][y].setColor(color);
    }
    /** return the pixel's coordinate on (x,y), with (0,0) top left
     * @param x  coordinate horizontal
     * @param y  coordinate vertical
     * @return return pixel's coordonate on (x,y)
     * @exception if (x,y) not exist
     */
    public Pixel getPixel(int x, int y) throws UnknownPixelException{
        try {
          return this.pixels[x][height-y-1];
        } catch (ArrayIndexOutOfBoundsException e) {
          throw new UnknownPixelException("coordonnees n'exite pas");
        }
    }
    
    /**
     * this method who designate a rectangle with height and width on coordinate (x,y)
     * @param x  coordinate horizontal
     * @param y  coordinate vertical
     * @param width l
     * @param height of the fillRectangle
     * @param color  new color for the Pixel
     */
    public void fillRectangle(int x, int y, int width, int height, GrayColor color){
        for(int i=x;i<x+width;i++){
            for(int j=y;j<y+height;j++){
                changeColorPixel(i,j,color);
            }
        }
    }
    /**
     * this method create new picture on initial picture base 
     * @param threshold
     * @return a new Image creat by "extraction de contours"
     */
    public Image edges(int threshold) {
        Image imagecopy = new Image(this.width, this.height);
        for (int i = 0; i < this.width - 1; i++) {
          for (int j = 0; j < this.height - 1; j++) {
            Pixel pixel = this.getPixel(i, j);
            Pixel pixel_y = this.getPixel(i, j + 1);
            Pixel pixel_x = this.getPixel(i + 1, j);
            if (pixel.colorLevelDifference(pixel_x) > threshold || pixel.colorLevelDifference(pixel_y) > threshold) {
                imagecopy.changeColorPixel(i, j, GrayColor.BLACK);
            } 
          }
        }
        return imagecopy;
      }

    /**
     * this method create new picture on initial picture base and gray level
     limitee, determine par nbGrayLevels.
     * @param nbGrayLevels Gray level
     * @return new picture
     */

    public Image decreaseNbGrayLevels(int nbGrayLevels){
        int t = 256/nbGrayLevels;
        Image ImageCopy = new Image(this.getWidth(),this.getHeight());
        for (int i=0; i<ImageCopy.width;i++){
            for (int j=0; j<ImageCopy.height;j++){
                int l = this.getPixel(i, j).getColor().getGrayLevel();
                int ke =(2*l-t)/2;
                int k=ke/t;
                GrayColor c = new GrayColor(k*t);
                ImageCopy.changeColorPixel(i, j, c);
            }
        }
        return ImageCopy;
    }
    


}
