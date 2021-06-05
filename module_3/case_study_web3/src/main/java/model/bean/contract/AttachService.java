package model.bean.contract;

public class AttachService {
    private  int attachServiceId;
    private  String attachServiceName;
    private  double attachServiceCost;
    private String attachServiceStatus;

    public AttachService() {
    }

    public AttachService(String attachServiceName, double attachServiceCost, String attachServiceStatus) {
        this.attachServiceName = attachServiceName;
        this.attachServiceCost = attachServiceCost;
        this.attachServiceStatus = attachServiceStatus;
    }

    public AttachService(int attachServiceId, String attachServiceName, double attachServiceCost, String attachServiceStatus) {
        this.attachServiceId = attachServiceId;
        this.attachServiceName = attachServiceName;
        this.attachServiceCost = attachServiceCost;
        this.attachServiceStatus = attachServiceStatus;
    }

    public AttachService(int id, String name, double cost, int unit, String status) {
    }

    public int getAttachServiceId() {
        return attachServiceId;
    }

    public void setAttachServiceId(int attachServiceId) {
        this.attachServiceId = attachServiceId;
    }

    public String getAttachServiceName() {
        return attachServiceName;
    }

    public void setAttachServiceName(String attachServiceName) {
        this.attachServiceName = attachServiceName;
    }

    public double getAttachServiceCost() {
        return attachServiceCost;
    }

    public void setAttachServiceCost(double attachServiceCost) {
        this.attachServiceCost = attachServiceCost;
    }

    public String getAttachServiceStatus() {
        return attachServiceStatus;
    }

    public void setAttachServiceStatus(String attachServiceStatus) {
        this.attachServiceStatus = attachServiceStatus;
    }
}
