package image.color;
public class GrayColor{
    public static final GrayColor WHITE = new GrayColor(255);
    public static final GrayColor BLACK = new GrayColor(0);
    private final int grayLevel;
    private double alpha;
    
    /**
     * Constructor
     * @param level Color
     */
    public GrayColor(int level){
        if(level > 255){
            this.grayLevel = 255;
        }
        else{
        this.grayLevel = level;
        }
        this.alpha = 1;
        
    }
    
    /**
     *  Return the Color
     * @return Color
     */
    public int getGrayLevel(){
        return this.grayLevel;
    }
    
    /**
     *  Return alpha
     * @return alpha
     */
    public double getAlpha(){
        return this.alpha;
    }
    
    /**
     * this method change alpha value
     * @param a new alpha
     */
    public void setAlpha(double a){
        this.alpha = a;
    }
    
    /**
     * Method equals
     * @param o  compare object
     * @return true if the colors are equals, else false
     */
    public boolean equals(Object o){
        if (o instanceof GrayColor){
            GrayColor other = (GrayColor) o;
            return (this.grayLevel==other.grayLevel && this.alpha==other.alpha);
        }
        else{
            return false;
        }
    }
    
}
  
        

