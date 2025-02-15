package mls.server_property.domain;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.persistence.*;
import java.sql.Date;

@MappedSuperclass
public abstract class Condominium extends Residential {
    @Column(name = "unitNumber")
    private int unitNumber;

    protected Condominium(){super();}

    @JsonCreator
    public Condominium(@JsonProperty("id") Long id, @JsonProperty("address") String address,
                       @JsonProperty("price") int price, @JsonProperty("no_parking_space") int nOfParkingSpace,
                       @JsonProperty("storage_type") String storageType, @JsonProperty("no_storage") int nOfStorages,
                       @JsonProperty("build_date") Date builtDate, @JsonProperty("unit_No") int unitNumber) {
        super(id, address, price, nOfParkingSpace, storageType, nOfStorages, builtDate);
        this.unitNumber = unitNumber;
    }

    /**
     * Abstract method to be completed in subclass to return ownership type as a string
     * @return the type of ownership as a string
     */
    @Override
    public String getOwnership() {
        return "Condominium";
    }

    /**
     * Get unit number of the condominium type property
     * @return unit number of condominium type property
     */
    public int getUnitNumber() {
        return unitNumber;
    }

    /**
     * Set unit number of the condominium type property
     * @param unitNumber unit number of condominium type property
     */
    public void setUnitNumber(int unitNumber) {
        this.unitNumber = unitNumber;
    }


    /**
     * Override equals() method. Evaluate objects' equality using attribute values.
     * For simplification, it is assumed that same address and unit number represents same property.
     * @param o other Object for comparison
     * @return a boolean value "true" if specified attribute values are same, otherwise "false"
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Condominium other = (Condominium) o;
        return this.getAddress().equals(other.getAddress())
                && this.getUnitNumber() == other.getUnitNumber();
    }

    /**
     * Override superclass's toString() method. Create a string representation of current class
     * @return the string representation of current class
     */
    @Override
    public String toString() {
        return  super.toString() + ", unitNumber=" + unitNumber;
    }

}
