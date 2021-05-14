package case_study_furama_resort.modol;
public class Room extends Services {
    private String complimentary;

    public Room() {
    }

    public Room(String complimentary) {
        this.complimentary = complimentary;
    }

    public Room(String id, String serviceName, float areaUsing, double rentalFee, int maxOccupancy, String typeRental, String complimentary) {
        super(id, serviceName, areaUsing, rentalFee, maxOccupancy, typeRental);
        this.complimentary = complimentary;
    }


    public String getComplimentary() {
        return complimentary;
    }

    public void setComplimentary(String complimentary) {
        this.complimentary = complimentary;
    }

    @Override
    public String showInfor() {
        return "---------------------ROOM-----------------" +
                super.toString() +
                "\nComplimentary: " + complimentary;
    }

}