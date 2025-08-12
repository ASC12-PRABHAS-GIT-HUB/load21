package com.demo.controller;

import com.demo.repository.EmployeeRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class EmployeeController {
    @GetMapping
    public String getHTMLContent(){
        String htmlOutput= "<html><head><title>Welcome</title></head><body><h1 style =\"color:green\"> Rest" +
                " api can also expose HTML Dara</h1></body></html>";
        return htmlOutput;
    }
    public static class Employee{
        private int id;
        private String name;

        public Employee(int id,String name){
            this.id=id;
            this.name=name;
        }

        public int getId(){return id;}
        public void setId(int id){this.id=id;}
        public String getName(){return name;}
        public void setName(String name){this.name=name;}
    }

    @GetMapping("/g" +
            "    @GetMapping("/getEmployeesAsMap")
    public Map<Integer,Employee> getEmplyoeeAsMap(){
        Map<Integer,Employee> employeeMap= new HashMap<>();
        employeeMap.put(1,new Employee(1,"alice"));
        employeeMap.put(2,new Employee(2,"bob"));
        employeeMap.put(3,new Employee(3,"charlie"));
        return employeeMap;
    }

}
