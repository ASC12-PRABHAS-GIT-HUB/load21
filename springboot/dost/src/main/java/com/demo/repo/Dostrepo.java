package com.demo.repo;

import com.demo.entity.DostEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Dostrepo extends JpaRepository<DostEntity,Long> {
}
