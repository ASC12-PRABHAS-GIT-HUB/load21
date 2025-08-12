package com.demo.service;

import com.demo.entity.DostEntity;

import java.util.List;

public interface DostService {
    DostEntity addDost(DostEntity dostEntity);
    DostEntity getDost(Long id);
    DostEntity updateDost(Long id,DostEntity nayaDost);
    void deleteDost(Long id);
    List<DostEntity> getAllDost();
}
