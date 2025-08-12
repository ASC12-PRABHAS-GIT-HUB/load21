package com.demo.service;

import com.demo.entity.DostEntity;
import com.demo.repo.Dostrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
@Service
public class DostServiceImpl implements DostService {

    private final Dostrepo dostrepo;
    @Autowired
    public DostServiceImpl(Dostrepo dostrepo) {
        this.dostrepo = dostrepo;
    }

    @Override
    public DostEntity addDost(DostEntity dostEntity) {
        return dostrepo.save(dostEntity);
    }

    @Override
    public DostEntity getDost(Long id) {
        return dostrepo.findById(id).get();
    }

    @Override
    public DostEntity updateDost(Long id, DostEntity nayaDost) {
        DostEntity dostEntity=dostrepo.getById(id);
        dostEntity.setFirstName(nayaDost.getFirstName());
        dostEntity.setLastName(nayaDost.getLastName());
        dostEntity.setAge(nayaDost.getAge());
        dostEntity.setEmail(nayaDost.getEmail());

        return dostrepo.save(dostEntity);
    }

    @Override
    public void deleteDost(Long id) {
         dostrepo.deleteById(id);

    }

    @Override
    public List<DostEntity> getAllDost() {
        return dostrepo.findAll();
    }


}
