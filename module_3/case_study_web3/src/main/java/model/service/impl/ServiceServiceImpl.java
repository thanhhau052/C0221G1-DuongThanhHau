package model.service.impl;

import model.bean.service.RentType;
import model.bean.service.Service;
import model.bean.service.ServiceType;
import model.repository.ServiceRepository;
import model.service.IService;

import java.util.List;

public class ServiceServiceImpl implements IService<Service> {
    ServiceRepository serviceRepository =new ServiceRepository();
    @Override
    public List<Service> findAll() {
        return serviceRepository.findAll();
    }

    @Override
    public Service findById(int id) {
        return null;
    }


    @Override
    public List findByName(String name) {
        return null;
    }


    @Override
    public boolean update(int id, Service service) {
        return false;
    }


    @Override
    public boolean remove(int id) {
        return false;
    }
    public boolean save(Service service) {
        return serviceRepository.insert(service);
    }
    public List<ServiceType> findAllServiceType() {
        return serviceRepository.findAllServiceType();
    }

    public List<RentType> findAllRentType() {
        return serviceRepository.findAllRentType();
    }
}
