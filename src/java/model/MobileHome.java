package model;

/**
 * Concrete class representing Mobile home (level 3)
 */
import java.util.UUID;

public class MobileHome extends Residential {

    private int parkingSlot = 0;

    /**
     * Simple constructor for MobileHome.
     * @param uuid UUID of the entry.
     * @param address address of property as String.
     * @param price price of property in int.
     */
    public MobileHome(UUID uuid, String address, int price) {
        super(uuid, address, price);
    }

    /**
     * Get the number of parking space.
     * @return parking space in int.
     */
    public int getHowManyParks() {
        return parkingSlot;
    }

    /**
     * Set the number of parking space.
     * @param howManyParks the number of parking spaces in int.
     */
    public void setHowManyParks(int howManyParks) {
        this.parkingSlot = howManyParks;
    }

}
