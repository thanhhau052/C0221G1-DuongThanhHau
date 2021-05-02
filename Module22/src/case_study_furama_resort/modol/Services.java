package case_study_furama_resort.modol;


public abstract class Services {
    private String id;
    private String serviceName;
    private float areaUsing;
    private double rentalFee;
    private int maxOccupancy;
    private String typeRental;

    public Services() {
    }

    public Services(String id, String serviceName, float areaUsing, double rentalFee, int maxOccupancy, String typeRental) {
        this.id = id;
        this.serviceName = serviceName;
        this.areaUsing = areaUsing;
        this.rentalFee = rentalFee;
        this.maxOccupancy = maxOccupancy;
        this.typeRental = typeRental;
    }

    public String getId() {
        return id;
    }

    public String getServiceName() {
        return serviceName;
    }

    public float getAreaUsing() {
        return areaUsing;
    }

    public double getrentalFee() {
        return rentalFee;
    }

    public int getmaxOccupancy() {
        return maxOccupancy;
    }

    public String getTypeRental() {
        return typeRental;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public void setAreaUsing(float areaUsing) {
        this.areaUsing = areaUsing;
    }

    public void setrentalFee(double rentalFee) {
        this.rentalFee = rentalFee;
    }

    public void setmaxOccupancy(int maxOccupancy) {
        this.maxOccupancy = maxOccupancy;
    }

    public void setTypeRental(String typeRental) {
        this.typeRental = typeRental;
    }

    public abstract String showInfor();

    public String toString() {
        return "\nID: " + id
                + "\nServiceName: " + serviceName
                +"\nArea Using: " + areaUsing
                + "\nRental Fee: " + rentalFee
                +"\nMax Occupancy: " + maxOccupancy
                +"\nType of Rental: " + typeRental;
    }
}