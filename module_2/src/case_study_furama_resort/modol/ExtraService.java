package case_study_furama_resort.modol;


public class ExtraService {
    private String extraServiceName;
    private String unit;
    private double money;

    public ExtraService(String extraServiceName , String unit, double money) {
        this.extraServiceName = extraServiceName;
        this.unit = unit;
        this.money = money;
    }
}
