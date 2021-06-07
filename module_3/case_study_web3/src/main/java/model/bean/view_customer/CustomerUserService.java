package model.bean.view_customer;

import model.bean.contract.ContractDetail;

public class CustomerUserService {
    private  int contractId;
    private int customerId;
    private  String customerName;
    private String serviceName;
    private  String contractStartDay;
    private  String contractEndDay;
    private String attachServiceName;

    public CustomerUserService() {
    }

    public CustomerUserService(int contractId, int customerId, String customerName, String serviceName, String contractStartDay, String contractEndDay) {
        this.contractId = contractId;
        this.customerId = customerId;
        this.customerName = customerName;
        this.serviceName = serviceName;
        this.contractStartDay = contractStartDay;
        this.contractEndDay = contractEndDay;
    }

    public CustomerUserService(int contractId, int customerId, String customerName, String serviceName, String contractStartDay, String contractEndDay, String attachServiceName) {
        this.contractId = contractId;
        this.customerId = customerId;
        this.customerName = customerName;
        this.serviceName = serviceName;
        this.contractStartDay = contractStartDay;
        this.contractEndDay = contractEndDay;
        this.attachServiceName = attachServiceName;
    }

    public String getAttachServiceName() {
        return attachServiceName;
    }

    public void setAttachServiceName(String attachServiceName) {
        this.attachServiceName = attachServiceName;
    }

    public int getContractId() {
        return contractId;
    }

    public void setContractId(int contractId) {
        this.contractId = contractId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getContractStartDay() {
        return contractStartDay;
    }

    public void setContractStartDay(String contractStartDay) {
        this.contractStartDay = contractStartDay;
    }

    public String getContractEndDay() {
        return contractEndDay;
    }

    public void setContractEndDay(String contractEndDay) {
        this.contractEndDay = contractEndDay;
    }
}
