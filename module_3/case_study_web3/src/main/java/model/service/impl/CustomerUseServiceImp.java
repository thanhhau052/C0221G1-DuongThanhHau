//package model.service.impl;
//
//
//import model.bean.view_customer.CustomerUserService;
//import model.repository.CustomerUseServiceRepository;
//import model.service.IService;
//
//import java.util.List;
//
//public class CustomerUseServiceImp implements IService<CustomerUserService> {
//    CustomerUseServiceRepository customerUseServiceRepository=new CustomerUseServiceRepository();
//
//    @Override
//    public List<CustomerUserService> findAll() {
//        return customerUseServiceRepository.listCustomerUseService();
//    }
//    @Override
//    public List<AmountOfServicesIncluded> selectAmount() {
//        return customerUseServiceRepository.listAmount();
//
//    }
//    @Override
//    public List<CustomerUseService> search(String search) {
//        return customerUseServiceRepository.search(search);
//    }
//    @Override
//    public boolean remove(int id) {
//        return customerUseServiceRepository.delete(id);
//    }
//    @Override
//    public void save(CustomerUseService customerUseService) {
//
//    }
//
//    @Override
//    public CustomerUseService findById(int id) {
//        return null;
//    }
//
//    @Override
//    public boolean update(CustomerUseService customerUseService) {
//        return false;
//    }
//
//
//
//
//
//    @Override
//    public List<ServiceType> select() {
//        return null;
//    }
//
//    @Override
//    public List<CustomerType> selectCustomerType() {
//        return null;
//    }
//
//    @Override
//    public List<Position> selectPosition() {
//        return null;
//    }
//
//    @Override
//    public List<Division> selectDivision() {
//        return null;
//    }
//
//    @Override
//    public List<EducationDegree> selectEducationDegree() {
//        return null;
//    }
//
//    @Override
//    public List<RentType> selectRentType() {
//        return null;
//    }
//
//    @Override
//    public List<AttachService> selectAttachService() {
//        return null;
//    }
//
//
//}