import java.lang.management.ThreadInfo;

/**
 * An Hotel has a name and some rooms continuously numbered from 1
 *
 */
public class Hotel {

   private final String name;
   private final Status status;
   private Room[] rooms;
   
   /** build an Hotel with given name, status and number of rooms
    * @param name this hotel name
    * @param status this hotel status
    * @param numberOfRooms number of rooms of this hotel
    */
    public Hotel(String name, Status status, int numberOfRooms) {
        this.name = name;
        this.status = status;
        
        this.rooms = new Room[numberOfRooms]; // Création d'un tableau pour stocker les chambres
        for (int i = 0; i < this.rooms.length ; i++){//Création des chambres 
          this.rooms[i] = new Room(i+1);
        }
     }

    /** return this hotel name
    * @return this hotel name
    */
   public String getName() {
      return this.name;
   }
   /** this hotel status
    * @return this hotel status
    */
   public Status getStatus() {
      return this.status;
   }

   /**  return the number of rooms for this hotel
    * @return the number of rooms for this hotel
    */
   public int numberOfRooms() {
       // TODO
      return this.rooms.length;
   }
   
   /** provide the room corresponding to given number, first room has number 1, 
    * number must not be greater than <code>this.numberOfRooms()</code>
    * @param number number of the room, from 1 to this.numberOfRooms()
    * @return the room with given number
    */

   /** provide the room corresponding to given number, first room has number 1, 
    * number must not be greater than <code>this.numberOfRooms()</code>
    * @param number number of the room, from 1 to this.numberOfRooms()
    * @return the room with given number
    */
    public Room getRoom(int number) {
        // TODO
        return this.rooms[number-1];
   }
      
   /**  allows you to rent a room
    * @return rent the room wo we guve number
    * @param number rent the room wo we give number, from 1 to this.numberOfRooms()
    */
    public Room rentRoom(int number) {
        if (number > this.numberOfRooms() || number <= 0  || this.rooms[number - 1].isRent()){
             return null;
        }
        this.rooms[number - 1].rent();
        return this.rooms[number - 1];
 
    }
   
   /** 
    * leave room, 
    *@param number leave the room wo we give number
    */

   public void leaveRoom(int number) {
       if (this.rooms[number -1 ].isRent()){
           this.rooms[number - 1].free();
       }
   }
   
   
   /** 
    * return how many free room are in this hotel
    *@return the nulber of free room
    */
   public int numberOfFreeRooms() {
       int nbr = 0;
        for (int i = 0; i < this.numberOfRooms(); i++){
            if (!this.rooms[i].isRent()){
                nbr++;
            }
        }
        return nbr;
   }   
   
   /** 
    * return the firste free room int he hotel
    *@return the nulber of the firste free room int he hotel
    */
   public int firstFreeNumber() {
       for(int i=0; i< this.rooms.length; i++){
            if (this.rooms[i].isRent() == false){
                return i + 1;
            }
       }
       return 0;
   }
}