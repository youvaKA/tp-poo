package rental;

public class Motorbike extends Vehicle{

private int cylindre;

public Motorbike(String brand, String model, int productionYear, float dailyRentalPrice, int cylindre) {
    super(brand, model, productionYear, dailyRentalPrice);
    this.cylindre = cylindre ;
    }

public String toString(){
    return super.toString() + " " + this.cylindre;
    }
}
