package case_study_furama_resort.modol;


public class Villa extends Services {
    private String roomStandard;
    private String facilites;
    private float areaSwimmingPool;
    private int numberOfFloor;

    public Villa() {
    }

    public Villa(String roomStandard, String facilites, Float areaSwimmingPool, int numberOfFloor) {
        this.roomStandard = roomStandard;
        this.facilites = facilites;
        this.areaSwimmingPool = areaSwimmingPool;
        this.numberOfFloor = numberOfFloor;
    }

    public Villa(String id, String serviceName, float areaUsing, double rentalFee, int maxOccupancy, String typeRental, String roomStandard, String facilites, Float areaSwimmingPool, int numberOfFloor) {
        super(id, serviceName, areaUsing, rentalFee, maxOccupancy, typeRental);
        this.roomStandard = roomStandard;
        this.facilites = facilites;
        this.areaSwimmingPool = areaSwimmingPool;
        this.numberOfFloor = numberOfFloor;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public String getFacilites() {
        return facilites;
    }

    public Float getAreaSwimmingPool() {
        return areaSwimmingPool;
    }

    public int getnumberOfFloor() {
        return numberOfFloor;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public void setFacilites(String facilites) {
        this.facilites = facilites;
    }

    public void setAreaSwimmingPool(float areaSwimmingPool) {
        this.areaSwimmingPool = areaSwimmingPool;
    }

    public void setnumberOfFloor(int numberOfFloor) {
        this.numberOfFloor = numberOfFloor;
    }

    @Override
    public String showInfor() {
        return "***************** VILLA *****************" + super.toString() +
                "\nRoomStandard: " + roomStandard
                + "\nFacilities: " + facilites
                + "\nArea of SwimmingPool: " + areaSwimmingPool
                + "\nNumber of Floor: " + numberOfFloor;
    }
}