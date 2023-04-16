
public class Complexe{
    
private double reel;
private double imaginaire;

    public Complexe(double r,double im){
        this.reel = r;
        this.imaginaire = im;
    }

    public double realPart(){
        return this.reel;
    }

    public double imaginaryPart(){
        return this.imaginaire;
    }

    public boolean isReal(){
        return this.imaginaire==0;
    }

    public Complexe conjugate (){    
            return new Complexe(this.reel,-(this.imaginaire));
    }

    public double module(){
        double module = Math.sqrt(Math.pow(this.reel,2)+Math.pow(this.imaginaire,2));
        return module;
    }

    public Complexe add(Complexe c){
        double re=this.reel+c.reel;
        double im=this.imaginaire+c.imaginaire;
        return new Complexe(re,im);
    }

    public Complexe multi(Complexe c){
        double re=this.reel*c.reel;
        double im=this.imaginaire*c.imaginaire;
        return new Complexe(re,im);
    }

    public boolean equals(Complexe c){
        return(this.reel==c.reel)&&(this.imaginaire==c.imaginaire);
    }
    public String toString(){
        return ("le conjugue de : " + this.reel+" + "+this.imaginaire+"i");
    }
public static void main (String[] args){

 Complexe c1 = new Complexe(2,3);
 Complexe c2 = new Complexe(3,4);
 Complexe conjugC1 =c1.conjugate();
 Complexe conjugC2=c2.conjugate();
 Complexe somme=c1.add(c2);
 Complexe produit=c1.multi(c2);

 System.out.println("le conjugue de "+  c1.toString()+" est : "+conjugC1.toString());
 System.out.println("le conjugue de "+c2.toString()+" est : "+conjugC2.toString());
 System.out.println("la somme de  "+c1.toString()+" et  "+c2.toString()+" est : "+somme.toString());
 System.out.println("le produit de  "+c1.toString()+" et  "+c2.toString()+" est : "+produit.toString());
}
}
