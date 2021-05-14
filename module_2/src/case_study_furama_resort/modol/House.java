package case_study_furama_resort.modol;
public class House extends Services {
    private String roomStandard;
    private String facilites;
    private int numberOfFloor;

    public House() {
    }


    public House(String roomStandard, String facilites, int numberOfFloor) {
        this.roomStandard = roomStandard;
        this.facilites = facilites;
        this.numberOfFloor = numberOfFloor;
    }

    public House(String id, String serviceName, float areaUsing, double rentalFee, int maxOccupancy, String typeRental, String roomStandard, String facilites, int numberOfFloor) {
        super(id, serviceName, areaUsing, rentalFee, maxOccupancy, typeRental);
        this.roomStandard = roomStandard;
        this.facilites = facilites;
        this.numberOfFloor = numberOfFloor;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public String getFacilites() {
        return facilites;
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

    public void setnumberOfFloor(int numberOfFloor) {
        this.numberOfFloor = numberOfFloor;
    }

    @Override
    public String showInfor() {
        return this.toString();
    }

    @Override
    public String toString() {
        return "-----------------HOUSE------------------" +
                super.toString() +
                "\nRoom Standard: " + roomStandard
                + "\nFacilities: " + facilites
                + "\nNumber of Floor: " + numberOfFloor;
    }

}