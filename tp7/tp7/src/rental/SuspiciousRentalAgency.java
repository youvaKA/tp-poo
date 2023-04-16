package rental;

/**
 * class that represents a Suspicious Rental Agency that is a child of the class Vehicle
 * this Rental Agency taxes you 10 percent of the price if you are under 26
 */
public class SuspiciousRentalAgency extends RentalAgency{


    private final float TEN_PERCENT = 1.10f;
    private final int AGE_MAX =25;
    /**
     * Constructor
     */
    public SuspiciousRentalAgency(){
        super();
    }
    
    /** client rents a vehicle  with taxes if he's under 26
    * @param client the renter
    * @param v the rented vehicle
    * @return the daily rental price for client for vehicle v
    * @exception UnknownVehicleException   if v is not a vehicle of this agency  
    * @exception IllegalStateException if v is already rented or client rents already another vehicle
    */
    @Override
    public float rentVehicle(Client client, Vehicle v) throws UnknownVehicleException, IllegalStateException {

    	if(client.getAge()<=AGE_MAX){
            return super.rentVehicle(client, v)*TEN_PERCENT; 
        }
        return super.rentVehicle(client, v);
    }


}
