package rental;
/**
 * class that represents a Car that is a child of the class Vehicle
 */
public class Car extends Vehicle{

    private int capacity;
    
	/**
	 * creates a car with given informations
	 * @param brand
	 *the car's brand
	 * @param model
	 *the car's model
	 * @param productionYear
	 *the car's production year
	 * @param dailyRentalPrice
	 *the daily rental price
	 * @param capacity
	 * the car's capacity
	 */

    public Car(String brand, String model, int productionYear, float dailyRentalPrice, int capacity) {
        super(brand, model, productionYear, dailyRentalPrice);
        this.capacity = capacity;
    }
    
    /** returns the capacity
     * @return int the capacity
     */
    public int getCapacity(){
        return this.capacity;
    }
    
    /**  the toString methode
     * @return String returns all the atributs values 
     */
    @Override
    public String toString(){
        return super.toString()+" "+this.capacity;
    }
    

}
