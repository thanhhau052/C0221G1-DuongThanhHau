package com.example.model.service.impl.contract_impl;

import com.example.model.entity.contract.AttachService;
import com.example.model.repository.contract_repository.IAttachServiceRepository;
import com.example.model.service.interface_service.contract_service.IAttachServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class AttachServiceImpl  implements IAttachServiceService {
    @Autowired
    private IAttachServiceRepository iAttachServiceRepository;
    @Override
    public Iterable<AttachService> findAll() {
        return iAttachServiceRepository.findAll();
    }

    @Override
    public Optional<AttachService> findById(Integer id) {
        return iAttachServiceRepository.findById(id);
    }

    @Override
    public void save(AttachService attachService) {
        iAttachServiceRepository.save(attachService);
    }

    @Override
    public void remove(Integer id) {
        iAttachServiceRepository.deleteById(id);
    }
}
