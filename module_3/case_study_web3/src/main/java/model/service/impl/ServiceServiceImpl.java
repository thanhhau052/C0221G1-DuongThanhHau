package model.service.impl;

import model.bean.service.RentType;
import model.bean.service.Service;
import model.bean.service.ServiceType;
import model.repository.ServiceRepository;
import model.service.IService;

import java.util.List;

public class ServiceServiceImpl implements IService {
    ServiceRepository serviceRepository =new ServiceRepository();
    @Override
    public List<Service> findAll() {
        return null;
    }

    @Override
    public Object findById(int id) {
        return null;
    }

    @Override
    public List findByName(String name) {
        return null;
    }

    @Override
    public boolean save(Object o) {
        return false;
    }

    @Override
    public boolean update(int id, Object o) {
        return false;
    }

    @Override
    public boolean remove(int id) {
        return false;
    }

    public List<ServiceType> findAllServiceType() {
        return serviceRepository.findAllServiceType();
    }

    public List<RentType> findAllRentType() {
        return serviceRepository.findAllRentType();
    }
}
