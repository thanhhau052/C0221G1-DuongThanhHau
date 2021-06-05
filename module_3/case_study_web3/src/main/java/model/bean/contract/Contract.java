package model.bean.contract;

import model.bean.customer.Customer;
import model.bean.employee.Employee;
import model.bean.service.Service;

public class Contract {
    private int contractId;
    private String contractStartDate;
    private String contractEndDate;
    private double deposit;
    private double totalMoney;
    private Employee employeeId;
    private Customer customersId;
    private Service serviceId;

    public Contract() {
    }

    public Contract(int contractId, String contractStartDate, String contractEndDate, double deposit, double totalMoney, Employee employeeId, Customer customersId, Service serviceId) {
        this.contractId = contractId;
        this.contractStartDate = contractStartDate;
        this.contractEndDate = contractEndDate;
        this.deposit = deposit;
        this.totalMoney = totalMoney;
        this.employeeId = employeeId;
        this.customersId = customersId;
        this.serviceId = serviceId;
    }

    public Contract(String contractStartDate, String contractEndDate, double deposit, double totalMoney, Employee employeeId, Customer customersId, Service serviceId) {
        this.contractStartDate = contractStartDate;
        this.contractEndDate = contractEndDate;
        this.deposit = deposit;
        this.totalMoney = totalMoney;
        this.employeeId = employeeId;
        this.customersId = customersId;
        this.serviceId = serviceId;
    }

    public int getContractId() {
        return contractId;
    }

    public void setContractId(int contractId) {
        this.contractId = contractId;
    }

    public String getContractStartDate() {
        return contractStartDate;
    }

    public void setContractStartDate(String contractStartDate) {
        this.contractStartDate = contractStartDate;
    }

    public String getContractEndDate() {
        return contractEndDate;
    }

    public void setContractEndDate(String contractEndDate) {
        this.contractEndDate = contractEndDate;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public double getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(double totalMoney) {
        this.totalMoney = totalMoney;
    }

    public Employee getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Employee employeeId) {
        this.employeeId = employeeId;
    }

    public Customer getCustomersId() {
        return customersId;
    }

    public void setCustomersId(Customer customersId) {
        this.customersId = customersId;
    }

    public Service getServiceId() {
        return serviceId;
    }

    public void setServiceId(Service serviceId) {
        this.serviceId = serviceId;
    }
}
