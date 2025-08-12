package com.demo.controller;

import com.demo.entity.DostEntity;
import com.demo.service.DostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dost")
public class DostController {

    private final DostService dostService;
    @Autowired
    public DostController(DostService dostService) {
        this.dostService = dostService;
    }

    @GetMapping("/all")
    List<DostEntity> getAllDost(){
        return dostService.getAllDost();
    }

    @PostMapping("/addDost")
    DostEntity addDost(@RequestBody DostEntity dost){
        return dostService.addDost(dost);

    }

    @DeleteMapping("/delete{id}")
    void deleteDost(@PathVariable Long id){
        dostService.deleteDost(id);
    }


    @PutMapping("/update{id}")
    DostEntity updateDost(@PathVariable Long id,@RequestBody DostEntity updateDost){
        return dostService.updateDost(id,updateDost);
    }
}
