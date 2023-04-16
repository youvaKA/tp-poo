package image;

import image.color.GrayColor;

public class Pixel {

    private GrayColor color;

    public Pixel(GrayColor color){
        this.setColor(color);
    }

    public GrayColor getColor() {
        return color;
    }

    public void setColor(GrayColor color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Object){
            Pixel other = (Pixel) o;
            return this.color.equals(other.color);
        }else{
            return false;
        }
    }

    public int colorLevelDifference(Pixel p){
        return Math.abs(this.getColor().getGrayLevel()-p.getColor().getGrayLevel());
    }

}