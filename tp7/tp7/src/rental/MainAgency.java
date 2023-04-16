package rental;

/**
 * The Main of this Project
 */
public class MainAgency {


    
    /**  Main methode 
     * @param args nothing here because we won't use the bash args in this main
     */
    public static void main(String[] args) {

        // Some Vehicles
        Vehicle someVehicle = new Vehicle("Renault", "Clio3", 2006, 80);
        Vehicle someVehicle1 = new Vehicle("Audi", "a3", 2015, 130);
        Vehicle someVehicle2 = new Vehicle("Vokswagen", "golf", 2017, 150);
        Vehicle someVehicle3 = new Vehicle("BMW", "520d", 2008, 220);
        Vehicle someVehicle4 = new Vehicle("opel", "Astra", 2012, 90);
        Vehicle someVehicle5 = new Vehicle("Vokswagen", "touareg", 2019, 450);
        // Some Cars
        Vehicle car1 = new Car("Audi", "R8", 2013, 790.0f, 2);
        Vehicle car2 = new Car("Mercedes", "C63", 2019, 800.0f, 5);
        Vehicle car3 = new Car("BMW", "M4", 2017, 820.0f, 4);
        // Some motos
        Vehicle moto1 = new Motorbike("Ninja", "R1", 2019, 80.0f, 250);
        Vehicle moto2 = new Motorbike("Kawasaki", "Z-1000", 2019, 120.0f, 600);

        // Some clients
        Client Remi = new Client("Remi", 21);
        Client youva = new Client("Youva", 23);
        Client samir = new Client("Samir", 33);
        Client lea = new Client("Léa", 18);
        // The Agency
        RentalAgency agency1 = new RentalAgency();
        
        // Add cars all vehicules to the agency
        agency1.addVehicle(someVehicle);
        agency1.addVehicle(someVehicle1);
        agency1.addVehicle(someVehicle2);
        agency1.addVehicle(someVehicle3);
        agency1.addVehicle(someVehicle4);
        agency1.addVehicle(someVehicle5);
        agency1.addVehicle(car1);
        agency1.addVehicle(car2);
        agency1.addVehicle(car3);
        agency1.addVehicle(moto1);
        agency1.addVehicle(moto2);

        System.out.println("Removing " + car1.toString() + " from the agency1.");
        try {
            agency1.removeVehicle(car1);// remove car1 from the agency
            System.out.println(car1.toString() + " has been removed");
        } catch (UnknownVehicleException e) {
            // if not removed
            System.out.println(e);
        }
        System.out.println("-------------------------------------");
        System.out.println("Mercedes Vehicles with a max price of 300: ");
        AndFilter andFilter = new AndFilter();
        andFilter.addFilter(new MaxPriceFilter(300));
        andFilter.addFilter(new BrandFilter("Mercedes"));
        agency1.displaySelection(andFilter);


        System.out.println("-------------------------------------");
        System.out.println("Renault Vehicles: ");
        BrandFilter renault = new BrandFilter("Renault");
        agency1.displaySelection(renault);

        System.out.println("-------------------------------------");
        // Remi tries to rent a Car
        System.out.println("New client " + Remi.toString());
        System.out.println("Remi wants to rent : " + car2.toString());
        try {
            System.out.println("Price : "+agency1.rentVehicle(Remi, car2)+"/day.");
            System.out.println(car2.toString() + " was rented successfully by Remi");
        } catch (IllegalStateException e) {
            System.out.println(e);
        } catch (UnknownVehicleException e) {
            System.out.println(e);
        }
        System.out.println("-------------------------------------");
        // Youva tries to rent a Car
        System.out.println("New client " + youva.toString());
        System.out.println("youva wants to rent : " + car1.toString());
        try {
            System.out.println("Price : "+agency1.rentVehicle(youva, car1)+"/day.");
            System.out.println(car1.toString() + " was rented successfully by youva");
        } catch (IllegalStateException e) {
            System.out.println(e);
        } catch (UnknownVehicleException e) {
            System.out.println(e);
        }
        System.out.println("-------------------------------------");
        // Samir tries to rent a Car
        System.out.println("New client " + samir.toString());
        System.out.println("samir wants to rent : " + car2.toString());
        try {
            
            System.out.println("Price : "+agency1.rentVehicle(samir, car2)+"/day.");
            System.out.println(car2.toString() + " was rented successfully by samir");
        } catch (IllegalStateException e) {
            System.out.println(e);
        } catch (UnknownVehicleException e) {
            System.out.println(e);
        }

        System.out.println("-------------------------------------");

        // a Suspicious agency
        SuspiciousRentalAgency agency2 = new SuspiciousRentalAgency();

        //adding vehicles to the suspicoius agency 
        agency2.addVehicle(someVehicle4);
        agency2.addVehicle(moto1);
        agency2.addVehicle(moto2);

        // Léa tries to rent a Car
        System.out.println("New client " + lea.toString());
        System.out.println("lea wants to rent : " + moto1.toString());
        try {
            System.out.println("Price : "+agency2.rentVehicle(lea, moto1)+"/day.");
        } catch (IllegalStateException e) {
            System.out.println(e);
        } catch (UnknownVehicleException e) {
            System.out.println(e);
        }

        
    }


}
