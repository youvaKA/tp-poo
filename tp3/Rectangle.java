public class Rectangle {
    
    private double Longueure;
    private double Largeure;
    public Rectangle (final double Longueure, final double Largeure){
            this.Largeure=Largeure;
            this.Longueure=Longueure;
    }

    public double GetLongueure(){
        return this.Longueure;
    }

    public double Getlargeure(){
        return this.Largeure;
    }

    public double perimetre(){
        return (this.Largeure+this.Longueure)*2;
    }

    public double aire (){
        return ((this.Longueure * this.Largeure)*2);

    }

    public boolean isCarre(){
        return (this.Largeure == this.Longueure);
    }

    public boolean sameObject(Rectangle A){ 
        return (this.Longueure == A.GetLongueure()) && (this.Longueure == A.Getlargeure());
    }

    public String toString(){
        return ("Ce triangle à pour longueure:"+this.Longueure+"cm et pour largeure: "+this.Largeure+ "cm, sont aire est de :"+ this.aire()+ "cm², et sont périmètre est de " + this.perimetre());
    }

public static void main(String[] args) {
    Rectangle rec1 = new Rectangle(4,6);
    Rectangle rec2 = new Rectangle(5,5);

        System.out.println(rec1.toString());
        System.out.println(rec2.toString());

        if(rec1.equals(rec2)){
            System.out.println("les 2 rectangles sont identiques");
        }
        else{
        System.out.println("les 2 réctangles ne sont pas identiques");
        }

        if(rec1.isCarre()){
            System.out.println("Le Rectangle 1 est un carré");
        }
        else{
            System.out.println("le Rectangle 1 n'est un pas carré");
        }
        if(rec2.isCarre()){
            System.out.println("Le Rectangle 2 est un carré");
        }
        else{
            System.out.println("le Rectangle 2 n'est un pas carré");
        }
}
}   
